package com.company;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ProducerRunnable implements Runnable{
    ReentrantReadWriteLock readWriteLock = null;
    ProducerRunnable(ReentrantReadWriteLock readWriteLock)
    {
        this.readWriteLock = readWriteLock;
    }

    @Override
    public void run() {
        if(!readWriteLock.writeLock().tryLock())
        {
            System.err.println(Thread.currentThread().getName()+" is Waiting for lock to write");
        }
        else {
            readWriteLock.writeLock().unlock();
        }
        readWriteLock.writeLock().lock();
        System.out.println(Thread.currentThread().getName()+" has lock to write");
        readWriteLock.writeLock().unlock();
    }
}
