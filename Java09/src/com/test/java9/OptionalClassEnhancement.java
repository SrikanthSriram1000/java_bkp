package com.test.java9;

import java.util.Optional;

public class OptionalClassEnhancement {

	public static void main(String[] args) {
		Optional<Integer> op = m1();
		if (op.isPresent()) {
			op.ifPresent(p -> System.out.println(p));
		}
		Optional<Integer> op2 = m2();
		op2.ifPresentOrElse(p -> System.out.println(p), () -> System.out.println("value is null"));
	}
	public static Optional<Integer> m1() {
		return Optional.ofNullable(1);
	}
	public static Optional<Integer> m2() {
		return Optional.ofNullable(null);
	}

}
