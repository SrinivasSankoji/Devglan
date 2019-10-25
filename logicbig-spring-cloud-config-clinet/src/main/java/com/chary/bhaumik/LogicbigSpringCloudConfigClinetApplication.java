package com.chary.bhaumik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LogicbigSpringCloudConfigClinetApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogicbigSpringCloudConfigClinetApplication.class, args);
	}

}
