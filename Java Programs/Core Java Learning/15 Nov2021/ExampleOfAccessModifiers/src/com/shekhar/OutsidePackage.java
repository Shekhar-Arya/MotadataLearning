package com.shekhar;

/**
 * Created by shekhar on 15/11/21.
 */
public class OutsidePackage {

    void display2()
    {
        System.out.println("This is Hi from default method of Outside Package class");
    }
    protected void dispaly3()
    {
        System.out.println("This is Hi from protected method of Outside Package class");
    }
    public void display4()
    {
        System.out.println("This is Hi from public method of Outside Package class");
    }

}
