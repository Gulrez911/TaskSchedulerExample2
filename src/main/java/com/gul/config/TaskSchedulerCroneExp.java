package com.gul.config;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class TaskSchedulerCroneExp {

//	@Scheduled(cron = "*/5 * * * * ?")
//	public void demoServiceMethod() {
//		System.out.println("Method executed at every 5 seconds. Current time is :: " + new Date());
//	}
//	
//	 @Scheduled(fixedDelay = 5000)
//	    //@Scheduled(fixedRate = 5000)  //Or use this
//	    public void demoServiceMethod2()
//	    {
//	        System.out.println("Method executed at every 5 seconds. Using FixedDelay Current time is :: "+ new Date());
//	    }
	 
//	 @Scheduled(cron = "${cron.expression}")
//	    public void demoServiceMethod3()
//	    {
//	        System.out.println("Method executed at every 5 seconds. Current time is :: "+ new Date());
//	    }
}
