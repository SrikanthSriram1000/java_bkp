package com.javatpoint;


public class Employee1 {
private int id;
private String name;
private float salary;
public Employee1() {}
public Employee1(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

}
