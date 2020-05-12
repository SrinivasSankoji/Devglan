package com.chary.bhaumik.configuration.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@ConfigurationProperties("db")
@Data
@Configuration
public class DbDetails 
{
	private String driver;
	private String username;
	private String password;
}
