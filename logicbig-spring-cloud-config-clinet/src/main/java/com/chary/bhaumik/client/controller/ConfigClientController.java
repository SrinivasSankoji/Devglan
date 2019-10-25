package com.chary.bhaumik.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController 
{
	
	  @Value("${greeting}") 
	  private String msg1;
	  
	  @Value("${greeting}") 
	  private String msg2;
	 

	  @GetMapping("/message")
	  public String demo()
	  {
	      return msg1 + msg2;
	     // return "Hello";
	  }

}
