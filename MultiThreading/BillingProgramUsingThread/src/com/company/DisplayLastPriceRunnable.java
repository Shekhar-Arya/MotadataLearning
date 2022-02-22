package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class DisplayLastPriceRunnable implements Runnable{

    private static final AtomicInteger count = new AtomicInteger();
    int count1 = 0;

    @Override
    public void run() {
        try
        {
            while (true)
            {
                Double servPrices = CommonUtil.takeServPrice();

                    if (servPrices != null)
                    {
                        count.incrementAndGet();

                        //count1++;
                        System.out.println("Calculated : "+servPrices);
                    }
                if (count.get() >= 1000)
                {
                    count.set(0);
                    System.out.println(count.get());
                    //System.out.println(count1);
                }



                }
        }

        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
