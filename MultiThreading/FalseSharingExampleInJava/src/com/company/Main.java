package com.company;

import jdk.internal.vm.annotation;
import sun.misc.Contended;

public class Main {

    @Contended("Group1")
    long count1 = 0;

    @Contended("Group2")
    long count2 = 0;

    @Contended("Group1")
    long count3 = 0;

    @Contended("Group2")

            // We can also group them as above
    long count4 = 0;
    public static void main(String[] args) throws InterruptedException {
	// write your code here
        // To understand FalseSharing we have to first Understand CacheCoherence
        // CacheCoherence means that value of the shared object or variables are visible to two or more threads at Cache level also.
        // Means they can use the variable from main memory but also from the cache of the different CPU
        // Means Two or more threads running on differnt CPU can read access the Shared Data from the CPU's different Cache

        //False Sharing Occures when two or more threads running on two or more different CPU uses two or more
        // different variable of same shared object and these variable Are in same Cache Line to the Main memory
        // For Example variable 1 is used by Thread 1 and variable 2 is used by Thread 2 of same Shared Object Which are in Same Cache Line
        // These both variable will be shared to both threads even if they only need one of them
        // Now when Thread 1 updates variable 1 it will also get updated with thread 2 even if thread 2 is not using it
        // And same goes to Thread 2 for variable 2 and these leads in taking more time to perform the task
        // Below will show the problem using time consuming
        Main main = new Main();

        Thread thread1 = new Thread(()-> {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                main.count1++;
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Total time taken by "+Thread.currentThread().getName()+" is : "+(endTime-startTime));
        });
        Thread thread2 = new Thread(()-> {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                main.count2++;
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Total time taken by "+Thread.currentThread().getName()+" is : "+(endTime-startTime));
        });
        // As in above we can see bot threads uses two different variables but because of False Sharing time taken will be more
        thread1.start();
        thread2.start();

        //Thread.sleep(1000);

        // To avoid above problem we can use two different objects for different threads
        // But what if we want to use Same object and avoid this problem then we can use Contended Annotation as used in Count 3 and 4 at top
        // This will add padding to the varibale which will force it to be stored in different Cache Line
        // And as now if we use these variables sa me above it will take less time than above

        Thread thread3 = new Thread(()-> {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                main.count2++;
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Total time taken by "+Thread.currentThread().getName()+" is : "+(endTime-startTime));
        });

        Thread thread4 = new Thread(()-> {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                main.count2++;
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Total time taken by "+Thread.currentThread().getName()+" is : "+(endTime-startTime));
        });

        thread3.start();
        thread4.start();
    }
}
