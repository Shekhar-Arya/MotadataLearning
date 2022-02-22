package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // In this technique of prevention of deadlock two threads will try to acquire lock
        // if both lock are available then they will perform action if both locks are not available then
        // it will wait for some random time and then retry to lock the lock

        // Whil;e doing above we have to make sure that both threads does not wait for same time or does not wait at all
        // Cause if they does this then both will end in live lock
        // Live lock is like both threads will try to acquire lock at same time and both will wait because of dead lock and these try and wait will goes on
        // Which is called LiveLock

        // For details view of how TimeOut Back Off works see the two Runnables
        Lock lock1 = new ReentrantLock(true);
        Lock lock2 = new ReentrantLock(true);

        new Thread(new MyRunnable1(lock1,lock2),"Thread 1").start();
        new Thread(new MyRunnable1(lock1,lock2),"Thread 2").start();

        // As we can see above code will try to access both the lock if possible hen it will do task or it will wait for some time
        // and then try again to acquire lock


    }
}
