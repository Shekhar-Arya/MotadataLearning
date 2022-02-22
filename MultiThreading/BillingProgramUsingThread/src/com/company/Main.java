package com.company;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        try
        {

            /*for (double i = 1000; i < 2000; i++) {
                CommonUtil.putBasePrice(i);
            }*/


            /*
            ExecutorService service = Executors.newFixedThreadPool(3);
            service.execute(new CalcGstRunnable());
            service.execute(new CalcServRunnable());
            service.execute(new DisplayLastPriceRunnable());

*/          Thread.sleep(5000);

            Thread thread = new Thread(new CalcGstRunnable(), "Thread CalcGST");
            Thread thread1 = new Thread(new CalcServRunnable(),"Thread CalcSERV");

            //DisplayLastPriceRunnable displayLastPriceRunnable = new DisplayLastPriceRunnable();
            Thread thread2 = new Thread(new DisplayLastPriceRunnable(),"Thread Display");
/*
            Thread thread3 = new Thread(new DisplayLastPriceRunnable());
            Thread thread4 = new Thread(new DisplayLastPriceRunnable());
*/

            thread.start();
            thread2.start();
            thread1.start();

/*
            thread3.start();
            thread4.start();
*/

            for (double i = 1000; i < 200000; i++) {
                CommonUtil.putBasePrice(i);
                Thread.sleep(1000);
            }


            //Thread.sleep(2000);
            //thread2.join();
            //service.awaitTermination(200, TimeUnit.MILLISECONDS);

            // start all thread

            // put base prices of the prodcut in queue

            // last thread will print all the final generated value
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

    }
}
