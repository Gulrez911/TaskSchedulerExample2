package com.gul.test.controller;

import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.gul.config.JpaConfig;
import com.gul.controller.TaskController;
import com.gul.entity.Test;
import com.gul.repo.StudentRepository;
import com.gul.service.ScheduleTaskService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class)
//@ContextConfiguration(locations = "classpath:appcontext.xml")
@WebAppConfiguration
public class TestController {

	@Autowired
	StudentRepository repo;
	@Autowired
	ScheduleTaskService scheduler;
	
	private Logger logger = Logger.getLogger(TaskController.class);
	@org.junit.Test
	public void logn() {
		logger.info("View method called");
		System.out.println("testing");
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");
		String exp = "*/5 * * * * ?";
//		String exp = "0 */2 * * * ?";
		CronTrigger trigger = new CronTrigger(exp, timeZone);
		Test task = new Test("Test Method Called");
		scheduler.addTaskToScheduler(task, trigger);
	}
}
