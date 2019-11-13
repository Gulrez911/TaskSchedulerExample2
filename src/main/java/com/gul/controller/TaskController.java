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
		String exp = "0 0 */1 * * ?";
//		String exp = "0 32 19 * * ?";
//		Every Second
//		String exp = "* * * ? * *";
//		String exp = "0 0 */48 ? * *"; 	//every twelve hour 	0 0 */12 ? * *
//		Every minute
//		String exp = "0 15 10 * * ? 2019";
//		Every 2 minutes
		CronTrigger trigger = new CronTrigger(exp, timeZone);
		Test task = new Test("Test Method Called");
		scheduler.addTaskToScheduler(task, trigger);
		return "index";
	}

	@GetMapping("/signin")
	public String view2() {
		return "signin";
	}}
