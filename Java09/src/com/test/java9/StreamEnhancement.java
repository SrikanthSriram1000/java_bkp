package com.test.java9;

import java.util.List;
import java.util.stream.Collectors;

public class StreamEnhancement {

	public static void main(String[] args) {
		List<Integer> l = new java.util.ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> l2 = l.stream().limit(2).skip(1).collect(Collectors.toList());
		System.out.println(l2);

	}

}
