package com.company;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // ReadWrite lock is used when one or two threads are writing and two or more threads are reading the same content
        // When the block is locked with write block then no another thread can use that content to write or read the
        // block locked with that block
        // And when block is locked with read lock then other threads can read the content of the block but
        // cant update the content of the block
        // Below we can see the Example of it

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock readWriteLock1 = new ReentrantReadWriteLock(true);
        // it takes true or false for fairness means it will allow threads in same order as they came to acquire lock
        for (int i = 0; i < 20; i++) {
            new Thread(new ProducerRunnable(readWriteLock1)).start();
            new Thread(new ConsumerRunnable(readWriteLock1)).start();
        }

    }
}
