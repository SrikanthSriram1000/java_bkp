package com.test.EqualsANDHashCode;

public class EmployeeEqualsHashCode {
	private int id;
	private String name;
	private String dept;

	public EmployeeEqualsHashCode(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	//overrride hashcode with id
	@Override
	public int hashCode() {
		return id;
	}
	//override equals with id
	@Override
	public boolean equals(Object obj) {
		EmployeeEqualsHashCode emp = (EmployeeEqualsHashCode) obj;
		
		if (this.id == emp.id)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		EmployeeEqualsHashCode other = (EmployeeEqualsHashCode) obj;
		return id == other.id;
	}
	
	//override tostring for better output
	@Override
	public String toString() {
		return "EmployeeEqualsHashCode [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
}
