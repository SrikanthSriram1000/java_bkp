package com.test.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public class SortingNormalTest {

	public static void main(String[] args) {

		Integer[] numbers = { 5, 2, 8, 1, 3 };
		Arrays.stream(numbers).sorted().forEach(System.out::print);
		System.out.println();
		Arrays.stream(numbers).sorted().limit(2).skip(1).forEach(System.out::print);
		System.out.println();
		Arrays.stream(numbers).sorted(Collections.reverseOrder()).forEach(System.out::print);
		System.out.println();
		Arrays.stream(numbers).sorted(Collections.reverseOrder()).limit(2).skip(1).forEach(System.out::print);
		System.out.println();
		
		///this is new to me
		Integer optInt=Arrays.stream(numbers).sorted().skip(1).findFirst().orElseThrow(()-> new RuntimeException("No element found"));
		System.out.println("optInt "+optInt);
		int minValue=Arrays.stream(numbers).min((i1,i2)->Integer.compare(i1, i2)).get();
		System.out.println("minValue "+minValue);
	
	}

}
