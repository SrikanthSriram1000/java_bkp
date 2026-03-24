package com.example.threads.practical.code;

public class HDFCBank {
	int accountBalance;

	public HDFCBank(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	synchronized public void withdraw(int withDrawAmt) throws InterruptedException {
		System.out.println("account balance  =" + accountBalance);
		System.out.println("withDrawAmt amount =" + withDrawAmt);
		if (accountBalance < withDrawAmt) {
			System.out.println("**** amount is less so wait for deposit the amount *****");
			wait();
		}
		accountBalance = this.accountBalance - withDrawAmt;
		System.out.println("Current balance  =" + accountBalance);

	}

	synchronized public void deposit(int depositAmt) throws InterruptedException {
		accountBalance = this.accountBalance + depositAmt;
		System.out.println("After deposit total amount  =" + accountBalance);
		notify();

	}
}
