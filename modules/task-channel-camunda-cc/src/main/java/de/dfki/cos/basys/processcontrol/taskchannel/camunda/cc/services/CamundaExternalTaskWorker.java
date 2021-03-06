package de.dfki.cos.basys.processcontrol.taskchannel.camunda.cc.services;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.dfki.cos.basys.processcontrol.model.*;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.client.ExternalTaskClient;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CamundaExternalTaskWorker implements ExternalTaskHandler {

	protected int maxRetryCount = 0;
	protected int retryTimeout = 1000;

	@Autowired
	private StreamBridge streamBridge;

	@Autowired
	private ObjectMapper mapper;

	private ExternalTaskService externalTaskService;

	private Map<CharSequence, ExternalTask> externalTasks = new HashMap<>();

	public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
		// the externalTaskService is only created once for all externalTasks. So we store it here the first time.		
		if (this.externalTaskService == null) {
			this.externalTaskService = externalTaskService;
		}
			
		ControlComponentRequest request = createControlComponentRequest(externalTask);
		if (request != null) {
			externalTasks.put(request.getCorrelationId(), externalTask);
			log.info("new request arrived for:   {}, correlationId: {}", request.getComponentId(), request.getCorrelationId());
			streamBridge.send("controlComponentRequests", request);
		}
	}

	protected ControlComponentRequest createControlComponentRequest(ExternalTask externalTask) {
		ControlComponentRequest r = new ControlComponentRequest();

		String requestType = externalTask.getVariable("requestType");
		if (requestType == null) {
			externalTaskService.handleFailure(externalTask, "No requestType", "ExternalTask does not contain a requestType", maxRetryCount, retryTimeout);
			return null;
		}

		String componentId = externalTask.getVariable("componentId");
		if (componentId == null) {
			externalTaskService.handleFailure(externalTask, "No componentId", "ExternalTask does not contain a componentId", maxRetryCount, retryTimeout);
			return null;
		}

		String token = externalTask.getVariable("token");
		if (token == null) {
			externalTaskService.handleFailure(externalTask, "No token", "ExternalTask does not contain a token", maxRetryCount, retryTimeout);
			return null;
		}

		switch (requestType) {
			case "ExecutionCommandRequest":
				r.setRequestType(ControlComponentRequestType.EXECUTION_COMMAND_REQUEST);
				r.setCommand(ExecutionCommand.valueOf(token));
				break;
			case "ExecutionModeRequest":
				r.setRequestType(ControlComponentRequestType.EXECUTION_MODE_REQUEST);
				r.setCommand(ExecutionMode.valueOf(token));
				break;
			case "OccupationCommandRequest":
				r.setRequestType(ControlComponentRequestType.OCCUPATION_COMMAND_REQUEST);
				r.setCommand(OccupationCommand.valueOf(token));
				break;
			case "OperationModeRequest":
				r.setRequestType(ControlComponentRequestType.OPERATION_MODE_REQUEST);
				OperationMode opMode = new OperationMode();
				r.setCommand(opMode);

				opMode.setName(token);
				try {

					String input = externalTask.getVariable("inputParameters");
					String output = externalTask.getVariable("outputParameters");

					if (input != null) {
						List<Variable> inputParameters = mapper.readValue(input,new TypeReference<>(){});
						log.debug(inputParameters.toString());
						opMode.setInputParameters(inputParameters);
					}
					if (output != null) {
						List<Variable> outputParameters = mapper.readValue(output,new TypeReference<>(){});
						log.debug(outputParameters.toString());
						opMode.setOutputParameters(outputParameters);
					}

				} catch (JsonParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			default:
				break;
		}

		r.setCorrelationId(externalTask.getId());
		r.setOccupierId(externalTask.getProcessInstanceId());
		r.setComponentId(componentId);

		return r;
	}

	protected void handleComponentResponse(ControlComponentResponse response) {
		log.info("new response arrived from: {}, correlationId: {}", response.getComponentId(), response.getCorrelationId());
		ExternalTask externalTask = externalTasks.remove(response.getRequest().getCorrelationId());
		if (externalTask != null) {
			if (response.getStatus() == RequestStatus.OK) {
				if (response.getOutputParameters().size() > 0) {
					Map<String, Object> variables = new HashMap<>();
					for (Variable var : response.getOutputParameters()) {
						variables.put(var.getName().toString(), var.getValue());
					}
					externalTaskService.complete(externalTask, variables);
				} else {

					externalTaskService.complete(externalTask);
				}
			} else {
				externalTaskService.handleFailure(externalTask, response.getMessage().toString(), "", maxRetryCount, retryTimeout);
			}
		} else {
			//do nothing; this worker instance has not issued that control component request
		}
	}

	@Bean
	public Consumer<ControlComponentResponse> controlComponentResponses() {
		return this::handleComponentResponse;
	}

}
