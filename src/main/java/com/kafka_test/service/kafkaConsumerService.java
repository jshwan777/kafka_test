package com.kafka_test.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumerService {
	
	@KafkaListener(topics = "testtopic", groupId = "testGroup")
	public void consumer(String message)  {
		System.out.println("## START ## message >> "+message);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("## END ## message >> "+message+" -----");
	}
}
