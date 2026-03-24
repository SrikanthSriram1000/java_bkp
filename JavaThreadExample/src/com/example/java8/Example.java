package com.example.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Example {

	public static void main(String[] args) {

		List l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		Consumer<Integer> c = (x) -> System.out.println(x);
		l.forEach(c);

	}

}
