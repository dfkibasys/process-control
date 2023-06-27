package de.dfki.cos.basys.processcontrol.taskchannel.mqtt.cc.services;

import java.util.function.Function;

import javax.annotation.PostConstruct;

import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.dfki.cos.basys.processcontrol.taskchannel.mqtt.cc.configuration.MqttToKafkaBridgeConfigurationProperties;
import de.dfki.cos.basys.processcontrol.taskchannel.mqtt.cc.configuration.MqttToKafkaRouteConfigurationProperties;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MqttToKafkaBridgeService implements ApplicationContextAware {

	@Autowired
	private IMqttClient mqttClient;

	@Autowired
	private StreamBridge streamBridge;

	@Autowired
	private ObjectMapper mapper;

	@Autowired
	private MqttToKafkaBridgeConfigurationProperties config;

	private ApplicationContext applicationContext;

	@PostConstruct
	public void postConstruct() {
		config.getRoutes().forEach(this::subscribeRoutes);
	}

	private void subscribeRoutes(String binding, MqttToKafkaRouteConfigurationProperties route) {
		log.info("creating route {}: {}", binding, route.getSource());
		try {
			Function<String, Object> transformer = applicationContext.getBean(route.getTransformerService(),
					Function.class);

			mqttClient.subscribe(route.getSource(), (topic, mqttMessage) -> {
				try {
					onMessageReceived(binding, transformer, topic, mqttMessage);
				} catch (Exception e) {
					log.error(e.toString());
				}
			});
		} catch (MqttException e) {
			log.error("ERROR", e);
		}
	}
	
	private void onMessageReceived(String binding, Function<String, Object> transformer, String topic, MqttMessage mqttMessage) {
		log.info("message received on topic {}", topic);
		if (log.isDebugEnabled()) {
			log.debug(mqttMessage.toString());
		}

		log.info("transforming message with {}", transformer.getClass());
		Object result = transformer.apply(mqttMessage.toString());
		if (result != null) {
			if (log.isDebugEnabled()) {
				log.debug(result.toString());
			}
			streamBridge.send(binding, result);
		} else {
			log.warn("could not send to kafka, transformed message is null");
		}	
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}