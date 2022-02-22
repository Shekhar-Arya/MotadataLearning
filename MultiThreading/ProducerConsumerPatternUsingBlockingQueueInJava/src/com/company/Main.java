package com.company;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Producer Consumer pattern is used in many of the problems or scenarios
        // Its simply work as one or more thread try to put work in queue and one or more worker thread take the work from queue and Execute it.
        // it can be used in load balancing like tasks can be devided among the number of threads
        // Also if there are so many request coming to be processed than if queue will get full then no more request will be added to the queue and
        // load to the worker thread will get stable.
        // It can be implemented as below:

        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        new Thread(new ProducerRunnable(blockingQueue)).start();
        new Thread(new ConsumerRunnable(blockingQueue),"Thread 1").start();
        new Thread(new ConsumerRunnable(blockingQueue),"Thread 2").start();

    }
}
