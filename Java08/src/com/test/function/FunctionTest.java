package com.test.function;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class FunctionTest {

	public static void main(String[] args) {

		IntUnaryOperator f = (a) -> a + 10;
		IntUnaryOperator f1 = (a) -> a * 10;
		int i = f.andThen(f1).applyAsInt(10);

		System.out.println(i);

	}

}
