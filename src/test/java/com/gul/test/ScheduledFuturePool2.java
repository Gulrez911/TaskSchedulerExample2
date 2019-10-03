package com.gul.test;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledFuturePool2 {
	public static void main(String[] args)
	    {
	        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
	        Test task1 = new Test ("Demo Task 1");
	        Test task2 = new Test ("Demo Task 2");
	         
	        System.out.println("The time is : " + new Date());
	         
	        executor.schedule(task1, 5 , TimeUnit.SECONDS);
	        executor.schedule(task2, 10 , TimeUnit.SECONDS);
	         
	        try {
	              executor.awaitTermination(1, TimeUnit.DAYS);
	        } catch (InterruptedException e) {
	              e.printStackTrace();
	        }
	         
	        executor.shutdown();
	    }
}
