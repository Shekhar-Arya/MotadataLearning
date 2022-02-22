package com.company;

import java.util.*;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> arrayBlockingQueue =  new ArrayBlockingQueue<Integer>(5);

        // ArrayBlocking Queue requires fixed value to create its instance.
        // it create the blocking Queue of fixed size.
        // It is also known as bounded blocking queue. Based on Array
        // It follows the order of FIFO
        // new elements are added to the rear of the queue and element retrival is done at the front of the queue.
        // Once size is assigned cannot change the size of the queue.
        // on put element to the full queue it will lead to blocking of the thread
        // similarly goes for take element from the empty queue.
        // It doesnt permit null it will throw an Exception

        // It also support fairness policy if fairness is true then thread access in FIFO order

        // Methods of the Array Blocking Queue

        // 1. TO add elements
            // add() method return true if adding is possible else it will throw illegalStateException
            arrayBlockingQueue.add(1);
            // offer() method return true if adding is possible else false if adding is not possible
            arrayBlockingQueue.offer(2);
            // offer(value, long timeout, TimeUnits tu) while adding if queue is full it will wait for give time then it will return false
            arrayBlockingQueue.offer(3,1000, TimeUnit.MILLISECONDS);
            // put() method insert the element to the queue if queue is full it will wait space
            arrayBlockingQueue.put(4);

        // 2. To remove elements
            // take() method remove the element from the queue if queue is empty it will wait
            arrayBlockingQueue.take();
            // poll() method remove and retrieves the head element else it will return null if queue is empty
            arrayBlockingQueue.poll();
            // poll(time, TimeUnit tu) method retrieves and remove head element else it will wait for specified time for element to become available
            arrayBlockingQueue.poll(1000,TimeUnit.MILLISECONDS);
            // remove(object) method remove the specified element from the queue if it is present does not follow FIFO order
            arrayBlockingQueue.remove(1);
            // clear() method remove all the elements from the queue

        // 3. Some Extra methods are

            //peek() method retrieves head element of the queue
            arrayBlockingQueue.peek();
            //contains(obj) method return true if specified object is available in queue or else false
            arrayBlockingQueue.contains(1);
            //size() method returns the total number of elements in queue
            arrayBlockingQueue.size();
            // remainingCapacity() return the space available in queue
            arrayBlockingQueue.remainingCapacity();
            // drainTo(Collection c) method drain all element from queue and add to the provided collection
            List<Integer> list = new ArrayList<>();
            arrayBlockingQueue.drainTo(list);
            // drainTo(Collection c, int max) method drain atmost specified number of elements from queue to Specified collection
            arrayBlockingQueue.drainTo(list,3);

            // it also have toArray() method and toString() Method


        // 1. TO add elements
        // add() method return true if adding is possible else it will throw illegalStateException
        arrayBlockingQueue.add(1);
        // offer() method return true if adding is possible else false if adding is not possible
        arrayBlockingQueue.offer(2);
        // offer(value, long timeout, TimeUnits tu) while adding if queue is full it will wait for give time then it will return false
        arrayBlockingQueue.offer(3,1000, TimeUnit.MILLISECONDS);
        // put() method insert the element to the queue if queue is full it will wait space
        arrayBlockingQueue.put(4);


        // 4. Traversing through ArrayBlockingQueue

            // Using forEach loop
        for (Integer i:arrayBlockingQueue
             ) {
            System.out.println(" Using for Each loop"+i);
        }

        // Using ArrayBlockingQueue.forEach Loop
        arrayBlockingQueue.forEach(integer -> System.out.println("Using forEachMethod "+integer));

        // Using iterator
        Iterator<Integer> iterator = arrayBlockingQueue.iterator();
        while (iterator.hasNext())
        {
            System.out.println("Using Iterator " +iterator.next());
        }


    }
}
