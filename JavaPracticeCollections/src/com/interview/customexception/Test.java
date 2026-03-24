package com.interview.customexception;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		try {
		test1();
		}catch(MyUncheckedBusinessException e) {
			System.out.println("here in custom exception");
		}
	}
	
	public static void test1() {
		try {
			String s= null;
			s.toLowerCase();
		} catch (RuntimeException e) {
			System.out.println("in runtime");
			throw new MyUncheckedBusinessException("Erro happend while handling",e,ErrorCode.INVALID_INPUT);
		} 
	}
}
