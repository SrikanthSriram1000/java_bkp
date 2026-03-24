package com.test.sorting;

import java.util.Arrays;

import com.test.resouceutil.Employee;

public class SortingTest {
public static void main(String[] args) {
	Employee e1=new Employee(3,"srikanth",50000);
	Employee e2=new Employee(1,"sriram",60000);
	Employee e3=new Employee(2,"kumar",70000);
	Employee[] employees= {e1,e2,e3};	
	java.util.Arrays.sort(employees);
	System.out.println(employees[0]);
	Arrays.stream(employees).forEach(System.out::println);
	System.out.println(" Sorting based on salary ");
	Arrays.stream(employees).sorted((a,b)->Double.compare(b.getSalary(), a.getSalary())).forEach(System.out::println);
	System.out.println(" Sorting based on name desc ");
	Arrays.stream(employees).sorted((a,b)->b.getName().compareTo(a.getName())).forEach(System.out::println);
}
}
