package com.sriram.class12.practice.corejava.examples;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice	
public class ExceptionHandler {
	@org.springframework.web.bind.annotation.ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<ErrorCode> handleArithmeticException(ArithmeticException exc){
		System.out.println("in handleArithmeticException method");
		ErrorCode code = new ErrorCode();
		code.setErrorCode("001");
		code.setErrorMsg(exc.getMessage());
		code.setWhen(LocalDateTime.now());
		return new ResponseEntity<>(code,HttpStatus.BAD_REQUEST);
		
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorCode> handleException(Exception exc){
		System.out.println("in handleException method");
		ErrorCode code = new ErrorCode();
		code.setErrorCode("001");
		code.setErrorMsg(exc.getMessage());
		code.setWhen(LocalDateTime.now());
		return new ResponseEntity<>(code,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
