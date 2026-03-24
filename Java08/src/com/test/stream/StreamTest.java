package com.test.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.resouceutil.Employee;

//distinct on employee object
//unique elements
public class StreamTest {

	public static void main(String[] args) {
		UnaryOperator<Integer> uOp=x->x+1;
		IntUnaryOperator uop1=x->x+1;
		Stream.iterate(1,uOp).limit(10).forEach(c -> System.out.println("printing sequence numbers " + c));
		//below is direct use
		Stream.iterate(1,x->x+1).limit(10).forEach(c -> System.out.println("printing sequence numbers " + c));
		
		IntStream.rangeClosed(0, 10).forEach(c -> System.out.println("printing sequence numbers instream " + c));
		
		Stream.generate(()->new Random());
		Employee e1 = new Employee(3, "srikanth", 50000, 100, "IT", "M");
		Employee e2 = new Employee(1, "sriram", 60000, 25, "IT", "M");
		Employee e5 = new Employee(1, "patel", 90000, 45, "IT", "M");
		Employee e3 = new Employee(2, "kumar", 70000, 28, "CSE", "F");
		Employee e4 = new Employee(4, "reddy", 80000, 30, "CSE", "F");
		Employee e6 = new Employee(5, "reddy", 80000, 30, "CSE", "F");
		Employee[] employees = { e1, e2, e3, e4, e5, e6 };

		Arrays.asList(employees).stream().distinct().forEach(c -> System.out.println(" Employee details: " + c));
		Set set = new HashSet<>();
		Set<Employee> collect = Arrays.asList(employees).stream().filter(c -> !set.add(c.getName()))
				.collect(Collectors.toSet());
		System.out.println(" Duplicate Employee names: " + collect);
		Map<Boolean, List<Integer>> map = Stream.iterate(1, x -> x + 1).limit(10)
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println(map);
		
		IntStream chars = "hello".chars(); 
		chars.forEach(c -> System.out.println((char)c));
		
		
	}

}
