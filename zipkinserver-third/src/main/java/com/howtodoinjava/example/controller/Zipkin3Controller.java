package com.howtodoinjava.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Zipkin3Controller {

	private static final Logger log = LoggerFactory.getLogger(Zipkin3Controller.class); 
	
	@Autowired
	RestTemplate restTemplate;
	 
    @GetMapping(value="/zipkin3")
    public String zipkinService1() 
    {
    	log.info("Zipkin3 service called....");
         String response = (String) restTemplate.exchange("http://localhost:2604/zipkin4", 
                        HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}).getBody();
         log.info("Zipkin3 service Response {}",response);
        return "Hi..."+response;
    }
}
