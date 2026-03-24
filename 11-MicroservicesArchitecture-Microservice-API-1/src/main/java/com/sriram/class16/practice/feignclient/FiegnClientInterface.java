package com.sriram.class16.practice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GREET-API")
@Service
public interface FiegnClientInterface {
	
	@GetMapping("/greet")
	public String getGreetMsg();

}
