package com.company;

public class CalcGstRunnable implements Runnable{

    @Override
    public void run() {
        try
        {
            while (true)
            {
                Double basePrices = CommonUtil.takeBasePrice();

                if (basePrices != null)
                {
                    // calcula
                    double gstPrices = (basePrices*7)/100+basePrices;
                    // put
                    CommonUtil.putGstPrice(gstPrices);
                }
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

    }
}
