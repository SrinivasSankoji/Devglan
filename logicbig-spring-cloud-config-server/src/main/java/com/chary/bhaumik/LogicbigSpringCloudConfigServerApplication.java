package com.chary.bhaumik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
@EnableAutoConfiguration
public class LogicbigSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogicbigSpringCloudConfigServerApplication.class, args);
	}

}
