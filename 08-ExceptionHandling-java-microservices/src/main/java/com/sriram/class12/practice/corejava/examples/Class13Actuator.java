package com.sriram.class12.practice.corejava.examples;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Class13Actuator {
	@GetMapping("/getDate")
	public Date getDate() {
		return new Date();
	}
}
