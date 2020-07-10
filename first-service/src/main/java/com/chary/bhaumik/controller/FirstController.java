package com.chary.bhaumik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {
	@GetMapping("/test")
	public String demo() {
		return "First Service";
	}

	@GetMapping("/getRequestHeaderOld")
	public String getRequestHeaderOld(@RequestHeader("X-source") String source) {
		return "First service with " + source;
	}
	
	@GetMapping("/getRequestHeader")
    public String getRequestHeader(@RequestHeader("X-first-Header") String headerValue){
        return headerValue;
    }

}
