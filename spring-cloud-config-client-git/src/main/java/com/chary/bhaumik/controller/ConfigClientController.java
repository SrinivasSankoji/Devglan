package com.chary.bhaumik.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController 
{
	//@Value("${test.property}")
   // private String testProperty;

    @Value("${test.local.property}")
    private String localTestProperty;

    @GetMapping("/gitrepo")
    public String test() 
    {
        return localTestProperty;
    }
}
