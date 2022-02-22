package com.company;

import java.util.concurrent.locks.Lock;

public class MyRunnable1 implements Runnable{
    Object lock1 = null;
    Object lock2 = null;
    MyRunnable1(Object lock1, Object lock2)
    {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Atempting to lock lock 1");
        synchronized (lock1) {
            System.out.println(threadName+" locked lock 1");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName+" Atempting to lock lock 2");
            synchronized (lock2)
            {
                System.out.println(threadName+" locked lock 2");
            }
        }
    }}
