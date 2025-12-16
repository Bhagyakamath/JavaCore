package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FirstrestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstrestserviceApplication.class, args);
	}
	
	@Bean
	public RestTemplate f1() {
		return new RestTemplate();
	}

}
