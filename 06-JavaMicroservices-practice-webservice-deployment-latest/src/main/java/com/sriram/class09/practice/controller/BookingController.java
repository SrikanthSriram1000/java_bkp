package com.sriram.class09.practice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sriram.class09.practice.service.ITicketBookingService;

@RestController
public class BookingController {
	@Autowired
	ITicketBookingService bookingService;

	@GetMapping("/getTickets/{id}")
	public Ticket getTicket(@PathVariable Integer id) {
		Ticket ticket=bookingService.getTicket(id);
		return ticket;
	}

	@PostMapping("/bookTicket")
	public String bookTicket(@RequestBody Passenger passenger) {
		System.out.println("in controller checking values .."+passenger.getName());
		Map<Integer, Ticket> map = bookingService.bookTicket(passenger);
		return "Ticket Booked !";
	}

}
