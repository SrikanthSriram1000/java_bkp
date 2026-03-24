package com.example.threads.practical.code;

public class AtmThread extends Thread {
	HDFCBank hdfcBank;

	public AtmThread(HDFCBank hdfcBank) {
		this.hdfcBank = hdfcBank;
	}

	@Override
	public void run() {
		try {
			hdfcBank.withdraw(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
