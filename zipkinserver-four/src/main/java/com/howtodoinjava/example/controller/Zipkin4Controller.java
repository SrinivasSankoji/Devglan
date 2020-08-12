package com.howtodoinjava.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Zipkin4Controller {

	private static final Logger log = LoggerFactory.getLogger(Zipkin4Controller.class); 
	
    @GetMapping(value="/zipkin4")
    public String zipkinService1() 
    {
    	log.info("Zipkin4 service called....");
         String response = "Success";
         log.info("Zipkin4 service Response {}",response);
        return "Hi..."+response;
    }
}
