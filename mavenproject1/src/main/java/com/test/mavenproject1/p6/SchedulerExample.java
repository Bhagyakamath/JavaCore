package com.test.mavenproject1.p6;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerExample {

	public static void main(String[] args) {
		//Create ScheduledExecutorService with a single thread
		ScheduledExecutorService scheculer=Executors.newSingleThreadScheduledExecutor();
		
		//Define task to be scheduled
		Runnable task=()->{
			System.out.println("Task executed at: "+System.currentTimeMillis());
		};
		
		//Schedule the task to run after an initial delay of 1 second, and then repeatedly every 2 seconds
		scheculer.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);
		
		//Shut down the scheduler after some time, here 10 seconds
		//It prevents program from running indefinitely
		scheculer.schedule(()->{
			scheculer.shutdown();
			System.out.println("Scheduler shutdown");
		}, 10, TimeUnit.SECONDS);

	}

}
