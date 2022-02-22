package com.company;

public class MyRunnable implements Runnable{
    int count; // This will be shared by all Threads sharing same object
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
                count++;
            }
        System.out.println(Thread.currentThread().getName()+" : "+count); // This should print 200000 in total for but it will not because of Race condition

    }
}
