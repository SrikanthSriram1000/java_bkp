package com.test.basic.collections.practice;

import java.util.Objects;

public class Employee{
 
	public int no;
	public String name;
	public Employee(int no) {
		super();
		this.no = no;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {

		return "no "+ getNo()+"name "+getName();
	}
	 @Override
	  public boolean equals(final Object obj) {
	    if (this == obj) {
	      return true;
	    }
	    if (obj == null) {
	      return false;
	    }
	    if (getClass() != obj.getClass()) {
	      return false;
	    }
	    Employee other = (Employee) obj;
	    return Objects.equals(no, other.no);
	  }
}
