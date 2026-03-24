package com.test.java9;

public class StringEnhancement {

	public static void main(String[] args) {

		String s="ABCD";
		String s1="ABCD";
		String s3= new String("ABCD");
		String s4="AB"+"CD";
		String s5="AB";
		String s6="CD";
		String s7=s5.concat(s6);
		String s8=s4.concat("CD");
		System.out.println(s==s1);//true
		System.out.println(s==s3);//false
		System.out.println(s==s4);//true
		System.out.println(s==s7);//false
		System.out.println(s==s8);//false
		s.substring(0,2);
		System.out.println(s);
		s=s.substring(0,2);
		System.out.println(s);
		System.out.println(s.repeat(2));//ABAB
		
		
	}

	

}
