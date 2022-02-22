package com.company;

public class CalcServRunnable implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                Double gstPrices = CommonUtil.takeGstPrice();

                if (gstPrices != null)
                {
                    // calcula
                    double servPrices = (gstPrices*7)/100+gstPrices;
                    // put
                    CommonUtil.totalCalculated++;
                    CommonUtil.putServPrice(servPrices);
                }


            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

    }
}
