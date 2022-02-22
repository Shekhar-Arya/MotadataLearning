package com.company;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // As we have seen because of two different order in locking the lock deadlock can occure
        // So first way is to Provide same order of lock in all runnable or threads then there is no chance of deadlock
        // Lets see example below with Two Runnable with lock in same order without forming in cycle.

        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        new Thread(new MyRunnable1(lock1,lock2),"Thread 1").start();
        new Thread(new MyRunnable2(lock1,lock2),"Thread 2").start();
        // As we can see by changing order or making all locks in same order we can avoid deadLock.

    }
}
