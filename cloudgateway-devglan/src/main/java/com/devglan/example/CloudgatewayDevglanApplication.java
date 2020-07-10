package com.devglan.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudgatewayDevglanApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudgatewayDevglanApplication.class, args);
	}

}
