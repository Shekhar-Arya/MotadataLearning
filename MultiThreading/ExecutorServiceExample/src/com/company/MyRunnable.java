package com.company;

public class MyRunnable implements Runnable{
    String msg = "";
    MyRunnable(String msg)
    {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" has completed : "+msg);
    }
}
