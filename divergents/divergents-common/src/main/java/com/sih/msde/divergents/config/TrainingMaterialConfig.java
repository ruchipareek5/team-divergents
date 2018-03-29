package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="trainingMaterial",locations="classpath:sql/trainingMaterial.yml")
public class TrainingMaterialConfig {
	
	private String selectTrainingMaterial;
	private String selectAllTrainingMaterial;

	public String getSelectAllTrainingMaterial() {
		return selectAllTrainingMaterial;
	}

	public void setSelectAllTrainingMaterial(String selectAllTrainingMaterial) {
		this.selectAllTrainingMaterial = selectAllTrainingMaterial;
	}

	public String getSelectTrainingMaterial() {
		return selectTrainingMaterial;
	}

	public void setSelectTrainingMaterial(String selectTrainingMaterial) {
		this.selectTrainingMaterial = selectTrainingMaterial;
	}
	

}
