package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Lock lock = new Lock();
        for (int i = 0; i < 10; i++) {
            new Thread(new MyRunnable(lock)).start();
            new Thread(new MyRunnable2(lock)).start();
        }

        // Nested Monitor lockout is similar to the deadlock
        // slight difference is that it locks the lock in same order
        // Exaplined in Lock class
    }
}
