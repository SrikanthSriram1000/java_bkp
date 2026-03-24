package com.test.stream.sorting;

public class EmpComparable implements Comparable<EmpComparable>{
	public int id;
	public String name;

	@Override
	public int compareTo(EmpComparable other) {
		return this.name.compareTo(other.name);
	}
	
	
	
	
	

	public EmpComparable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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






	@Override
	public String toString() {
		return "EmpComparable [id=" + id + ", name=" + name + "]";
	}

}
