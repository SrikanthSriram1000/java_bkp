package com.test.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MineTesting {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Object obj=extracted();
		System.out.println(obj);

	}

	private static Object extracted() throws InterruptedException, ExecutionException {
		CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "futur1";
		});

		CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return " future2";
		});
		CompletableFuture<Object> anyFuture= CompletableFuture.anyOf(f1,f2);
		return anyFuture.get();
	}
}
