package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="industryCsr",locations="classpath:sql/industryCsr.yml")
public class IndustryCsrConfigSql {

	private String contributeInCsr;

	public String getcontributeInCsr() {
		return contributeInCsr;
	}

	public void setcontributeInCsr(String contributeInCsr) {
		this.contributeInCsr = contributeInCsr;
	}
}

