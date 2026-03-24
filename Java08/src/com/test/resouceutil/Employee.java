package com.test.resouceutil;

import java.util.List;

//create Employee class with id, name, salary fields
public class Employee implements Comparable<Employee> {
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private int id;
	private String name;
	private double salary;
	private int age;
	private String deptName;
	private String gender;
	private List<String> phoneNumbers;	

	public Employee(int id, String name, double salary, int age, String deptName, String gender,
			List<String> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.deptName = deptName;
		this.gender = gender;
		this.phoneNumbers = phoneNumbers;
	}

	public Employee(int id, String name, double salary, int age, String deptName, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.deptName = deptName;
		this.gender = gender;
	}

	public Employee(int id, String name, double salary, int age, String deptName) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.deptName = deptName;
	}

	public Employee(int id, String name, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	 
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
			return this.id == emp.getId();
		}
        return false;		
	}

	@Override
	public int compareTo(Employee o) {
			return compare(this.id, o.getId());
	}

	public static int compare(int x, int y) {
		return (x < y) ? -1 : ((x == y) ? 0 : 1);
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", deptName="
				+ deptName + ", gender=" + gender + ", phoneNumbers=" + phoneNumbers + "]";
	}
	
}
