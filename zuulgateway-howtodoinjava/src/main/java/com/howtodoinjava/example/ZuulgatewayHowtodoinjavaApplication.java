package com.howtodoinjava.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.howtodoinjava.example.gateway.filter.ErrorFilter;
import com.howtodoinjava.example.gateway.filter.PostFilter;
import com.howtodoinjava.example.gateway.filter.PreFilter;
import com.howtodoinjava.example.gateway.filter.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulgatewayHowtodoinjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulgatewayHowtodoinjavaApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
	
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	
	
}
