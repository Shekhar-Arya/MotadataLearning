package com.company;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        new Thread(new ProducerRunnable(blockingQueue)).start();
        new Thread(new ConsumerRunnable(blockingQueue)).start();

        // As we can see that producer thread add the element to the queue and consumer threads remove the element from the queue
        // And blocking is thread safe so there is no problem of concurrency

    }
}
