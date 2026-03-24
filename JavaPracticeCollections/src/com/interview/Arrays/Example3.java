package com.interview.Arrays;

import java.util.Arrays;

public class Example3 {
	public static void main(String[] args) {
		int[] i = new int[5];
		i[0] = 0;
		i[1] = 11;
		i[2] = 2;
		i[3] = 3;
		i[4] = 4;
		Arrays.sort(i);
		for (int j = i.length; j >= 0; j--) {
			//System.out.println(i[i.length-2]);
		}
		 int min_product = Integer.MIN_VALUE;
		 int max_product = Integer.MAX_VALUE;
		 System.out.println(min_product);
		 System.out.println(max_product);
	}
}
