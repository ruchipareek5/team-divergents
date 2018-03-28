package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="interestedTp",locations="classpath:sql/interestedTp.yml")
public class InterestedTpRegistrationConfigSql {

 private String interestedTpRegistration;
 private String interestedTpCheckStatus;

public String getInterestedTpCheckStatus() {
	return interestedTpCheckStatus;
}

public void setInterestedTpCheckStatus(String interestedTpCheckStatus) {
	this.interestedTpCheckStatus = interestedTpCheckStatus;
}

public String getInterestedTpRegistration() {
	return interestedTpRegistration;
}

public void setInterestedTpRegistration(String interestedTpRegistration) {
	this.interestedTpRegistration = interestedTpRegistration;
}
 
}
