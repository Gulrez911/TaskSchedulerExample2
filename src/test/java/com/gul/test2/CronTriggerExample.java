package com.gul.test2;

import java.time.LocalTime;

import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;

public class CronTriggerExample {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program starts at : " + LocalTime.now());
		ThreadPoolTaskScheduler s = new ThreadPoolTaskScheduler();
		s.setPoolSize(5);
		s.initialize();
		for (int i = 0; i < 2; i++) {
			s.schedule(getTask(), new CronTrigger("*/5 * * * * ?"));
		}
		s.getScheduledThreadPoolExecutor().shutdown();
	}

	public static Runnable getTask() {
		return () -> System.out.printf("Task: %s, Time: %s:%n", Thread.currentThread().getName(),
				LocalTime.now());
	}
}
