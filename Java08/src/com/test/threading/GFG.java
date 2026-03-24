package com.test.threading;
// Java program for the above approach

public class GFG {

    // Starting counter
  	//will force all threads to update and use the latest copy of this counter, and not use locally cached copies
    volatile static int counter = 1; 
    
  	int limit;

    GFG (int limit) {this.limit = limit;}

  //function to print odd numbers
    public synchronized void printOddNum () {
        while(counter<=limit) {
            if(counter%2 == 1) { //counter is odd, print it
              	// remove thread name and use System.out.print() to print in one line, as per the sample output format
                System.out.println(Thread.currentThread().getName()+": "+counter); 
                counter++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Function to print even numbers
    public synchronized void printEvenNum () {
        while (counter<=limit) {
            if(counter%2 == 0) { //counter is even, print it
              // remove thread name and use System.out.print() to print in one line,
            	//as per the sample output format
                System.out.println(Thread.currentThread().getName()+": "+counter);
                counter++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

    // Driver Code
   