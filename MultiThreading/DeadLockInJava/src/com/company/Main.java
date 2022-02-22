package com.company;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        // Dead lock occurs when one thread has locked one lock and need second lock to unlock the first one and
        // Second thread has locked second lock and to unlock it, it needs first lock so both threads ends up in lock forever
        // Lets understand with example

        // Here in MyRunnable 1 and 2 I have used two locks
        // in Runnable1 i have first used lock1 and to unloack it it need lock2 and same in reverse order in Runnable2
        // So here both will be locked foreever
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        new Thread(new MyRunnable1(lock1,lock2), "Thread 1").start();
        new Thread(new MyRunnable2(lock1,lock2), "Thread 2").start();

        // As an output we can see that both threads are unable to lock second lock cause its already locked.

        // In Above we can order the locking of lock and prevent the deadlock from occurring.
        // We can also have deadLock using Synchronized bloc which we will see in DeadLockInJava2


        // Different types of deadlock are:
        //1. LiveLock
        //2. Nested Monitor Lockout
        //3. Reentrance LockOut
        //4. Starvation

        // Dead Lock occures because lock are locked cyclic order
    }
}
