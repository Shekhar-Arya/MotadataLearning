package com.company;

public class MyRunnable2 implements Runnable{
    MySignal1 signal1 = null;
    MyRunnable2(MySignal1 signal1)
    {
        this.signal1 = signal1;
    }

    @Override
    public void run() {
        System.out.println("Providing data");
        signal1.setHasData(true);
        System.out.println(Thread.currentThread().getName()+" has provided data");
    }
}
