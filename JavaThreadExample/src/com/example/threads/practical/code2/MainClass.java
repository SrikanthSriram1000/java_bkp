package com.example.threads.practical.code2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MainClass {
	int accountBalance=1000;
	ReentrantReadWriteLock l = new ReentrantReadWriteLock();
	public static void main(String[] args) {
		MainClass obj= new MainClass();
		Thread t1= new Thread(()->obj.withdraw(12000));
		Thread t2= new Thread(()->obj.deposit(2000));
		Thread t3= new Thread(()->obj.balanceCheckFromUPI());
		Thread t4= new Thread(()->obj.balanceCheckFromNetBanking());
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
	
	
	public void withdraw(int withDrawAmt)  {
		l.writeLock().lock();
		System.out.println("account balance  =" + accountBalance);
		System.out.println("withDrawAmt amount =" + withDrawAmt);
		if (accountBalance < withDrawAmt) {
			System.out.println("**** amount is less so wait for deposit the amount *****");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		accountBalance = this.accountBalance - withDrawAmt;
		System.out.println("Current balance  =" + accountBalance);
		l.writeLock().unlock();

	}

	public void deposit(int depositAmt) {
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
