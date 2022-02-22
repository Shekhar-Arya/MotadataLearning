package com.company;

public class MyRunnable3 implements Runnable{
    MySignal2 signal2 = null;
    MyRunnable3(MySignal2 signal2)
    {
        this.signal2 = signal2;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Producing Data");
        signal2.doNotify();
        System.out.println(Thread.currentThread().getName()+" Produced Data for use");
    }
}
