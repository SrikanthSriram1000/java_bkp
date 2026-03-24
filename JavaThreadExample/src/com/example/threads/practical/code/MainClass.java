package com.example.threads.practical.code;

public class MainClass {

	public static void main(String[] args) {
		HDFCBank hdfcBank = new HDFCBank(9000);
//		hdfcBank.withdraw(1000);
//		hdfcBank.deposit(3000);
		AtmThread atm = new AtmThread(hdfcBank);
		atm.setName("atm thread");
		gPayThread gPayThread = new gPayThread(hdfcBank);
		gPayThread.setName("gpayThread");
		gPayThread.start();
		atm.start();
		
		//System.out.println(hdfcBank.accountBalance);

	}

}
