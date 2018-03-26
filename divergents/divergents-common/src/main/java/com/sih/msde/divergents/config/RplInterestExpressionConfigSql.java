package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="rpl",locations="classpath:sql/rpl.yml")
public class RplInterestExpressionConfigSql {

	private String expressInterestForRpl;

	public String getExpressInterestForRpl() {
		return expressInterestForRpl;
	}

	public void setExpressInterestForRpl(String expressInterestForRpl) {
		this.expressInterestForRpl = expressInterestForRpl;
	}
}
