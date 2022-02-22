package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
	// write your code here
        // ExecutorService is interface

        // ExecutorService is used as Thread pool in java.
        // We can control the number of threads to create.
        // These threads will be assigend a tasks and on completing one it will take anothr task to perform if there are any left.
        // Like this we can reuse the threads

        // Executors service can be created in three ways
        // 1. by Executors Class as below
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // Here we have created thread pool of two threads which will be used to perform tasks
        // Executors have lots of methods by which we can create different types of threadpool
        // Below one will create thread pool with single thread
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();

        // 2. By Using ThreadPool Executor we can create Executor service
        ExecutorService executorService2 = new ThreadPoolExecutor(2,3,1000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(2));
        // 1 parameter is minimum threads, 2 is maximum threads if load is increased, 3 is time and 4 is times unit they are to decrease the
        // number threads if they are graeter than minimum threads, 5 is Blocking Queue of Runnable interface which has tasks to perform

        // ThreadPoolExecutor can also be created as below:
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        // By these we can use the methods of ThreadPoolExecutor

        // 3. By Using ShceduledExecutorService but it done yet


        // ExecutorService Method to execute the Service
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable("Task "+i)); // This execute() method takes the Runnable tasks that is to be executed
        }
        // And as we can see we have to manually shutdown the Executor service
        // shutdown method suts down the executorService after all threads execution is completed
        executorService.shutdown();
        executorService.awaitTermination(1,TimeUnit.SECONDS);
        // Here above await method blocks the execution of the main method till all the tasks are completed in threadpool


        System.out.println("------------------------");


        // Another way to execute the tasks is using submit method
        // submit() method is same as the execute method it also takes the Runnable instance as parameter
        // the difference is that execute() method does not tell the state of running threads but
        // submit() method return the Future by which we can get the state and different things about running thread.
        Future future = executorService1.submit(new MyRunnable("Task 1"));

        // Now this Future has different methods by which we can get the state of the thread
        // such as isDone() which tells is the thread tasks is complete or not
        System.out.println(future.isDone());    // Prints False
        // It also has get() method returns the result from the run() of Runnable interface but as the run() method does not
        // return anything so it will print or give null
        // Another use of get() is that it block the further execution until the get() method get the result from run()
        // Which means until it is completed
        try {
            System.out.println(future.get()); // here
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService1.shutdown();
        System.out.println(future.isDone()); // Prints true now


        System.out.println("------------------------");

        // Another parameter that this submit() can take is Callable interface
        // It is all same as the Runnable the difference is that Runnable does not return any result but Callable Can return result
        // It also return the Future instance
        Future future1 = executorService2.submit(new MyCallable("Task 1"));
        // Now as the Callable can return the result back so that we can get the result using the get()
        System.out.println(future1.isDone());
        System.out.println(future1.get());  // And we can see that now we can get the result
        System.out.println(future1.isDone());

        System.out.println("-------------------------------");

        // Another way is invokeAny() it takes the Collection of Callable method as parameter
        // This method executes the Callable and as soon as one Callable is executed then it will be terminated means only one Callable will be Executed
        // Use of this type of method is when we want some data from backend and we hit two or more server for the data
        // And as soon as one server returns the response means it executed then it will terminate or does not execute any other task
        // Because all server will response same and we just want one
        List<Callable> list = new ArrayList<>();
        list.add(new MyCallable("Task 1"));
        list.add(new MyCallable("Task 2"));
        list.add(new MyCallable("Task 3"));
        System.out.println(executorService2.invokeAny((Collection) list));
        System.out.println("-----------------------------------------");

        // Another way is using invokeAll() it also takes Collection of Callable as parameter
        // This method executes all tasks in threadpool
        // it returns the list of Future by using which we can get the result of all the Callable
        // it works as below
        List<Future> futureList = executorService2.invokeAll((Collection)list);
        for (Future future2:futureList
             ) {
            System.out.println(future2.get());
        }
        executorService2.shutdown();

        System.out.println("-------------------------------");

        // executorService Also has method of shutDownNow()
        // This method completes the current running tasks and will not execute the tasks which are in queue ti execute
        // and executor service will be shutdown
        // And it also returns the list of tasks or runnable which are not executed
        List<Runnable> runnables = executorService2.shutdownNow();


        // Now we will see the way to cancel the tasks which are not yet executed or in the queue to execute.
        // It can be done using the cancel() of the Future that is returned by the submit() of ExecutorService
        // cancel() take boolean parameter which represents interruptibility which means
        // if thread has started execution and we can stop it in between then it will stop it if it is set to true
        // cancel() also returns the boolean value which tells wether the futureTasks is cancelled or not  here below will see it

        Future future2 = threadPoolExecutor.submit(new MyCallable("Task 1"));
        System.out.println(future2.isDone());
        boolean wasCancelled = future2.cancel(true);
        System.out.println(wasCancelled);
        try {
            System.out.println(future2.get()); //This will neither print null nor get any value it will throw Exception
        }
        catch (Exception e)
        {
            System.out.println(e);  // It will throw Cancellation Exception
        }
        System.out.println(future2.isDone());
        // We can also check wether the given tasks is cancelled or not using below Method
        System.out.println(future2.isCancelled());
        threadPoolExecutor.shutdown();

    }
}
