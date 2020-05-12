package com.chary.bhaumik.configuration.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chary.bhaumik.configuration.model.DbDetails;

@RestController
public class ConfigurationController 
{
	/**
	 * Method One
	 */
	@Value("${test.greeting}")
	private String greetingMesage;
	
	/**
	 * Method Two
	 */
	@Value("Welcome Bhaumik Chary")
	private String message;
	
	/**
	 * Method Three
	 */
	@Value("${message:Welcome Bhaumik Sankoji}")
	private String defaultMessage;
	
	/**
	 * Method Four
	 */
	@Value("${test.names}")
	private List<String> names;
	
	/**
	 * Method Five
	 */
	@Value("#{${test.dbdetails}}")
	private Map<String,String> dbdetails;
	
	@Autowired
	DbDetails dbDetailsModel;
	
	@Autowired
	Environment env;
	
	@GetMapping("/greeting")
	public Map<String,String> getGreeting()
	{
		return dbdetails;
	}
	
	@GetMapping("/envDetails")
	public String[] getEnvDetails()
	{
		return env.getActiveProfiles();
	}

}
