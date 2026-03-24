package com.test.threading;
public class PrintEvenOddNumber {
    private int number = 2;
    private final int limit;
    // A shared lock object for inter-thread communication
    private final Object lock = new Object();

    public PrintEvenOddNumber(int limit) {
        this.limit = limit;
    }

    public void printOdd() {
        synchronized (lock) {
            while (number <= limit) {
                // Wait if the current number is even (not odd)
                while (number % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (number <= limit) {
                    System.out.println("Odd: " + number);
                    number++;
                    // Notify the even thread
                    lock.notify();
                }
            }
        }
    }

    public void printEven() {
        synchronized (lock) {
            while (number <= limit) {
                // Wait if the current number is odd (not even)
                while (number % 2 != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (number <= limit) {
                    System.out.println("Even: " + number);
                    number++;
                    // Notify the odd thread
                    lock.notify();
                }
            }
        }
    }
}

