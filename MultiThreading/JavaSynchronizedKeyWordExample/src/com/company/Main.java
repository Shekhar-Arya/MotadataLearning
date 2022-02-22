package com.company;

public class Main {

    public static void main(String[] args) {

        // Synchronized block is either can be used with the method (Static and instance both) or as a block of synchronized
        // It gauratee that at a time only one thread can access this block and it will make other thread wait
        // It also fetch the value directly from the main memory and gaurantee the (happens before)
        // Synchronized block takes something as to instance with as belowExample
        // synchronized (Main.class){}
        // It synchronizes on the bases of the instance or variable passed in it.
        // to different block with two different instance or variable will not in synchronize with other synchronized blocks
        // Synchronized methods are synchronized over Class

        // We have one example done in this program

        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable,"Thread 1 ");
        Thread thread2 = new Thread(runnable,"Thread 2 ");
        thread1.start();
        thread2.start();
        // Here we can see if we dont use synchronized block then it will not have proper value as because of Race Condition
        // And to solve this problem we can use synchronized key word in run() in MyRunnable class
        // After using synchronized with run() in MyRunnable class now at least one thread will have correct answer;
        new Main().method1();
        Main.method2();
        new Main().method3();
        Main.method4();
        Main.method5();

    }

    // Synchronized block have several limitations:
    // 1. Synchronized only allow single thread to have access to the block so  what is another thread just needs to read the data
    // in above case we can use Read / Write block which is more efficient than synchronized block
    // 2. what if we want N threads to enter synchronize block this can be achieved by Semaphore
    // 3. What if only one therad is writing the variable and other are just reading the variable in that case we can just use volatile


    // Synchronized Block Reentrance
    // It means that once the block has entered into te synchronized block then it also can re enter into other synchronized block which
    

    public synchronized void method1()
    {
        System.out.println("Synchronized used with instance method");
    }
    public static synchronized void method2()
    {
        System.out.println("Synchronized used with Static method");
    }
    public void method3()
    {
        synchronized (this){        // Here this is refrences to the current class instance
            System.out.println("Synchronized block inside the instance method");
        }
    }
    public static void method4()
    {
        synchronized (Main.class){ // Here Main.class is refrenced to Main class itself
            System.out.println("Synchronized block inside the static method");
        }
    }
    public static void method5()
    {
        synchronized (String.class){    // As we can see we can pass different isnstance with different refrences also
            // but it will not be synchronized with other synchronized blocks with different references.
            System.out.println("Synchronized block inside the static method with different instance");
        }
    }

}
