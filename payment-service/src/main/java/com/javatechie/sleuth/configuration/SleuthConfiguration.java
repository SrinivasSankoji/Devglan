package com.javatechie.sleuth.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@Configuration
public class SleuthConfiguration {
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}

	@Bean
	public Sampler defaultSampler() {
		return  Sampler.ALWAYS_SAMPLE;
	}

}
