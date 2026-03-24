package com.test.threading;

public class Main {
    public static void main(String[] args) {
        PrintEvenOddNumber print = new PrintEvenOddNumber(20); // Print up to 20

        // Create threads using lambda expressions for the methods
        Thread oddThread = new Thread(print::printOdd, "OddThread");
        Thread evenThread = new Thread(print::printEven, "EvenThread");

        // Start the threads
        oddThread.start();
        evenThread.start();

        // Optional: Use join to wait for both threads to complete
        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}