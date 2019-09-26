package com.gul.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskSchedulerDemoService {
	@Scheduled(fixedDelay = 3000)
	public void methodWithFixedDelay() {
		System.out.println("Method scheduled to run after delay of 3 seconds - " + new Date());
	}
}