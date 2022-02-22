package com.company;

public class Lock {
    private  boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {
        while (isLocked)
        {
            // Here waiting will be done
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock()
    {
        isLocked = false;
        notify();
    }

}
