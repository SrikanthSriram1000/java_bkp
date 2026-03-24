package com.sriram.class09.practice.service;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.sriram.class09.practice.controller.Passenger;
import com.sriram.class09.practice.controller.Ticket;

@Component
public interface ITicketBookingService {
	public Map<Integer, Ticket>  bookTicket(Passenger book);

	Ticket getTicket(Integer ticketNumber);

}
