package com.company;

public class MyRunnable implements Runnable{
    int count = 0;  // This variable is globally stores so if two threads access same object of this class then they will point to same count variable
                    // hence making it shared
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) { // here i is local variable and will e stored in threads own stack.
            count++;
        }
        System.out.println(Thread.currentThread().getName()+" : "+count);
    }
}
