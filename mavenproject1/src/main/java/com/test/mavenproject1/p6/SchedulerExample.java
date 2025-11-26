package com.test.mavenproject1.p6;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerExample {

	public static void main(String[] args) {
		ScheduledExecutorService scheculer=Executors.newSingleThreadScheduledExecutor();
		Runnable task=()->{
			System.out.println("Task executed at: "+System.currentTimeMillis());
		};
		
		scheculer.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);
		scheculer.schedule(()->{
			scheculer.shutdown();
			System.out.println("Scheduler shutdown");
		}, 10, TimeUnit.SECONDS);

	}

}
