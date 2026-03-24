package com.test.basic.collections.practice;

public class SomeTopicsWhileTeachingCollections {

	public static void main(String[] args) {

		String s1 = new String("ABC");
		String s2 = new String("ABC");
		String s3="ABC";
		String s4="ABC";
		String s5="AB"+"C";
		Employee e1 = new Employee(123);
		Employee e2=e1;
		System.out.println(s1==s2);
		System.out.println(s3==s1);
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		System.out.println(e2==e1);
		System.out.println(s3.hashCode()+"--"+s5.hashCode());
		
	}

}
