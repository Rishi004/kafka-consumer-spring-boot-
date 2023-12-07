package com.example.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

import com.example.kafka.dto.EmployeeDto;
import com.example.kafka.utils.TopicNames;

@Service
public class KafkaMessageListener {

	Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

	private final TopicNames topicNames;

	@Autowired
	public KafkaMessageListener(TopicNames topicNames) {
		this.topicNames = topicNames;
	}

	@KafkaListener(topics = "second-topic", groupId = "topic-group-test2", topicPartitions = {
			@TopicPartition(topic = "second-topic", partitions = { "2" }) })
	public void consume(String message) {
		log.info("consumer consume the message -> {}", message);
	}

//	@KafkaListener(topics = "test-topic4", groupId = "topic-group-test")
//	public void consume(EmployeeDto employeeDto) {
//		log.info("consumer consume the message -> {}", employeeDto.toString());
//	}

}
