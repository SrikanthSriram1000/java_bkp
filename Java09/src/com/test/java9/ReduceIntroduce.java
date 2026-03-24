package com.test.java9;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReduceIntroduce {
	//to find min and sum of array elements using reduce
	//reduce(BinaryOperator<T> accumulator)
	//reduce(T identity, BinaryOperator<T> accumulator)
	// reduce (T identity,
	// BinaryOperator<T> accumulator,
	// BinaryOperator<T> combiner)

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };
		Arrays.stream(a).reduce((m,n)->m<n?m:n).ifPresent(c->System.out.println(c));
		Arrays.stream(a).reduce((x,y)->x+y).ifPresent(c->System.out.println(c));
		//finding langest string using reduce
		String[] str= {"java","python","c++","javascript"};
		String s="aa";
		s.length();
		//Arrays.stream(str).reduce((x,y)->x.length()>y.length()?x.length():y.length()).ifPresent(c->System.out.println(c));
		Arrays.stream(str).reduce((x,y)->x.length()>y.length()?x:y).ifPresent(c->System.out.println(c));
	}

	private static void extracted(int[] a) {
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if(max>a[i]) {
				
			}else {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
