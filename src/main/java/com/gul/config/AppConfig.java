package com.gul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
@EnableScheduling
@ComponentScan(basePackages = "com.gul.service")
public class AppConfig {

	   @Bean
	    public ThreadPoolTaskScheduler threadPoolTaskScheduler(){
	        ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
	        threadPoolTaskScheduler.setPoolSize(5);
	        return threadPoolTaskScheduler;
	    }
	   
	   
	   @Bean
	   public TaskScheduler taskScheduler() {
	       //org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler
	       return new ThreadPoolTaskScheduler();
	   }
}
