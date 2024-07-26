package com.chary.bhaumik.configuration.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties("db")
@Data
@Component
public class DbDetails 
{
	private String driver;
	private String username;
	private String password;
}
