package com.chary.bhaumik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController 
{
	@GetMapping("/demo")
    public String Demo()
	{
        return "demo";
    }
}
