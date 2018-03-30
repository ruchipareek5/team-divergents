package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="feedback",locations="classpath:sql/feedback.yml")
public class FeedbackConfig {
	
	private String insertfeedback;

	public String getInsertfeedback() {
		return insertfeedback;
	}

	public void setInsertfeedback(String insertfeedback) {
		this.insertfeedback = insertfeedback;
	}

}
