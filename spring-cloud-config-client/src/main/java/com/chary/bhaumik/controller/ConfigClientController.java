package com.chary.bhaumik.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController 
{
	@Value("${test.property}")
    private String testProperty;

    @Value("${test.local.property}")
    private String localTestProperty;

    @RequestMapping("/")
    public String test() 
    {
        StringBuilder builder = new StringBuilder();
        builder.append("test property - ").append(testProperty).append(" ")
        .append("local property - ").append(localTestProperty);
        return builder.toString();
    }
}
