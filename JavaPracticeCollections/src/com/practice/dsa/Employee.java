package com.practice.dsa;

public class Employee {
	public int empId;
	public String name;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empId;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;

		if (e.getEmpId() == empId) {
			return true;
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
