package com.kafka_test.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	@Autowired
	KafkaTemplate kafkaTemplate;
	
	@RequestMapping(value="/get")
	public String getData(@RequestParam(value="message",required = true, defaultValue = "") String message) {
		
		LocalDateTime date = LocalDateTime.now();
		String dateStr = date.format(fmt);
		
		for(int i=0; i<20;i++){
			kafkaTemplate.send("testtopic",dateStr+"	"+message+i);
		}
		
		return "kafkaTemplate.send >> "+message;
	}

}
