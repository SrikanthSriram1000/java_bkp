package com.example.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceClass implements Runnable {

	
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 4; i++) {
			executor.execute(new ExecutorServiceClass());
		}

	}

	@Override
	public void run() {
		System.out.println("runing with thread "+Thread.currentThread().getName());
	}

}
