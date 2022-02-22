package com.company;

public class Main {

    public static void main(String[] args) {

        // Thread Local is used to create a variable that can only be read and write by the same thread.
        // Even if two or more threads are refrecening to the same ThreadLocal Variable
        // Here two threads cannot see each others ThreadLocal Variable
        // Thus we can simply make the code thread safe

        // Creating ThreadLocal
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        // Setiing value
        threadLocal.set("Shekhar");
        // Get Value
        threadLocal.get();

        // remove value
        threadLocal.remove();

        // Setting Initial value to the ThreadLocal Variable
        //1. by overriding initialValue()
        ThreadLocal<String> threadLocal1 = new ThreadLocal(){
            @Override
            protected Object initialValue() {
                return "Shekhar";
            }
        };
        // 2. Using withInitial
        ThreadLocal threadLocal2 = ThreadLocal.withInitial(() -> {return "Shekhar";});

        // Lazy Setiing of the ThreadLocal Variable as below
        if (threadLocal.get()==null)
        {
            threadLocal.set("Shekhar");
        }

        // Example of ThreadLocal
        Thread thread1 = new Thread(() -> {
            threadLocal.set("Thread 1");        // Here we can see as both threads uses same threadLocal variables but value for them is different.
            System.out.println(threadLocal.get());
        });

        Thread thread = new Thread(()->
        {
            threadLocal.set("Thread 2");
            System.out.println(threadLocal.get());
        });
        thread.start();
        thread1.start();
        // Also removing do the same it only remove the value assigned by its own thread and not other thread.


        //Java also have concept of InheritableThreadLocal
        // As ThreadLocal have different for all threads, InheritableThreadLocal variable can have same value of parent thread and child threads only if other threads
        // are child thread of the parent Thread
        // Example as below
        InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();
        Thread thread2 = new Thread(()->{                               // As thread3 is inside thread2 it will inherit the value of inheriableThreadLocal
           inheritableThreadLocal.set("Inheritable Local thread 1");
            System.out.println(inheritableThreadLocal.get());
            threadLocal.set("Thread Local 1");

            Thread thread3 = new Thread(()->{
                System.out.println(inheritableThreadLocal.get());   // It will have value of its parent
                System.out.println(threadLocal.get());// And it will be null because for all threads its different.
            });
            thread3.start();
        });
        thread2.start();


        // If we are using ThreadLocal with Thread Pool then we have to be little carefull
        // As the ThreadLocal will have different value only for threads not for tasks
        // For Example we have two threads in thread pool and four tasks then first two task will use two threads and they store
        // access the ThreadLocal and set the value then only two values will be stored in ThreadLocal
        // Now as these thread will be free and other two tasks come to use these threads then they wlll have value which are set by the previous two threads
        // Because ThreadLocal is only specific to threads.






    }
}
