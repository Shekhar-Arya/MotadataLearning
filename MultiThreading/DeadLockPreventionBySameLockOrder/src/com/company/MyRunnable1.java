package com.company;

import java.util.concurrent.locks.Lock;

public class MyRunnable1 implements Runnable{
    Lock lock1 = null;
    Lock lock2 = null;
    MyRunnable1(Lock lock1, Lock lock2)
    {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Atempting to lock lock 1");
        lock1.lock();
        System.out.println(threadName + " locked lock 1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + " Atempting to lock lock 2");
        lock2.lock();
        System.out.println(threadName + " locked lock 2");
        lock1.unlock();
        lock2.unlock();
    }
}
