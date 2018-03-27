package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="govPolicy",locations="classpath:sql/govPolicy.yml")
public class PolicyGovernmentConfig {

	private String selectGovPolicy;
	
	public String getselectGovPolicy() {
		return selectGovPolicy;
	}
	public void setselectGovPolicy(String selectGovPolicy) {
		this.selectGovPolicy = selectGovPolicy;
	}
	
	
	
}

