package com.ng.eureka.userclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class EurekaUserclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaUserclientApplication.class, args);
	}
}
