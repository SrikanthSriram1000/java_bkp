package com.test.completablefuture;

import java.util.concurrent.*;

public class FastestServiceResponse {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		// Example usage:
		// String fastestResponse = getFastestResponse().get();
		Void allResponse = getAllResponse().get();
		// System.out.println("Fastest response received: " + fastestResponse);
		Thread.sleep(5000);
		System.out.println("allResponse response received: " + allResponse);
	}

	/**
	 * Calls three services and returns a Future for the fastest response.
	 */
	public static CompletableFuture<String> getFastestResponse() {
		ExecutorService executor = Executors.newCachedThreadPool();

		// 1. Create CompletableFuture instances for each service call
		CompletableFuture<String> service1 = CompletableFuture.supplyAsync(() -> {
			simulateWork(800); // Service 1 takes 0.8 seconds
			return "Response from Service 1";
		}, executor);

		CompletableFuture<String> service2 = CompletableFuture.supplyAsync(() -> {
			simulateWork(200); // Service 2 takes 0.2 seconds (should be fastest)
			return "Response from Service 2";
		}, executor);

		CompletableFuture<String> service3 = CompletableFuture.supplyAsync(() -> {
			simulateWork(500); // Service 3 takes 0.5 seconds
			return "Response from Service 3";
		}, executor);

		// 2. Use anyOf to get a Future that completes with the first result
		CompletableFuture<Object> anyOfFuture = CompletableFuture.anyOf(service1, service2, service3);

		// 3. Chain a transformation to cast the result to the desired type (String)
		// Note: The result of anyOf() is Object, so explicit casting is needed.
		CompletableFuture<String> resultFuture = anyOfFuture.thenApply(response -> {
			executor.shutdown(); // Optional: Shutdown executor when done
			return (String) response;
		});

		return resultFuture;
	}

	public static CompletableFuture<Void> getAllResponse() {
		ExecutorService executor = Executors.newCachedThreadPool();

		// 1. Create CompletableFuture instances for each service call
		CompletableFuture<String> service1 = CompletableFuture.supplyAsync(() -> {
			simulateWork(800); // Service 1 takes 0.8 seconds
			return "Response from Service 1";
		}, executor);

		CompletableFuture<String> service2 = CompletableFuture.supplyAsync(() -> {
			simulateWork(200); // Service 2 takes 0.2 seconds (should be fastest)
			return "Response from Service 2";
		}, executor);

		CompletableFuture<String> service3 = CompletableFuture.supplyAsync(() -> {
			simulateWork(500); // Service 3 takes 0.5 seconds
			System.out.println(Thread.currentThread().getName());
			return "Response from Service 3";
		});

		// 2. Use allOf to get a Future that completes when all services are done
		CompletableFuture<Void> allOfFuture = CompletableFuture.allOf(service1, service2, service3);

		allOfFuture.thenRun(() -> {
			try {
				String result1 = service1.get();
				String result2 = service2.get();
				String result3 = service3.get();
				System.out.println("All tasks completed:");
				System.out.println(result1);
				System.out.println(result2);
				System.out.println(result3);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		// Block the main thread until all futures are complete
		allOfFuture.join();

		return allOfFuture;
	}

	/**
	 * Helper method to simulate a service call with a delay.
	 */
	private static void simulateWork(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
