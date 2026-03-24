package com.test.stream.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingByComparable {

	public static void main(String[] args) {

		EmpComparable empComparable = new EmpComparable(30, "John");
		EmpComparable empComparable2 = new EmpComparable(25, "Alice");
		EmpComparable empComparable3 = new EmpComparable(35, "Bob");
		EmpComparable empComparable4 = new EmpComparable(28, "Charlie");
		List<EmpComparable> empList = Arrays.asList(empComparable, empComparable2, empComparable3, empComparable4);	
		System.out.println("Before sorting:");
		empList.forEach(System.out::println);
		System.out.println("\nAfter sorting:");
		empList.stream().sorted().forEach(System.out::println);
		empList.stream().sorted(Collections.reverseOrder()).forEach(c->System.out.println(c));
		System.out.println("sorting using comparator");
		empList.stream().sorted((e1,e2)->Integer.compare(e1.getId(), e2.getId()))
		.forEach(c->System.out.println(c));
		empList.stream().mapToInt(e->e.getId()).summaryStatistics().getSum();
	}

}
