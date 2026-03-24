package com.practice.dsa;

import java.util.HashMap;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap<Employee, String> map = new HashMap<>();

		Employee e1 = new Employee();
		e1.setEmpId(123);
		e1.setName("sri");

		Employee e3 = new Employee();
		e3.setEmpId(124);
		e3.setName("chintu");
		
		Employee e2 = new Employee();
		e2.setEmpId(123);
		e2.setName("swapna");
		map.put(e1, "A");
		map.put(e3, "C");
		map.put(e2, "B");
		System.out.println("size =="+map.size());
		System.out.println("map =="+map);

	}
}
