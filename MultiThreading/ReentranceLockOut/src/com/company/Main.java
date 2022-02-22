package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Reentrance Lockout occures when one thread is entered into lock and try to acquire another lock but that lock is not Reentrance
        // Reentrant means A thread has already holds the lock and can retake the lock
        // But if lock is not reentrant then if lock try to retake the lock without unlocking first one
        // thread will enter into reentrant lock.

        // For example as below
        // Here lock is not Rentrant so when we try to reatke the lock we will stuck into Reentrance lockout

        Lock lock = new Lock();
        try {
            lock.lock();
            System.out.println("1 lock taken");
            lock.lock();
            System.out.println("Second Lock taken");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
        lock.unlock();


    }
}
