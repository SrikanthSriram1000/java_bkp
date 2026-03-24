package com.sriram.class16.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sriram.class16.practice.feignclient.FiegnClientInterface;

@RestController
public class WelcomeController {
	@Autowired
	FiegnClientInterface fiegnClientInterface;
	
	@GetMapping("/welcome")
	public String welcome() {
		/*RestTemplate restTemplate= new RestTemplate();
		ResponseEntity<String> responseEntity=null;
		responseEntity=restTemplate.getForEntity("http://localhost:8081/greet", String.class);
		String greetResp=responseEntity.getBody();*/
		//or
		System.out.println("in welcome controller");
		String greetResp =fiegnClientInterface.getGreetMsg();
		
		
		return greetResp +", welcome to the world!";
	}

}
