package com.devglan.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.devglan.example.filter.RequestHeaderFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulgatewayDevglanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulgatewayDevglanApplication.class, args);
	}

	@Bean
	public RequestHeaderFilter requestHeaderFilter() {
		return new RequestHeaderFilter();
	}

}
