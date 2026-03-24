package com.practice.interfaceInherit;

public abstract class SampleAbstractClass implements SampleInterface{

	public SampleAbstractClass() {
	}

	@Override
	public String hai() {
		System.out.println("Hai ..");
		return "Hai..";
	}
	
	
}
