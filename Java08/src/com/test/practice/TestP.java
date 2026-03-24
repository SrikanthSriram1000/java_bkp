package com.test.practice;

public class TestP {
	public static void run2(Test t) {
		System.out.println("in run");

	}

	public static void main(String[] args) {
		Test t = new Test();
		run2(()->);
	}
}
