package com.company;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class MyRunnable2 implements Runnable{

    Lock lock1 = null;
    Lock lock2 = null;
    MyRunnable2(Lock lock1, Lock lock2)
    {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true)
        {
            int failCount = 0;
            while (!tryBothLock())
            {
                failCount++;
                System.err.println(name+" failed to lock both locks. Waiting a bit and try again.");
                try {
                    Thread.sleep(100*(int)Math.random());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            {
                System.out.println(name+" has succesfully locked both lock");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock1.unlock();
            lock2.unlock();
        }
    }

    public boolean tryBothLock()
    {
        try {
            boolean lock2Succeed = lock2.tryLock(1000, TimeUnit.MILLISECONDS);
            if (!lock2Succeed)
            {
                return false;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }

        try {
            boolean lock1Succeed = lock1.tryLock(1000,TimeUnit.MILLISECONDS);
            if(!lock1Succeed)
            {
                return false;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
