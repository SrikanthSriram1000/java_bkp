package com.example.threads;

public class ThreadExtendsThread extends Thread{

	public static void main(String[] args) {
		ThreadExtendsThread t1= new ThreadExtendsThread();
		t1.setName("TestSampleThread");
		t1.start();
		t1.start();

	}
	@Override
	public void run() {
		System.out.println("in run");
	}

}
