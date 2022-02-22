package com.Client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DatagramClientSocket {

    public static void main(String[] args) throws InterruptedException {
        /*Thread thread = new Thread(new DatagramClientRunnable());
        Thread thread1 = new Thread(new DatagramClientRunnable());
        Thread thread2 = new Thread(new DatagramClientRunnable());
        */ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            service.execute(new DatagramClientRunnable());
        }
    }
}
