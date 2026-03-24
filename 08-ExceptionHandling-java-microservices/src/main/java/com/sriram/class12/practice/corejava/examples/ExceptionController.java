package com.sriram.class12.practice.corejava.examples;

import java.time.LocalDateTime;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAspectJAutoProxy	
public class ExceptionController {

	@GetMapping("/hello")
	public String hello() {
		int i = 1 / 0;
		return "Hello World !";
	}

	@GetMapping("/hello1")
	public String hello1() {
		String s = null;
		s.toLowerCase();
		return "Hello World !";
	}

	@GetMapping("/success")
	public ResponseEntity<ErrorCode> sucessCase() {
		System.out.println("this method is for aop concepts...");
		ErrorCode code = new ErrorCode();
		code.setErrorCode("001");
		code.setErrorMsg("error msg");
		code.setWhen(LocalDateTime.now());
		return new ResponseEntity<>(code,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
