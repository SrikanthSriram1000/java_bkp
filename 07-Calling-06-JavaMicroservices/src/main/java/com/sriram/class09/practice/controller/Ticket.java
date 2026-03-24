package com.sriram.class09.practice.controller;

import lombok.Data;

@Data
public class Ticket {
	private String name;
	private String from;
	private String to;
	private Integer ticketNumber;
	private Double price;
	private String status;
}
