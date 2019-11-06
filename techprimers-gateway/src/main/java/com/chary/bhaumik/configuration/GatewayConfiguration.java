package com.chary.bhaumik.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableHystrix
@Configuration
public class GatewayConfiguration 
{
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
	    return builder.routes()
	    	.route(p -> p
	    		  .path("/all")
	    		  .filters(filter -> 
	    		   filter.addRequestHeader("x-rapidapi-host", "restcountries-v1.p.rapidapi.com")
				  .addRequestHeader("x-rapidapi-key", "5ba642b42amsh7803622e5b3d9c3p10efc2jsnf017054a699e")
				  .hystrix(config -> config.setName("countries-Service")
						  .setFallbackUri("forward:/countryFallBack")))
	    		  .uri("https://restcountries-v1.p.rapidapi.com"))	
	    	.route(p -> p
		    		  .path("/v1/joke")
		    		  .filters(filter -> 
		    		   filter.addRequestHeader("x-rapidapi-host", "joke3.p.rapidapi.com")
					  .addRequestHeader("x-rapidapi-key", "5ba642b42amsh7803622e5b3d9c3p10efc2jsnf017054a699e")
					  .hystrix(config -> config.setName("Jokes-Service")
							  .setFallbackUri("forward:/jokeFallBack")))
		    		  .uri("https://joke3.p.rapidapi.com"))
	        .route(p -> p
	            .path("/get")
	            .filters(f -> f.addRequestHeader("Hello", "World"))
	            .uri("http://httpbin.org:80"))
	        .route(p -> p
	            .host("*.hystrix.com")
	            .filters(f -> f.hystrix(config -> config.setName("mycmd")))
	            .uri("http://httpbin.org:80")).
	        build();
	}
}
