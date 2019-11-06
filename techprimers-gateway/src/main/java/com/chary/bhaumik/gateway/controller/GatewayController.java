package com.chary.bhaumik.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController 
{
	@RequestMapping("/countryFallBack")
	public String countryFallback()
	{
		return "Country FallBack";
		
	}
	
	@RequestMapping("/jokeFallBack")
	public String jokeFallback()
	{
		return "Joke FallBack";
		
	}
}
