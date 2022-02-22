package com.company;

public class MyRunnable2 implements Runnable{
    Lock lock = null;
    MyRunnable2(Lock lock)
    {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.unlock();
        System.out.println(Thread.currentThread().getName()+" Lock is consumed");

    }
}
