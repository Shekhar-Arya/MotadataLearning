package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//         Priority Queue is unbounded queue. Based on Priority heap.
        // Priority Queue arranges the value in ascending or descending order (Natural order)
//        It does not permit null value.
//        It also does not permit the non-comparable objects.
//        As Elements are added to the priority queue its size grows automatically
//        iterator does not gaurantee to travrse the Priority queue in particular order
//        If we need ordered traversing then use Arrays.sort(pq.toArray()).
//        Note that this implementation is not synchronized.
//        Multiple threads should not access a PriorityQueue instance concurrently if any of the threads modifies the queue.
//        Time Complexity:
//        O(log(n)) for insertion and deletion
//        linear time to remove(obj) and contains(obj)
//        Constant time for retrival.


//        1. Creating Priority Queue for arranging in ascending order;
    //        PriorityQueue() default with initial capacity 11
            PriorityQueue<Integer> p1 = new PriorityQueue<>();
//            PriorityQueue(int capacity) with specified capacity
            PriorityQueue<Integer> p2 = new PriorityQueue<>(5);
//            PriorityQueue(Comparator<>(){})
            PriorityQueue<Integer> p3 = new PriorityQueue<>(new Comparator<Integer>(){
                @Override
                public int compare(Integer integer, Integer t1) {
                    if(integer>t1)
                        return 1;
                    if(integer<t1)
                        return -1;
                    return 0;
                }
            });
//            PriorityQueue((a,b)-> a-b)
            PriorityQueue<Integer> p4 = new PriorityQueue<>((a,b)->a-b);
            // Above all will create Priority queue in Ascending order

//        2. Now Below All example of creating Priority queue of descending order
//              PriorityQueue(Collection.reverseOrder())
                PriorityQueue<Integer> p5 = new PriorityQueue<>(Collections.reverseOrder());
//              PriorityQueue(Comparator<>())
                PriorityQueue<Integer> p6 = new PriorityQueue<>(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer integer, Integer t1) {
                        if(integer<t1)
                            return 1;
                        if(integer>t1)
                            return -1;
                        return 0;
                    }
                });
                // -1 is used for ascending and 1 is used for descending

//              PriorityQueue((a,b)->b-a)
                PriorityQueue<Integer> p7 = new PriorityQueue<>((a,b)->b-a);
//              Above all will create Priority queue with descending order.

        Queue<Integer> priorityQueue = new PriorityQueue<Integer>();

//        Methods in Priority Queue
//        1. TO add elements
//          add()
        priorityQueue.add(1);
//          offer()
        priorityQueue.offer(2);

//        2. To remove Elements
//          poll() remove and retrieves element
        priorityQueue.poll();
//          remove(obj) remove particualr obj does not follow FIFO
        priorityQueue.remove(2);
//          clear() remove all elements from queue
        priorityQueue.clear();

//        3. Extra Methods to use
//          peek() retrieves the front element and returns it
        priorityQueue.peek();
//          contains(obj) check whether queue contains the obj or not
        priorityQueue.contains(1);
//          size() return the number of element in queue
        priorityQueue.size();

        // It also contains the toArray() method



        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(3);
        priorityQueue.offer(0);

//          Traverse through Priority Queue
//          iterator() to iterate through the queue
        Iterator<Integer> iterator = priorityQueue.iterator();
        while (iterator.hasNext())
        {
            System.out.println("Using Iterator "+iterator.next());
        }
//          though forEach loop
        for (Integer i:priorityQueue
             ) {
            System.out.println("Using forEach Loop "+i);
        }
//          Using forEach method
        priorityQueue.forEach(integer -> {
            System.out.println("Using forEach Method "+integer);
        });

        /*Integer[] arr = {3,4,1};
        //List al = new ArrayList();
        priorityQueue.addAll(Arrays.asList(arr));
        System.out.println(priorityQueue);
*/
    }
}
