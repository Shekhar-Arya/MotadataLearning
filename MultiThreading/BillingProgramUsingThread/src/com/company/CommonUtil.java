package com.company;

import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

public class CommonUtil
{
    private static final LinkedBlockingQueue<Double> m_basePrices = new LinkedBlockingQueue<>();
    private static final LinkedBlockingQueue<Double> m_gstPrices = new LinkedBlockingQueue<>();
    private static final LinkedBlockingQueue<Double> m_servPrices = new LinkedBlockingQueue<>();
    static volatile int totalCalculated = 0;

    public static Double takeBasePrice()
    {
        try {
            return m_basePrices.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static void putBasePrice(Double price)
    {
        try {
            m_basePrices.put(price);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static Double takeGstPrice()
    {
        try {
            return m_gstPrices.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static void putGstPrice(Double price)
    {
        try {
            m_gstPrices.put(price);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


        public static Double takeServPrice()
    {
        try {
            return m_servPrices.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static void putServPrice(Double price)
    {
        try {
            m_servPrices.put(price);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
