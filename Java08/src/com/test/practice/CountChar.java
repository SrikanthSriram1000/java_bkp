package com.test.practice;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountChar {

	public static void main(String[] args) {

		String str = "hello world";
		Arrays.stream(str.split("")).collect(Collectors.groupingBy(
				Function.identity(),
				Collectors.counting()))
				.forEach((k, v) -> System.out.println(k + ": " + v));	
	}

}
