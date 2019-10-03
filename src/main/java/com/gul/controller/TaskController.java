package com.gul.controller;

import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gul.entity.Test;
import com.gul.repo.StudentRepository;
import com.gul.service.ScheduleTaskService;

@Controller
public class TaskController {

	@Autowired
	StudentRepository repo;
	@Autowired
	ScheduleTaskService scheduler;

	private Logger logger = Logger.getLogger(TaskController.class);

	@GetMapping("/task")
	public String view() {
		logger.info("View method called");
		System.out.println("testing");
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");
//		String exp = "*/5 * * * * ?";
		String exp = "0 39 16 * * ?";
		CronTrigger trigger = new CronTrigger(exp, timeZone);
		Test task = new Test("Test Method Called");
		scheduler.addTaskToScheduler(task, trigger);
		return "index";
	}

}
