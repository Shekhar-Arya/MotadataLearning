package com.company;

public class MyRunnable1 implements Runnable{
    MySignal1 signal1 = null;
    MyRunnable1(MySignal1 signal1)
    {
        this.signal1 = signal1;
    }
    @Override
    public void run() {
        while (!signal1.isHasData())
        {
            // Busy wait it will wait until this thread will have access
            System.err.println(Thread.currentThread().getName()+" has been waiting for data");   // No data to perform
        }
        System.out.println(Thread.currentThread().getName()+" has Consumed Data");
        signal1.setHasData(false);
    }
}
