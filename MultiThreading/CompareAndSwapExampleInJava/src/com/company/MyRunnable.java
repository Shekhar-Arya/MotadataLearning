package com.company;

import java.util.concurrent.atomic.AtomicBoolean;

public class MyRunnable implements Runnable{
    AtomicBoolean atomicBoolean = null;
    MyRunnable(AtomicBoolean atomicBoolean)
    {
        this.atomicBoolean = atomicBoolean;
    }

    // Here we get the AtomicBoolean value which is common for all threads
    // unlock() set the value to the false
    public void unlock()
    {
        this.atomicBoolean.set(false);
    }

    // lock() compare the value to the false if it is false it will return true and !true will break the loop and lock will be acquired
    // by changing the variable to the true.
    // Now if value will be true below condition will return false and !false will go into loop and checks conditions again and again until it can acquire lock
    public void lock()
    {
        while (!atomicBoolean.compareAndSet(false,true))
        {

        }
    }

    // here is the implementation of above lock systems
    @Override
    public void run() {
        lock();
        System.out.println(Thread.currentThread().getName()+" : has locked the thread");
        unlock();
    }

    // this implementation come from below:
/*    volatile boolean lock = false;
    public void unlock()
    {
        lock = false;
    }

    public void lock()
    {
        while (lock)
        {
            // Here waiting happens
        }
        lock = true;
    }*/

    // But Above implementation is not thread safe so we used AtomicBoolean and its implementation

}
