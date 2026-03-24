package com.test.stream.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.test.resouceutil.Employee;

public class FilteringByAgeAndSalaryS {
	public static void main(String[] args) {
		Employee e1 = new Employee(3, "srikanth", 50000, 30);
		Employee e2 = new Employee(1, "sriram", 60000, 25);
		Employee e3 = new Employee(2, "kumar", 70000, 28);
		Employee[] employees = { e1, e2, e3 };
		
		List<Employee> list = Arrays.stream(employees).filter(FilteringByAgeAndSalaryS::byAgeSalary)
				.collect(Collectors.toList());
		System.out.println(list);
		List<Employee> list2 = Arrays.stream(employees).filter(x -> new FilteringByAgeAndSalaryS().byAgeSalary(x))
				.collect(Collectors.toList());
		
	 Employee e=Arrays.stream(employees).sorted((x,y)->Integer.compare(y.getAge(), x.getAge())).findFirst().get();
		System.out.println("max age person "+e.getAge());
		Arrays.stream(employees).sorted().forEach(System.out::println);
		Arrays.stream(employees).sorted((x,y)->x.getName().compareTo(y.getName())).forEach(c->System.out.println(c));

		List<Employee> list3= List.of(e1,e2,e3);
		list3.stream().max((x,y)->Integer.compare(x.getAge(), y.getAge()))
			.ifPresent(c->System.out.println("max age person "+c.getAge()));
	}

	private static boolean byAgeSalary(Employee employee1) {
		if (employee1.getAge() > 25 && employee1.getSalary() > 50000) {
			return true;
		} else
			return false;
	}

}
