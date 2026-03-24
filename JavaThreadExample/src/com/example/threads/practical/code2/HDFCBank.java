package com.example.threads.practical.code2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class HDFCBank extends Thread{
	ReentrantReadWriteLock l = new ReentrantReadWriteLock();
	
	int accountBalance;

	public HDFCBank(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void withdraw(int withDrawAmt) throws InterruptedException {
		l.writeLock().lock();
		System.out.println("account balance  =" + accountBalance);
		System.out.println("withDrawAmt amount =" + withDrawAmt);
		if (accountBalance < withDrawAmt) {
			System.out.println("**** amount is less so wait for deposit the amount *****");
			wait();
		}
		accountBalance = this.accountBalance - withDrawAmt;
		System.out.println("Current balance  =" + accountBalance);
		l.writeLock().unlock();

	}

	public void deposit(int depositAmt) throws InterruptedException {
		l.writeLock().lock();
		accountBalance = this.accountBalance + depositAmt;
		System.out.println("After deposit total amount  =" + accountBalance);
		notify();
		l.writeLock().unlock();

	}
	public void balanceCheckFromUPI() {
		l.readLock().lock();
		System.out.println("in balanceCheckFromUPI");
		l.readLock().unlock();
		
	}
	public void balanceCheckFromNetBanking() {
		l.readLock().lock();
		System.out.println("in balanceCheckFromNetBanking");
		l.readLock().unlock();
		
	}
}
