package com.company;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        // DeadLock can also be using Synchronized block same as it happens in Lock
        // We will see in Example Using same with two Runnable and using synchronized block in them
        // For more details see MyRunable Class
        // Here we pass two objects as a monitor objects.

        Object lock1 = new Object();
        Object lock2 = new Object();

        new Thread(new MyRunnable1(lock1,lock2), "Thread 1").start();
        new Thread(new MyRunnable2(lock1,lock2), "Thread 2").start();

        // Different types of deadlock are:
        //1. LiveLock
        //2. Nested Monitor Lockout
        //3. Reentrance LockOut
        //4. Starvation
    }
}
