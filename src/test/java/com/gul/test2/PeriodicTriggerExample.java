package com.gul.test2;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.PeriodicTrigger;

public class PeriodicTriggerExample {
	public static void main(String[] args) throws InterruptedException {
		ThreadPoolTaskScheduler s = new ThreadPoolTaskScheduler();
		s.setPoolSize(5);
		s.initialize();
		for (int i = 0; i < 2; i++) {
			s.schedule(getTask(), new PeriodicTrigger(5, TimeUnit.SECONDS));
		}
		Thread.sleep(10000);
		System.out.println("shutting down after 10 sec");
		s.getScheduledThreadPoolExecutor().shutdownNow();
	}

	public static Runnable getTask() {
		return () -> System.out.printf("Task: %s, Time: %s:%n", Thread.currentThread().getName(),
				LocalTime.now());
	}
}
