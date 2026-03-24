package com.sriram.class09.practice.controller;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class TicketBookingServiceImpl implements ITicketBookingService {

	private String BOOK_TICKET_URL = "http://localhost:8081/bookTicket";
	@Autowired
	RestTemplate restTemplate;

	@Override
	public String bookTicketViaRestTemplate(Passenger passenger) {
		HttpEntity<Passenger> entity = new HttpEntity<Passenger>(passenger);
		System.out.println("entity ..."+entity);
		String response= restTemplate.exchange(
				BOOK_TICKET_URL,
				HttpMethod.POST, entity, String.class).
				getBody();
		System.out.println("response from aws service ..."+response);
		return response;
	}
	@Override
	public String bookTicketViaWebClient(Passenger passenger) {
		System.out.println("in webclinet method call");
		WebClient client=WebClient.create();
		String response=client.post()
		.uri(BOOK_TICKET_URL)
		.bodyValue(passenger)
		.retrieve()
		.bodyToMono(String.class)
		.block();
		
		System.out.println("response from webclinet service ..."+response);
		return response;
	}

}
