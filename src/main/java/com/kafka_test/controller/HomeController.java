package com.kafka_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/main")
	public String getMain() {
		System.out.println("1234");
		return "home/main";
	}
}
