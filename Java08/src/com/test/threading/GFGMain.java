package com.test.threading;

public class GFGMain {
	 public static void main(String[] args) {
	        GFG printer = new GFG (10);
	
	        Thread t1 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                printer.printOddNum();
	            }
	        });
	      
	        t1.setName("Odd"); // for clearer verification
	
	        Thread t2 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                printer.printEvenNum();
	            }
	        });
	      
	        t2.setName("Even"); // for clearer verification
	
	        t1.start();
	        t2.start();
	    }
	}

