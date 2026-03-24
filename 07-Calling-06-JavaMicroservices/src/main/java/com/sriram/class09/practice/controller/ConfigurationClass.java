package com.sriram.class09.practice.controller;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigurationClass {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
