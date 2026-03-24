package com.sriram.class09.practice.controller;

public interface ITicketBookingService {
	public String bookTicketViaRestTemplate(Passenger passenger);
	public String bookTicketViaWebClient(Passenger passenger);

}
