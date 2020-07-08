package com.chary.bhaumik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@GetMapping("/first")
	public String demo() {
		return "First Service";
	}

	@GetMapping("/getRequestHeader")
	public String getRequestHeader(@RequestHeader("X-source") String source) {
		return "First service with " + source;
	}

}
