package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

        BlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<Integer>();

        // It does not require fixed size to create it instance
        // It is Optionally bounded blocking queue. Based on linked nodes
        // It follows the FIFO order
        // Value is added to the rear and removed from the front of the queue
        // Linked nodes are created dynamically on insertion unless this would bring queue above capacity.
        // If not specified its capacity is Integer.Max_Value

        // on put element to the full queue it will lead to blocking of the thread
        // similarly goes for take element from the empty queue.
        // It doesnt permit null it will throw an Exception

        // Methods of the Array Blocking Queue

        // 1. TO add elements
        // add() method return true if adding is possible else it will throw illegalStateException
        linkedBlockingQueue.add(1);
        // offer() method return true if adding is possible else false if adding is not possible
        linkedBlockingQueue.offer(2);
        // offer(value, long timeout, TimeUnits tu) while adding if queue is full it will wait for give time then it will return false
        linkedBlockingQueue.offer(3,1000, TimeUnit.MILLISECONDS);
        // put() method insert the element to the queue if queue is full it will wait space
        linkedBlockingQueue.put(4);

        // 2. To remove elements
        // take() method remove the element from the queue if queue is empty it will wait
        linkedBlockingQueue.take();
        // poll() method remove and retrieves the head element else it will return null if queue is empty
        linkedBlockingQueue.poll();
        // poll(time, TimeUnit tu) method retrieves and remove head element else it will wait for specified time for element to become available
        linkedBlockingQueue.poll(1000,TimeUnit.MILLISECONDS);
        // remove(object) method remove the specified element from the queue if it is present does not follow FIFO order
        linkedBlockingQueue.remove(1);
        // clear() method remove all the elements from the queue

        // 3. Some Extra methods are

        //peek() method retrieves head element of the queue
        linkedBlockingQueue.peek();
        //contains(obj) method return true if specified object is available in queue or else false
        linkedBlockingQueue.contains(1);
        //size() method returns the total number of elements in queue
        linkedBlockingQueue.size();
        // remainingCapacity() return the space available in queue
        linkedBlockingQueue.remainingCapacity();
        // drainTo(Collection c) method drain all element from queue and add to the provided collection
        List<Integer> list = new ArrayList<>();
        linkedBlockingQueue.drainTo(list);
        // drainTo(Collection c, int max) method drain atmost specified number of elements from queue to Specified collection
        linkedBlockingQueue.drainTo(list,3);

        // it also have toArray() method and toString() Method


        // 1. TO add elements
        // add() method return true if adding is possible else it will throw illegalStateException
        linkedBlockingQueue.add(1);
        // offer() method return true if adding is possible else false if adding is not possible
        linkedBlockingQueue.offer(2);
        // offer(value, long timeout, TimeUnits tu) while adding if queue is full it will wait for give time then it will return false
        linkedBlockingQueue.offer(3,1000, TimeUnit.MILLISECONDS);
        // put() method insert the element to the queue if queue is full it will wait space
        linkedBlockingQueue.put(4);


        // 4. Traversing through linkedBlockingQueue

        // Using forEach loop
        for (Integer i:linkedBlockingQueue
        ) {
            System.out.println(" Using for Each loop"+i);
        }

        // Using linkedBlockingQueue.forEach Loop
        linkedBlockingQueue.forEach(integer -> System.out.println("Using forEachMethod "+integer));

        // Using iterator
        Iterator<Integer> iterator = linkedBlockingQueue.iterator();
        while (iterator.hasNext())
        {
            System.out.println("Using Iterator " +iterator.next());
        }

        //linkedBlockingQueue.put(null);
        //System.out.println( linkedBlockingQueue.remainingCapacity());

    }
}
