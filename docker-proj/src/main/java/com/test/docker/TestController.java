package com.test.docker;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;


@RestController
@RequestMapping("/api")	
public class TestController {
	//logger using slf4j
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);			
	
	@RequestMapping("/hello")
	public String hello() {
		logger.debug("debug:Hello endpoint was called");
		logger.info("info:Returning greeting message");
		logger.warn("warn:This is a warning message");
		return "Hello, Docker!";
	}

}
