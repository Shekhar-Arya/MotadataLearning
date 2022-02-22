package com.company;

import java.util.concurrent.BlockingQueue;

public class ProducerRunnable implements Runnable{
    BlockingQueue<String> blockingQueue =null;
    ProducerRunnable(BlockingQueue<String> blockingQueue)
    {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        while (true)
        {
            try {
                this.blockingQueue.put(""+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
