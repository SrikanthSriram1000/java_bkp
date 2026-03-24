package com.test.sb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
private static final Logger logger = LogManager.getLogger(HelloController.class);
	
@Autowired
MyService myService;
	@GetMapping("/helloMsg")
	public String test() {
		logger.info("info logger");
		logger.info("debug logger");
		//throw new RemoteServiceException("Remote service is not available");
		myService.callExternalApi();
		return "booooosssss";
	}
	
}
