package com.test.java9;

public interface A {
	public void m1();

	default void m2() {
		extracted("m2");
	}

	default void m3() {
		extracted("m3");
	}
//java9 
	private void extracted(String method) {
		System.out.println("in default " + method);
	}
	public static void staticMethod() {
		System.out.println("in sttaic method ");
	}
}
