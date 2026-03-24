package com.test.RTvsFCvsWC;

import org.springframework.web.client.RestTemplate;

public class RestTemplateCall {
public static void main(String[] args) {
	 RestTemplate restTemplate = new RestTemplate();
     String url = "https://jsonplaceholder.typicode.com/posts/1";
     
     String response = restTemplate.getForObject(url, String.class);
     System.out.println("Response: " + response);	
}
}
