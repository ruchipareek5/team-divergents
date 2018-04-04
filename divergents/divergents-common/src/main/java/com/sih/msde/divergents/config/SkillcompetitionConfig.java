package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="skillcompetitionsql",locations="classpath:sql/skillcompetition.yml")
public class SkillcompetitionConfig {
 
	private String  skillcompetitionforsubmit;

	public String getSkillcompetitionforsubmit() {
		return skillcompetitionforsubmit;
	}

	public void setSkillcompetitionforsubmit(String skillcompetitionforsubmit) {
		this.skillcompetitionforsubmit = skillcompetitionforsubmit;
	}

	

}
