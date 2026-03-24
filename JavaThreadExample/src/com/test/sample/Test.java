package com.test.sample;

public class Test {
	public static int i = 100;

	public static void main(String[] args) {
		i = 200;
		System.out.println(i);
		Thread1 thread1 = new Thread1();
		thread1.start();

	}

}
