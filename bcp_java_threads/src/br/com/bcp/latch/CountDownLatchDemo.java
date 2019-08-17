package br.com.bcp.latch;

import java.util.concurrent.CountDownLatch;

/*
## CountDownLatch in Java ##
CountDownLatch is used to make sure that a task waits for other threads before it starts.
To understand its application, let us consider a server where the main task can only start when all the required services have started.

Working of CountDownLatch:
When we create an object of CountDownLatch, we specify the number of threads it should wait for,
all such thread are required to do count down by calling CountDownLatch.countDown() once they are
completed or ready to the job. As soon as count reaches zero, the waiting task starts running.
 */
public class CountDownLatchDemo 
{ 
    public static void main(String args[])  
                   throws InterruptedException 
    { 
        // Let us create task that is going to  
        // wait for four threads before it starts 
        CountDownLatch latch = new CountDownLatch(4);
  
        // Let us create four worker  
        // threads and start them. 
        Worker first = new Worker(1000, latch,"WORKER-1");
        Worker second = new Worker(2000, latch,"WORKER-2");
        Worker third = new Worker(3000, latch, "WORKER-3");
        Worker fourth = new Worker(4000, latch,"WORKER-4");
        Worker fifth = new Worker(5000, latch,"WORKER-5");

        first.start(); 
        second.start(); 
        third.start(); 
        fourth.start();
        fifth.start();
  
        // The main task waits for four threads 
        latch.await(); 
  
        // Main thread has started 
        System.out.println(Thread.currentThread().getName() + " has finished");
    } 
} 