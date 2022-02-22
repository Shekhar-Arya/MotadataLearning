package com.company;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    String msg = "";
    MyCallable(String msg)
    {
        this.msg = msg;
    }
    @Override
    public Object call() throws Exception {
        return Thread.currentThread().getName()+" has completed : "+msg;
    }
}
