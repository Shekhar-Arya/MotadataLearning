package com.company;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        // Compare and swap is a technique in which two or more threads check the condition and change the value
        // Two or more threads check the value of variable and if it is equal to specific value then it will change the variable value to another value
        // But for compare and swap to make it thread safe we need to use Lock or synchronized block
        // Problem in Synchronized block is that if thread try to access the block and block is already used by other thread
        // than this thread will wait for some time to retry to access the block but this wait is in the hand of OS level or JVM level so it is not gaurantee that
        // thread will access the block immediatly after the other thread leave the block. It may take more time
        // Hence by using Comapre and Swap we can also lock the block and it is totally handled by Hardware
        // It checks and try to acquire lock oftenly so as soon as lock is available thread can get that lock
        // Here we will use Atomic Data Type Which is thread safe and only onethread can use that variable at a time
        // Implementation is given below
        // For working see MyRunnable

        AtomicBoolean lock = new AtomicBoolean(false);
        new Thread(new MyRunnable(lock)).start();
        new Thread(new MyRunnable(lock)).start();
        new Thread(new MyRunnable(lock)).start();

        Thread.sleep(1000);

        // Another way we can use the Compare and Swap is that we allow more than one thread to enter the critical section
        // But only one thread to change the value inside the critical section
        // Its Example we will see in MyRunnable2
        System.out.println("---------------------");
        AtomicLong atomicLong = new AtomicLong(0);
        new Thread(new MyRunnable2(atomicLong)).start();
        new Thread(new MyRunnable2(atomicLong)).start();
        new Thread(new MyRunnable2(atomicLong)).start();
        new Thread(new MyRunnable2(atomicLong)).start();
        new Thread(new MyRunnable2(atomicLong)).start();
    }
}
