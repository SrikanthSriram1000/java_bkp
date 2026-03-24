package com.test.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SbMicroserviceTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(SbMicroserviceTest1Application.class, args);
	}

}
