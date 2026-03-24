package com.interview.preparation;

public class TryCatchTest {

	public static void main(String[] args) {
		int number=test();
		System.out.println("Returned value from test method: " + number);
	}

	public static int test() {
		try {
			int result = 10 / 1; // This will throw ArithmeticException
			return result;
		} catch (ArithmeticException e) {
			System.out.println("Caught an ArithmeticException: " + e.getMessage());
			return -1; // Return a default value
		} finally {
			System.out.println("Finally block executed in test method.");
			//return 100; // This will override the return statement in the try block
		}
	}

	public void test2() {
		try {
			int[] arr = new int[5];
			arr[5] = 10; // This will throw ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed.");
		}
	}
}
