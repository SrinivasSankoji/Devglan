package com.chary.bhaumik.config.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ClientBean 
{
	@Value("${test.greeting}")
	private String msg1;

	//@Value("${test.msg}")
	//private String msg2;

}
