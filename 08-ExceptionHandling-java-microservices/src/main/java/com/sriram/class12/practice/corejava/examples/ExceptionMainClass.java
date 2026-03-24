package com.sriram.class12.practice.corejava.examples;

public class ExceptionMainClass {
	public static void main(String[] args) throws MyCheckedException {
		 try {
		        Integer.parseInt("s");
		    } catch (NumberFormatException e) {
		        throw new MyCheckedException("A message that describes the error.", ErrorCode.INVALID_PORT_CONFIGURATION);
		    }
	}
}
