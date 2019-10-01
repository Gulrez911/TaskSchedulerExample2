package com.gul.controller;

import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	private static final Logger logger = Logger.getLogger(HomeController.class);

	@GetMapping("/")
	public String view() {
		logger.info("method called");
//		TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");
//		String exp = " "+" "+" "+" ";
//		String exp = "* * * * * ? *";
//		CronTrigger trigger = new CronTrigger(exp, timeZone);
		return "index";
	}
}