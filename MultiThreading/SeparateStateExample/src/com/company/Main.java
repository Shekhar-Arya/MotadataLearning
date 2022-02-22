package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyRunnable runnable1 = new MyRunnable();
        MyRunnable runnable2 = new MyRunnable();
        // As to different objects are created and will be passed to two different threads there is no chance of Shared resources

        Thread thread1 = new Thread(runnable1,"Thread 1");
        Thread thread2 = new Thread(runnable2,"Thread 2");
        thread1.start();
        thread2.start();

        // And as output both thread will have 1000 in their count without any fault.

    }
}
