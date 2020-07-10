package com.devglan.example.second.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController 
{
	@GetMapping("/test")
    public String test()
	{
        return "Second Service 2";
    }
	
	@GetMapping("/getRequestHeader")
    public String getRequestHeader(@RequestHeader("X-second-Header") String headerValue){
        return headerValue;
    }
}
