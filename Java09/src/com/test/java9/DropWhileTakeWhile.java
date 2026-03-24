package com.test.java9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class DropWhileTakeWhile {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(10,20,15,30);
		List<Integer> l5 = l.stream().takeWhile(i -> i % 2==0).toList();
		System.out.println("After takeWhile: " + l5);
		
		
		List<Integer> l4 = l.stream().dropWhile(i -> i % 2==0).toList();
		System.out.println("After dropWhile: " + l4);
		
	
		List<Integer> l3 = l.stream().takeWhile(i -> i < 5).toList();
		System.out.println("After takeWhile: " + l3);
		
		List<Integer> l2 = l.stream().dropWhile(i -> i < 5).toList();
		System.out.println("After dropWhile: " + l2);
		
		
		
		
		
		List<Integer> numbers = Arrays.asList(1, 4, 2, 5, 3);
		// Method reference is used for conciseness
		int max = numbers.stream()
		                 .reduce(Integer.MIN_VALUE, Integer::max);
		numbers.stream()
				.reduce((x, y) -> x + y)
				.ifPresentOrElse(s -> System.out.println("Sum is: " + s), () -> System.out.println("No value present"));
		System.out.println("Maximum number: " + max);

	}

}
