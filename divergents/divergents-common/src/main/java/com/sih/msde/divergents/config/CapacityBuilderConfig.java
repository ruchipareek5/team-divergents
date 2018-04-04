package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="trainingscapacitybuilder",locations="classpath:sql/capacitybuilder.yml")
public class CapacityBuilderConfig {
	
	private String trainingsfortrainingpartner;
	private String trainingsforassessmentbody;
	public String getTrainingsfortrainingpartner() {
		return trainingsfortrainingpartner;
	}
	public void setTrainingsfortrainingpartner(String trainingsfortrainingpartner) {
		this.trainingsfortrainingpartner = trainingsfortrainingpartner;
	}
	public String getTrainingsforassessmentbody() {
		return trainingsforassessmentbody;
	}
	public void setTrainingsforassessmentbody(String trainingsforassessmentbody) {
		this.trainingsforassessmentbody = trainingsforassessmentbody;
	}
	
	

}
