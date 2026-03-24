package com.sriram.class09.practice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.sriram.class09.practice.controller.Passenger;
import com.sriram.class09.practice.controller.Ticket;

@Service
public class TicketBookingServiceImpl implements ITicketBookingService {

	Map<Integer, Ticket> map = new HashMap<Integer, Ticket>();
	private Integer ticketNumber = 1;

	@Override
	public Map<Integer, Ticket> bookTicket(Passenger passenger) {
		Ticket ticket = new Ticket();
		System.out.println("in TicketBookingServiceImpl");
		BeanUtils.copyProperties(passenger, ticket);
		ticket.setPrice(new Double(123));
		ticket.setStatus("CONFIRMED");
		ticket.setTicketNumber(ticketNumber);
		map.put(ticketNumber, ticket);
		ticketNumber++;
		System.out.println("map values.."+map);
		return map;
	}
	@Override
	public Ticket getTicket(Integer ticketNumber) {
		Ticket ticket = map.get(ticketNumber);
		return ticket;

	}
	 public boolean checkIsogram(int inputString)
	    {
		 if(inputString==1) return true;
		 else return false;
	    }

}
