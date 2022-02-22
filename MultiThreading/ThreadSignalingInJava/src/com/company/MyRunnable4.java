package com.company;

public class MyRunnable4 implements Runnable{
    MySignal2 signal2 = null;
    MyRunnable4(MySignal2 signal2)
    {
        this.signal2 = signal2;
    }

    @Override
    public void run() {
        System.err.println(Thread.currentThread().getName()+" Waiting for data");
        signal2.doWaitForData();
        System.out.println( Thread.currentThread().getName()+" Consumed data");
    }
}
