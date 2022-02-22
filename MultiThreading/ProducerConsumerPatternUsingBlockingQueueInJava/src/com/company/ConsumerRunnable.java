package com.company;

import java.util.concurrent.BlockingQueue;

public class ConsumerRunnable implements Runnable{
    BlockingQueue<String> blockingQueue =null;
    ConsumerRunnable(BlockingQueue<String> blockingQueue)
    {
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        while (true)
        {
            try {
                System.out.println(Thread.currentThread().getName()+" Consumed : "+this.blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
