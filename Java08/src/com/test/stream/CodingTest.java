package com.test.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CodingTest {
	public static void main(String[] args) throws InterruptedException {
		String name = "srikanthsriram";
		String[] strArray = name.split("");
		Map<Object, Long> map = Arrays.stream(strArray).sorted()
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		//System.out.println("map =" + map);
		Set set = new HashSet<>();
		
		//while iterating the stream, add each element to the set. If the element is already present in the set,
		//it means it's a duplicate and will be printed.
		//Arrays.stream(strArray).filter(x -> !set.add(x)).forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(99,5, 9, 14, 19, 47, 56, 72);

		ExecutorService es = Executors.newFixedThreadPool(2);
		for (Integer number : numbers) {
			es.submit(() -> {
				if(number%2==0) {
				System.out.println("even Number: " + number + " Thread: " + Thread.currentThread().getName());
				}else {
					System.out.println("odd Number: " + number + " Thread: " + Thread.currentThread().getName());
				}
			});
		}
		ExecutorService es1 = Executors.newFixedThreadPool(2);
		List<Integer> numbers1 = Arrays.asList(99,5, 9, 14, 19, 47, 56, 72);
		CompletableFuture.runAsync(() -> {
			
			for (Integer number1 : numbers1) {
			if(number1%2==0) {
				System.out.println("even Number with completableFuture: " + number1 + " Thread with completableFuture:: " + Thread.currentThread().getName());
				}else {
					System.out.println("odd Number with completableFuture:: " + number1 + " Thread with completableFuture:: " + Thread.currentThread().getName());
				}
			}
			
		},es1);
		CompletableFuture.runAsync(() -> {
		    System.out.println("Task 2 running on: " + Thread.currentThread().getName());
			for (Integer number1 : numbers1) {
		    if(number1%2==0) {
				System.out.println("even Number with completableFuture: " + number1 + " Thread with completableFuture:: " + Thread.currentThread().getName());
				}else {
					System.out.println("odd Number with completableFuture:: " + number1 + " Thread with completableFuture:: " + Thread.currentThread().getName());
				}
			}
		}, es1);
		Thread.sleep(1000); // Wait for the CompletableFuture to finish
		 es.shutdown();
		 es1.shutdown();
       

		//usingpartitioningBy(numbers);
	}

	private static void usingpartitioningBy(List<Integer> numbers) {
		Map<Boolean, List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		Set<Entry<Boolean, List<Integer>>> entrySet = result.entrySet();

		for (Entry<Boolean, List<Integer>> entry : entrySet) {
			System.out.println("--------------");

			if (entry.getKey()) {
				System.out.println("Even Numbers");
			} else {
				System.out.println("Odd Numbers");
			}

			System.out.println("--------------");

			List<Integer> list = entry.getValue();

			for (int i : list) {
				System.out.println(i);
			}
		}
	}

}
