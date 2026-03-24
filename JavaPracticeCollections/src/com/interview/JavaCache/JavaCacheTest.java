package com.interview.JavaCache;

public class JavaCacheTest {

	public static void main(String[] args) {

		Integer i1 = 120;
		Integer i2 = 120;
		int j1 = 120;
		System.out.println("i1 == i2: " + (i1 == i2)); // true, because of Integer caching for values -128 to 127
		System.out.println("i1.equals(i2): " + (i1.equals(i2))); // true, because equals method checks value
		
		System.out.println("j1 == i1: " + (j1 == i1)); // true, because of auto-unboxing, j1 is converted to Integer
		Integer i3 = 800;
		Integer i4 = 800;
		Integer i5 = new Integer(800);
		int j2 = 800;
		int j21 = 800;
		System.out.println("i1 == i2: " + (i3 == i4));
		System.out.println("i1.equals(i2): " + (i3.equals(i4))); // false, because i3 and i4 are outside the cached
																	// range, so they are different objects
		System.out.println("j2 == i3: " + (j2 == i3)); // true, because of auto-unboxing, j2 is converted to Integer
		System.out.println("i3 == i5: " + (i3 == i5)); // false, because i3 and i5 are different objects
		System.out.println("j2 == j21: " + (j2 == j21)); // true, because both int are primitive
	
	
	
	
	}

}
