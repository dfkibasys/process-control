package de.dfki.cos.basys.processcontrol.scalemanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class ScaleManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaleManagementServiceApplication.class, args);
	}

}