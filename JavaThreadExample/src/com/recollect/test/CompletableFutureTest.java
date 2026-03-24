package com.recollect.test;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {

	public static void main(String[] args) throws InterruptedException {

		CompletableFuture<Void> c=CompletableFuture.runAsync(()->{
		System.out.println("in run method");
		}
		);
		//c.get();
		Thread.sleep(1000);
		
	}

}
