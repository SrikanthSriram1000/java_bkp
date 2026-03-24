package com.recollect.test;

public class ThreadEx {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		//thread1.setPriority(Thread.MIN_PRIORITY);
		//thread2.setPriority(Thread.MAX_PRIORITY);
		Thread t1 = new Thread(thread1);
		t1.start();
		thread2.start();
	}

}
