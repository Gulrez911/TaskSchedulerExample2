package com.gul.controller;

import java.util.TimeZone;

import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String view() {
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");
		String exp = "";
		CronTrigger trigger = new CronTrigger("test",timeZone);
		return "index";
	}
}