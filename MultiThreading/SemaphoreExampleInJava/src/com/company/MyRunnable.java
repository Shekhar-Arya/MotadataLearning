package com.company;

import java.util.concurrent.Semaphore;

public class MyRunnable implements Runnable{

    Semaphore semaphore = null;
    Counter counter = null;
    MyRunnable(Semaphore semaphore, Counter counter)
    {
        this.semaphore = semaphore;
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" waiting for the lock");

        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+" has got the permit");
            for (int i = 0; i < 10; i++) {
                Counter.count++;
                System.out.println(Thread.currentThread().getName()+" : "+Counter.count);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" releases the permit");
        semaphore.release();
    }
}
