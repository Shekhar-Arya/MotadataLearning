package com.company;

public class MySignal2 {
    Object object = new Object();

    public void doWaitForData()
    {
        synchronized (object){
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // In above and below we can see that we have defined synchronized block with object as a monitor object
    // Because we cant use the object to wait and notify without holding lock on it
    // otherwise it will throw illegealMonitorObject State Exception

    public void doNotify()
    {
        synchronized (object)
        {
            object.notify();
        }
    }

}
