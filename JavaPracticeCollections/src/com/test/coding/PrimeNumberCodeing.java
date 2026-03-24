package com.test.coding;

public class PrimeNumberCodeing {

	public static void main(String[] args) {
		int number= 15;
		int j=0;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				j++;
			}
			
		}
		if(j==0) {
			System.out.println("it is prime");
		}else {
			System.out.println("not prime");
		}
		
	}
}
