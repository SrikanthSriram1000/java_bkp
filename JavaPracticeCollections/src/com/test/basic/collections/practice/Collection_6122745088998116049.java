package com.test.basic.collections.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Collection_6122745088998116049 {

	public static void main(String[] args) {

		concurrentModException();

		concurrentModExceptionFix();
	}

	private static void concurrentModException() {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		Iterator itr = set.iterator();
		try {
			while (itr.hasNext()) {
				int i = (int) itr.next();
				System.out.println(i);
				set.add(6);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void concurrentModExceptionFix() {
		Set<Integer> set = new CopyOnWriteArraySet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			int i = (int) itr.next();
			System.out.println(i);
			set.add(6);
		}
	}

}
