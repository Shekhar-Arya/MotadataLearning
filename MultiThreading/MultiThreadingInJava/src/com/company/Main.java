package com.company;

public class Main {

    public static void main(String[] args) {
//	write your code here
//    Creating java threads
//    There are several ways to create a java thread

//    1. Directly create the instance of the Thread Class
        Thread thread = new Thread();
        thread.start();
        // As above thread has no implementation so it will just start and stop

//     2. Creating Thread Sub class implement run method
        CreatingThreadUsingThreadClass creatingThreadUsingThreadClass = new CreatingThreadUsingThreadClass();
        creatingThreadUsingThreadClass.start();
        // Above will start and run the thread sub class implemented

//      3. Creating Anonymous  thread class
         Thread thread1 = new Thread(){
             @Override
             public void run() {
                 System.out.println("Using Thread Anonymous class");
             }
         };
         thread1.start();
         // also as below
        new Thread(){
            @Override
            public void run() {
                System.out.println("Using Thread Anonymous class 2");
            }
        }.start();

//     4. By implementing Runnable interface to the class and passing its instance to the Thread class
        CreatingThreadUsingRunnableInterface creatingThreadUsingRunnableInterface = new CreatingThreadUsingRunnableInterface();
        Thread thread2 = new Thread(creatingThreadUsingRunnableInterface);
        thread2.start();

//     5. By passing instance of the runnable class to thread without creating object variable
         Thread thread3 = new Thread(new CreatingThreadUsingRunnableInterface());
         thread3.start();

//     6. Adding anonymous runnable implemenation while passing to the Thread class
         Thread thread4 = new Thread(new Runnable() {
             @Override
             public void run() {
                 System.out.println("Using Anonymous implemenation of Runnable interface in thread");
             }
         });
         thread4.start();

//      7. Adding Anonymous runnable to thread
         Runnable runnable = new Runnable() {
             @Override
             public void run() {
                 System.out.println("Using Anonymous implemenation of Runnable interface in thread 2");
             }
         };
         Thread thread5 = new Thread(runnable);
         thread5.start();

//      8. Lambda Implementation of Runnable
         Runnable runnable1 = () -> {
             System.out.println("Using lambda implementation of runnable");
         };
         Thread thread6 = new Thread(runnable1);
         thread6.start();


         // If we call run() instead of start() method than it will not create the another thread tho perform the task instead it will just perform the task in same thread.

        // We can also pass the thread name while creating the thread instance and get the thread name by getName() method
        // As below;
        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }, "This is thread name");
        thread7.start();

        // Also as like this
        new Thread("Shekhar"){
            @Override
            public void run() {
                System.out.println(getName());
            }
        }.start();

        // we can pause the thread using static method Thread.sleep() which takes miliseconds as parameter after the specified miliseconds thread will resume again
        new Thread("Thread thread")
        {
            @Override
            public void run() {
                System.out.println(getName()+" is paused");
                try {
                    Thread.sleep(1000);
                    System.out.println(getName()+" is resumed");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        // How to stop thread?
        // Thread class has stop() method but it is deprecated method stop() method would not provide any guarantees about in what state the thread was stopped.
        // so to stop the method we have to implelemnt the code to stpo the thread

        // Java application will run even if the main thread is terminated but another thread is running
        // so to avoid such cases we can set those long running thread as deamon thread
        // thread.setDaemon(true);

        // But above will terminate the thread in unknown state this might create a problem

        // To complete the execution of the thread even after the main thread is completed then with setting thread with setDeamon to true
        // and assign that thread with join() as below;
        /*try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    }
}
