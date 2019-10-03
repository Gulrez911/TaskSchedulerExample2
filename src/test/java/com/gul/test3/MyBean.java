package com.gul.test3;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;

public class MyBean {
	@Autowired
	TaskScheduler taskScheduler;

	public void runTask() {
		taskScheduler.scheduleWithFixedDelay((Runnable) () -> {
			System.out.println("running " + LocalTime.now());
		}, 1000L);
	}
}
