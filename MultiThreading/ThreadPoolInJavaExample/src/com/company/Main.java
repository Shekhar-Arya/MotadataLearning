package com.company;


import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;

public class Main {

    public static void main(String[] args) throws Exception {

        // This is user made Thread Pool


        // ThreadPool is used to Execute the tasks by specific number of threads
        // We can control the number of threads to create using thread pool
        // It will be not appropriate if we create different threads of each tasks
        // ThreadPool internally have ArrayBlocking Queue which handles the number of tasks to perform
        // and maintains the number of thread to create and use.
        // So if enter 10 tasks and 3 threads inside the thread pool then,
        // This three threads will execute the first three tasks and then as they will get free next tasks will get executed
        // The taking of tasks from ArrayBlocking Queue will in FIFO order
        // But threads dont gaurantee the order as which thread will take first task and which will take next
        // And they also dont gauratee the time take to execute the tasks

        // Example of ThreadPool
        ThreadPool threadPool = new ThreadPool(3, 10);

        for(int i=0; i<10; i++) {

            int taskNo = i;
            threadPool.execute( () -> {
                String message =
                        Thread.currentThread().getName()
                                + ": Task " + taskNo ;
                System.out.println(message);
            });
        }

        threadPool.waitUntilAllTasksFinished();
        threadPool.stop();

    }
}
