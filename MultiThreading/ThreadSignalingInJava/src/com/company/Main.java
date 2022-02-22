package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        // Thread signaling is a technique is which when one thread is busy is performing task then other will wait and when its free then
        // That thread will perform notify to notify threads which are waiting
        // This is simple way to send signals to each other by setting signal value in a shared object variable.

        // First technique is illustrated by MyRunnable1 and MySignal1 and MyRunnable2
        // Here one thread will provide the data and notify other thread that data has come use it
        MySignal1 signal1 = new MySignal1();

        new Thread(new MyRunnable1(signal1)).start();
        new Thread(new MyRunnable2(signal1)).start();
        System.out.println("-------------------------");

        // Above is the simple use by which one thread can noty other
        // But in above busy waiting is not efficient way of utilizing CPU
        // Cause the waiting thread keeps running, we can use above only if waiting time is less
        // And in output also we can see that Consuming thread is waiting for long time
        // So better solution is that to amke thread sleep or make it inactive for some time until the data is available
        // This can be done by passing the Object which has methods wait() and notify() and notifyAll()
        // wait() method will make the thread sleep until the notify() or notifyAll() has been called
        // notify() method will awake only one thread from waiting threads
        // notifyAll() method will awake all threads which are in wait mode
        // Explanation and implementation is given in MyRunnable3 and MyRunnable4 and MySignal2

        MySignal2 signal2 = new MySignal2();
        new Thread(new MyRunnable4(signal2)).start();
        new Thread(new MyRunnable3(signal2)).start();

        // In above we can see the problem of Missed signal
        // Like when producing signal has notified at that time waiting signal has missed that signal
        // This will lead the waiting thread be waiting always

        // above can be solved using one signal variable with object


    }
}
