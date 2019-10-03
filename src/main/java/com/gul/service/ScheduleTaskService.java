package com.gul.service;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;

import com.gul.entity.Test;

@Service
//@Transactional
public class ScheduleTaskService {

	@Autowired
	TaskScheduler scheduler;

//	@Bean
	public ScheduledFuture addTaskToScheduler(Runnable task, CronTrigger cronTrigger) {
		ScheduledFuture<?> scheduledTask = scheduler.schedule(task, cronTrigger);
//		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
//		Test task1 = new Test("Demo Task 1");
//		System.out.println("The time is : " + new Date());
//		ScheduledFuture<?> scheduledTask = executor.scheduleAtFixedRate(task1, 2, 5, TimeUnit.SECONDS);
		return scheduledTask;
	}

	public TaskScheduler getScheduler() {
		return scheduler;
	}

	public void setScheduler(TaskScheduler scheduler) {
		this.scheduler = scheduler;
	}

	public ScheduleTaskService(TaskScheduler scheduler) {
		this.scheduler = scheduler;
	}
}
