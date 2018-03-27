package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix="RelevantDocIndustry",locations="classpath:sql/RelevantDocIndustry.yml")
public class RelevantDocIndustryConfig {
	
	 public class java {

		}
		private String selectDocPolicy;
		
		public String getselectDocPolicy() {
			return selectDocPolicy;
		}
		public void setselectDocPolicy(String selectDocPolicy) {
			this.selectDocPolicy = selectDocPolicy;
		}

}
