package com.company;

public class Main extends Main1  {

    int a;
    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println(new Main().a);
        String ss = new String("Nilesh");
        String sss = new String("Nilesh");
        System.out.println(ss==sss);
        String s1 = "Shekhar";
        String s2=s1.substring(0,s1.length()-1);
        System.out.println(s2);
        //System.out.println(obj.i);
        //obj.method1(1,2);
        long a = 12L;
        int b = (int) a;
        int z = 10<11?2:3;
        System.out.println(z);
    }

    public void method1 (int a, long b)
    {
        System.out.println("Method 1");
    }

    public  void method1 (long a, int b)
    {
        System.out.println("Method 2");
    }
}

interface interface1{
    public void A();
        }

interface interface2{
    public void A();
}

class Main1{
    private int i;
    private int a;

    Main1() {
    }

    public int getI(){
        return i;
    }
    public int getA()
    {
        return a;
    }
    public void setI(int i)
    {
        this.i = i;
    }
    public void setA(int a)
    {
        this.a = a;
    }
}