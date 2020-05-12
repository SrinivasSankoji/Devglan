package com.chary.bhaumik.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chary.bhaumik.config.model.ClientBean;

@RestController
public class ConfigClientController 
{
	@Autowired
	ClientBean clientBean;

	@GetMapping("/message")
	public String demo() {
		return clientBean.getMsg1();
	}

}
