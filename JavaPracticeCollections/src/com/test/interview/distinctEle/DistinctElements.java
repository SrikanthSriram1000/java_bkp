package com.test.interview.distinctEle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctElements {
	public static void main(String[] args) {
		Integer[] i = {1,1,2,3};
		List<Integer> l =	Arrays.asList(i);
		l.stream().distinct().forEach(c->System.out.println(c));
		removeDuplicates();

	}
	
	public static void removeDuplicates() {
		 List<String> listWithDuplicates = new ArrayList<>(List.of("apple", "banana", "orange", "apple", "grape", "banana"));

	        Set<String> setWithoutDuplicates = new HashSet<>(listWithDuplicates);
	
	        List<String> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);
System.out.println("listWithoutDuplicates.."+listWithoutDuplicates);
	}

}
