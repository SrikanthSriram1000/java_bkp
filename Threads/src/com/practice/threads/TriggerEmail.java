package com.practice.threads;

public class TriggerEmail extends Thread {
	Customer c;

	TriggerEmail(Customer c) {
		this.c = c;
	}

	public void run() {
		triggerMail(c);

	}

	public void triggerMail(Customer c) {
		System.out.println("Email Triggered ..!  FOR " + c.getName());
	}

}
