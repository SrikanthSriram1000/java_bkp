package com.example.threads.practical.code;

public class gPayThread extends Thread {

	HDFCBank hdfcBank;

	public gPayThread(HDFCBank hdfcBank) {
		this.hdfcBank = hdfcBank;
	}

	@Override
	public void run() {
		try {
			hdfcBank.deposit(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
