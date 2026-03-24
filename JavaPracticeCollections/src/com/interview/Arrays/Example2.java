package com.interview.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example2 {
	public static void main(String[] args) {
		int[] i = new int[5];
		i[0] = 0;
		i[1] = 1;
		i[2] = 2;
		i[3] = 3;
		i[4] = 4;
		int highValue=i[0];
		for (int j = 1; j < i.length; j++) {
			if(highValue<i[j]) {
				highValue=i[j];
			}
		}
		System.out.println("highet value="+highValue);
		 IntStream integerStream = Arrays.stream(i);	
		 int max = integerStream.max().getAsInt();
		  System.out.println("The maximum value is: " + max);
		  
		  String[] stringArray = {"biple","apple", "banana", "cherry"};
	        Stream<String> stringStream = Arrays.stream(stringArray);
	        stringStream.sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		
	}
		
}
