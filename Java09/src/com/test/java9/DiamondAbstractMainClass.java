package com.test.java9;

public class DiamondAbstractMainClass {

	public static void main(String[] args) {
//here right side generic is not required
		DiamondAbstract<Integer> d= new DiamondAbstract<>() {
			
			@Override
			public void add(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
