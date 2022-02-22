package com.company;

public class MyRunnable implements Runnable{
    Lock lock = null;
    MyRunnable(Lock lock)
    {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            lock.lock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" Lock is taken");
    }
}
