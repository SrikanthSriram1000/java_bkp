package com.test.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.test.resouceutil.Employee;

public class HashMapTestPractice {

	public static void main(String[] args) {

		List<Employee> list=extracted();
		Map<String,Long> map=list.stream().collect(Collectors.groupingBy(x->x.getName(),Collectors.counting()));	
		Map<Object, Double> map2=list.stream().collect(Collectors.groupingBy(x->x.getDeptName(),Collectors.averagingInt(x->x.getAge())));
		System.out.println("map ="+map);
		System.out.println("map2 ="+map2);
	}
	
	private static List<Employee> extracted() {
		List<String> listOfPhoneNumbers1 = List.of("9876543210", "5432109876");
		List<String> listOfPhoneNumbers2= List.of("5432109876","9876543210");
		List<String> listOfPhoneNumbers3= List.of("5432109876","9876543210","7654321098");
		List<String> listOfPhoneNumbers4= List.of("7654321098","5432109876");
		Employee e1 = new Employee(3, "srikanth", 50000, 100, "IT", "M",listOfPhoneNumbers1);
		Employee e2 = new Employee(1, "sriram", 60000, 25, "IT", "M",listOfPhoneNumbers2);
		Employee e5 = new Employee(5, "patel", 90000, 45, "IT", "M",listOfPhoneNumbers3);
		Employee e3 = new Employee(2, "kumar", 90000, 28, "CSE", "F",listOfPhoneNumbers4);
		Employee e4 = new Employee(4, "reddy", 80000, 30, "CSE", "F",listOfPhoneNumbers4);
		List<Employee> empList = List.of(e1, e2, e3, e4, e5);
		return empList;
	}

}
