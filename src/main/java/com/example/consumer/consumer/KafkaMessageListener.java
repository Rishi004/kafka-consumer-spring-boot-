package com.example.consumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.consumer.utils.TopicNames;

@Service
public class KafkaMessageListener {
	
	Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);
	
	private final TopicNames topicNames;
	
	@Autowired
	public KafkaMessageListener(TopicNames topicNames) {
		this.topicNames = topicNames;
	}
		
	
	@KafkaListener(topics = {"test-topic", "test-topic2"}, groupId = "topic-group-1")
	public void consume(String message) {
		log.info("consumer consume the message -> {}", message);
	}

}
