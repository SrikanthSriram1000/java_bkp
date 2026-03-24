package com.sriram.class09.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketBookingController {

	@Autowired
	TicketBookingServiceImpl bookingServiceImpl;
	
	@PostMapping("/bookTicket")
	public String bookTicket(@RequestBody Passenger passenger) {
		System.out.println("in book service");
		return bookingServiceImpl.bookTicketViaWebClient(passenger);
	}
}
