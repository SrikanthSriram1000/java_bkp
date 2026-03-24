package com.shallowcopy;
class Employee implements Cloneable {
    String name;
    Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow Copy implementation using clone()
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Default clone() provides a shallow copy
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	//tostring with all the fields
	
	 @Override
	public String toString() {
		 return "Employee [name=" + name + ", address=" + address.getCity() + "]";
	}
}