package com.test.EqualsANDHashCode;

import java.util.HashMap;
import java.util.Map;

public class TestEqualsHashCode {
public static void main(String[] args) {
	Map<EmployeeEqualsHashCode, String> map = new HashMap<>();	
	EmployeeEqualsHashCode emp1 = new EmployeeEqualsHashCode(1, "John", "IT");
	EmployeeEqualsHashCode emp2 = new EmployeeEqualsHashCode(1, "John", "IT");
	map.put(emp1, "Employee 1");
	map.put(emp2, "Employee 2");
	System.out.println("Map size: " + map.size());
	System.out.println("Value for emp1: " + map);
	if( emp1==emp2) {
        System.out.println("emp1 and emp2 are the same object");
    }
    else
        System.out.println("emp1 and emp2 are different objects");
}
}
