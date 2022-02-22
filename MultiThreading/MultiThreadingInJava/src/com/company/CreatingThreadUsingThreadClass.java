package com.company;

public class CreatingThreadUsingThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println("This thread is from thread Sub Class");
    }
}
