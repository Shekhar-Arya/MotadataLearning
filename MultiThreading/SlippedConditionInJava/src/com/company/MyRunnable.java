package com.company;

public class MyRunnable implements Runnable{

    Lock lock = null;
    MyRunnable(Lock lock)
    {
        this.lock = lock;
    }


    @Override
    public void run() {
        lock.lock();
        System.out.println(Thread.currentThread().getName()+" has taken lock");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }
}
