package com.test.RTvsFCvsWC;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;
public class WebClientCall {
	public static void main(String[] args) {
		WebClient webClient = WebClient.create("https://jsonplaceholder.typicode.com");

		Mono<String> responseMono = webClient.get().uri("/posts/1").retrieve().bodyToMono(String.class);
		System.out.println("responseMono  "+responseMono.block());
		responseMono.subscribe(response -> System.out.println("Response: " + response));	
	}	
}
