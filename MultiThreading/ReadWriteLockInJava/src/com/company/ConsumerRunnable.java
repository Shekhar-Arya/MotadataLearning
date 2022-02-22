package com.company;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ConsumerRunnable implements Runnable{
    ReentrantReadWriteLock readWriteLock = null;
    ConsumerRunnable(ReentrantReadWriteLock readWriteLock)
    {
        this.readWriteLock = readWriteLock;
    }

    @Override
    public void run() {
        if(!readWriteLock.readLock().tryLock())
        {
            System.err.println(Thread.currentThread().getName()+" is Waiting for lock to read");
        }
        else {
            readWriteLock.readLock().unlock();
        }
        readWriteLock.readLock().lock();
        System.out.println(Thread.currentThread().getName()+" has lock to read");
        readWriteLock.readLock().unlock();
    }
}
