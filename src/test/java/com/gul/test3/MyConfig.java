package com.gul.test3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.DefaultManagedTaskScheduler;

@Configuration
public class MyConfig {

	@Bean
	TaskScheduler taskScheduler() {
		return new DefaultManagedTaskScheduler();
	}

	@Bean
	MyBean myBean() {
		return new MyBean();
	}
}
