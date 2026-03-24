package com.interview.preparation;

public class ParentChildClass {

	public static void main(String[] args) {

		ParentClass parent = new ParentClass();
		parent.test(); // Calls ParentClass method
		System.out.println("Parent a: " + parent.a); // Accesses ParentClass variable 'a'
		ParentClass.staticMethod(); // Calls ParentClass static method
		ChildClass child = new ChildClass();
		child.test(); // Calls ChildClass method
		System.out.println("Child a: " + child.a); // Accesses ChildClass variable 'a'
		ChildClass.staticMethod(); // Calls ChildClass static method
		ParentClass polymorphicChild = new ChildClass();
		polymorphicChild.test(); // Calls ChildClass method due to polymorphism
		System.out.println("Polymorphic Child a: " + polymorphicChild.a); // Accesses ParentClass variable 'a'
		polymorphicChild.staticMethod(); // Calls ParentClass static method due to static binding
	}

}
