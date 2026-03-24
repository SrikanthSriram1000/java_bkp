package com.test.RTvsFCvsWC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients	
public class ResttemplateVsFeignClientVsWebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResttemplateVsFeignClientVsWebClientApplication.class, args);
		
	}

}
