package com.get.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
public class GetEndpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetEndpointApplication.class, args);
	}

}

