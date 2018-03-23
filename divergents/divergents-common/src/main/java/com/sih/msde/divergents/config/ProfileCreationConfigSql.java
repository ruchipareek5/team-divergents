package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "profilecreation",locations="classpath:sql/profileCreation.yml")
public class ProfileCreationConfigSql {
	
private String getTrainingPartnerData;
private String getTrainingCenterData;

public String getGetTrainingPartnerData() {
	return getTrainingPartnerData;
}

public void setGetTrainingPartnerData(String getTrainingPartnerData) {
	this.getTrainingPartnerData = getTrainingPartnerData;
}

public String getGetTrainingCenterData() {
	return getTrainingCenterData;
}

public void setGetTrainingCenterData(String getTrainingCenterData) {
	this.getTrainingCenterData = getTrainingCenterData;
}

}
