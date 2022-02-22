package com.company;

import java.util.concurrent.atomic.AtomicLong;

public class MyRunnable2 implements Runnable{
    AtomicLong atomicLong = null;
    MyRunnable2(AtomicLong atomicLong)
    {
        this.atomicLong = atomicLong;
    }

    // Here more than one thread can enter this critical section
    // But when more than one thread try to change the value at same time it wont be possible
    // Value will only be changed when variable value will be equal to atomicLong value

    public void incCount()
    {
        boolean isSuccesfull = false;
        while (!isSuccesfull)
        {
            long value = atomicLong.get();
            long newValue = value+1;

            isSuccesfull = atomicLong.compareAndSet(value,newValue);
        }
    }

    public void getCount()
    {
        System.out.println(Thread.currentThread().getName()+" has incremented value to : "+atomicLong);
    }
    @Override
    public void run() {
        incCount();
        getCount();
    }
}
