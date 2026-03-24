package com.test.basic.collections.practice;

public class B extends A {
	public void m1() {
		System.out.println("overriden m1");
			}
	public void m2() {
System.out.println("in m2");
	}
	public static void main(String[] args) {

		A a =new A();
		B b = new B();
		A a1=new B();
System.out.println(" =========A a=========");
		a.m1();
a.m3();
System.out.println("========= B b=========");
b.m1();
b.m2();
b.m3();
System.out.println(" =========A a1=========");
a1.m1();
a1.m3();

	}

}
