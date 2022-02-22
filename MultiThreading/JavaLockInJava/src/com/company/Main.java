package com.company;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        // Lock Works same as synchronized block
        // the content between lock.lock() and lock.unlock() is only accesed by one thread at a time.
        // When that thread unlock the lock then other thread can take that lock and use it.
        // It can also be reentering like synchronized block one thread can acquire one lock and then enter to the another lock to do something else
        // Main difference between lock and synchronized are:
        // 1. We can maintain the fairness means it will allow the lock in order the thread came to acquire lock.
        // 2. It can choose not to be reentering
        // 3. It provide same functionality of visibilty gaurantee and eleminate thread condition

        // As we can see below code works same as synchronized block

        Runnable runnable = new Runnable(){
            int count = 0;
            Lock lock = new ReentrantLock();
            @Override
            public void run() {
                lock.lock();
                for (int i = 0; i < 1000; i++) {
                    count++;
                }

                System.out.println(Thread.currentThread().getName()+" : "+count);
                lock.unlock();
            }
        };
        new Thread(runnable, "Thread 1").start();
        new Thread(runnable, "Thread 2").start();

        // we can also pass true to ReentrantLock constructor which will allow fairness which means it allow order in thread.
        Runnable runnable1 = new Runnable(){
            int count = 0;
            Lock lock = new ReentrantLock(true);
            @Override
            public void run() {
                try{
                    lock.lock();
                    for (int i = 0; i < 1000; i++) {
                        count++;
                    }

                    System.out.println(Thread.currentThread().getName()+" : "+count);
                }
                finally {
                    lock.unlock();
                }
            }
        };
        new Thread(runnable1, "Thread 11").start();
        new Thread(runnable1, "Thread 22").start();
        // In above example we can see i have use try and finally block which ensures that if any problem occurs during the
        // run of lock block then it finnaly unlock the locked block for further execution

        // Basic methods in lock interface
        Lock lock = new ReentrantLock(true);

        //1.lockInterruptibly() method only lock the lock when there no interuption else it will not lock the lock
        try {
            lock.lockInterruptibly();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //2. tryLock() this will try to lock only lock the lock when the lock is free otherwise it wont
        // this tryLock does not gaurantee fairness even if it is true in Lock so we use below try lock but it also not gaurantee very much
        try {
            boolean isLockAvailable = lock.tryLock();
        }
        finally {
            lock.unlock();
        }

        // 3. It also have tryLock(time_in_miliseconds, TimeUnit)
        try {
            lock.tryLock(1000, TimeUnit.MILLISECONDS);
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Methods of Reentrant lock
        ReentrantLock lock1 = new ReentrantLock();
        // 4. getHoldCount() we can check how many times current lock has locked the lock
        System.out.println(lock1.getHoldCount());
        //5. getQueueLength() tells how many threads are in waiting to use the lock
        System.out.println(lock1.getQueueLength());
        // 6. hasQueuedThread(Thread.currentThread()) tells if the passed thread is in queue or not
        System.out.println(lock1.hasQueuedThread(Thread.currentThread()));
        // 7. isFair() check wether is Fair is on or not
        lock1.isFair();
        // 8. isLocked() checks wetrher the Lock is locked or not
        lock1.isLocked();
        // 9. isHeldByCurrentThread() checks wether current thread holds the lock ot not
        lock1.isHeldByCurrentThread();





    }
}
