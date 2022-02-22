package com.company;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Semaphore can be used as lock and also as signaling the other threads
        // Main difference with semaphore and lock is that semaphore can make the block access by N threads
        // N is a Number of threads
        // If the semaphore’s count is greater than zero, then the thread acquires a permit, which causes the semaphore’s count to be decremented.
        //Otherwise, the thread will be blocked until a permit can be acquired.
        //When the thread no longer needs an access to the shared resource, it releases the permit, which causes the semaphore’s count to be incremented.
        //If there is another thread waiting for a permit, then that thread will acquire a permit at that time.

        Semaphore semaphore = new Semaphore(1,true);
        Counter counter = new Counter();
        new Thread(new MyRunnable(semaphore,counter)).start();
        new Thread(new MyRunnable(semaphore,counter)).start();

        // As we can see semaphore can work as lock
    }
}
