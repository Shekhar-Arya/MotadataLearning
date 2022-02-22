package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Slipped Condition is a situation where thread check the certain condition and until it acts upon it that condition
        // is changed by the another thread so because of which acting of first thread will be error.
        // Lets see Lock code which can produce the slipped condition

        Lock lock = new Lock();
        new Thread(new MyRunnable(lock)).start();
        new Thread(new MyRunnable(lock)).start();
    }
}
