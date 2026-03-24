package com.sriram.class12.practice.corejava.examples;
public class MyCheckedException extends Exception {

	private static final long serialVersionUID = 7718828512143293558L;
	
	private final ErrorCode code;
			
	public MyCheckedException(ErrorCode code) {
		super();
		this.code = code;
	}

	public MyCheckedException(String message, Throwable cause, ErrorCode code) {
		super(message, cause);
		this.code = code;
	}

	public MyCheckedException(String message, ErrorCode code) {
		super(message);
		this.code = code;
	}

	public MyCheckedException(Throwable cause, ErrorCode code) {
		super(cause);
		this.code = code;
	}
	
	public ErrorCode getCode() {
		return this.code;
	}
}