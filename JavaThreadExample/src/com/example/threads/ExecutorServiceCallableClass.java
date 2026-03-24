package com.example.threads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceCallableClass implements Callable<Object> {

	
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		List l = new ArrayList();
		for (int i = 0; i < 4; i++) {
			Future f=executor.submit(new ExecutorServiceCallableClass());
			l.add(f);
		}
		Thread.sleep(1000);
		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			Future future = (Future) iterator.next();
			System.out.println(future.isDone());
			
		}

	}

	 

	@Override
	public Object call() throws Exception {
		System.out.println("in call()    "+Thread.currentThread().getName());
		return null;
	}

}
