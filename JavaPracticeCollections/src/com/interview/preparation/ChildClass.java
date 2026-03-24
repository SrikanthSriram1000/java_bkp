package com.interview.preparation;

public class ChildClass extends ParentClass {
	int b = 20;
	int a = 30; // This hides the parent class variable 'a'
	@Override
	public void test() {
		System.out.println("ChildClass test method");
	}
	public static void staticMethod() {
        System.out.println("ChildClass static method");
    }
}
