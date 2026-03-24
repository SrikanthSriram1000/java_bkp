package com.interview.reverseString;

import java.util.stream.Stream;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Srikanth";
		StringBuilder sb = new StringBuilder(str);
		Stream.of(str).map(e -> sb.reverse()).forEach(r -> System.out.println(r));
		
		String reveresedStr=reverseStr(str);
		System.out.println("reveresedStr  "+reveresedStr);
	}
	
	public static String reverseStr(String str) {
		
		StringBuilder str2= new StringBuilder();
		for (int i = str.length()-1; i >=0; i--) {
			char c=str.charAt(i);
			str2.append(c);
		}
		return str2.toString();
		
	}
}
