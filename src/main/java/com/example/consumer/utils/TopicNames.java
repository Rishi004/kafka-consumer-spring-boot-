package com.example.consumer.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:kafka-topic.properties")
public class TopicNames {
	@Value("${test.topic}")
	private String testTopic;
	
	@Value("${test.topic.two}")
	private String testTopic2;
	
	@Value("${test.topic.three}")
	private String testTopic3;

	public String getTestTopic() {
		return testTopic;
	}

	public void setTestTopic(String testTopic) {
		this.testTopic = testTopic;
	}

	public String getTestTopic2() {
		return testTopic2;
	}

	public void setTestTopic2(String testTopic2) {
		this.testTopic2 = testTopic2;
	}

	public String getTestTopic3() {
		return testTopic3;
	}

	public void setTestTopic3(String testTopic3) {
		this.testTopic3 = testTopic3;
	}
	
	
}
