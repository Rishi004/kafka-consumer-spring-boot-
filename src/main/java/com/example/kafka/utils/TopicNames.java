package com.example.kafka.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@PropertySource("classpath:kafka-topic.properties")
@Data
public class TopicNames {
	@Value("${test.topic}")
	private String testTopic;
	
	@Value("${test.topic.two}")
	private String testTopic2;
	
	@Value("${test.topic.three}")
	private String testTopic3;
	
}
