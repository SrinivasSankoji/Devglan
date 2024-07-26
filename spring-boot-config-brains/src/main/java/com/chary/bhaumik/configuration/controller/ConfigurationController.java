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
public class ConfigurationController {
	/**
	 * Reading Value from the Properties File
	 */
	@Value("${test.greeting}")
	private String greetingMesage;

	/**
	 * Assigning default Value to the Variable
	 */
	@Value("Welcome Bhaumik Chary")
	private String message;

	/**
	 * Assigning default value to the Variable and If the Property does not exist.
	 */
	@Value("${message:Welcome Bhaumik Sankoji}")
	private String defaultMessage;

	/**
	 * Reading the properties as List
	 */
	@Value("${test.names}")
	private List<String> names;

	/**
	 * Reading the properties as Map
	 */
	@Value("#{${test.dbdetails}}")
	private Map<String, String> dbdetails;

	@Autowired
	DbDetails dbDetailsModel;

	@Autowired
	Environment env;

	@GetMapping("/dbDetails")
	public Map<String, String> getGreeting() {
		return dbdetails;
	}

	@GetMapping("/envDetails")
	public String[] getEnvDetails() {
		return env.getActiveProfiles();
	}

	@GetMapping("/messageDetails")
	public String getMessageDetails() {
		return message;
	}

	@GetMapping("/nameList")
	public List<String> getNameList() {
		return names;
	}

}
