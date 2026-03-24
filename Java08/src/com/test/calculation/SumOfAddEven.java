package com.test.calculation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfAddEven {
	static int totalValue = 0;

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0))
				.forEach((x, y) -> adding(y));
		try {
			System.out.println(totalValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static int adding(List<Integer> y) {
		for (Integer i : y) {
			totalValue = totalValue + i;
		}
		return totalValue;
	}
}