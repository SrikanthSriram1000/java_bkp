package com.test.optional;

import java.util.List;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {

		Optional<String> optional = Optional.ofNullable(null);
		List<String> list = List.of("A", "B", "BB", "C");
		optional.ifPresent(value -> System.out.println("Value is present: " + value));
		optional.ifPresentOrElse((c) -> System.out.println("value is " + c),
				() -> System.out.println("Value is absent :("));
		
		
		list.stream().filter(s -> s.equals("B")).findFirst().ifPresentOrElse(
				(s) -> System.out.println("Found value: " + s), () -> System.out.println("Value not found"));
	}

}
