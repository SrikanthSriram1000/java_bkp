package com.test.calculation;

import java.util.Arrays;

public class StreamArth {
	public static void main(String[] args) {
		int min1 = Arrays.stream(new int[] { -22, 1, 2, 3, 4, 5 }).min().orElse(0);
		int sum = Arrays.stream(new int[] { -22, 1, 2, 3, 4, 5 }).sum();
		System.out.println("Min of first array: " + min1); // Output: 1
		System.out.println("Min of second array: " + sum); // Output: 0
	}
}
