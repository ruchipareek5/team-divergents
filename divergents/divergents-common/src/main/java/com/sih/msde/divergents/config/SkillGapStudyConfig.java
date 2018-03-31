package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="skillgapstudy",locations="classpath:sql/skillgapstudy.yml")
public class SkillGapStudyConfig {
	
	private String selectSkillGapStudy;
	private String selectSkillGapStudyusingState;
	private String selectSkillGapStudyusingDistrict;

	public String getSelectSkillGapStudyusingState() {
		return selectSkillGapStudyusingState;
	}

	public void setSelectSkillGapStudyusingState(String selectSkillGapStudyusingState) {
		this.selectSkillGapStudyusingState = selectSkillGapStudyusingState;
	}

	public String getSelectSkillGapStudyusingDistrict() {
		return selectSkillGapStudyusingDistrict;
	}

	public void setSelectSkillGapStudyusingDistrict(String selectSkillGapStudyusingDistrict) {
		this.selectSkillGapStudyusingDistrict = selectSkillGapStudyusingDistrict;
	}

	public String getSelectSkillGapStudy() {
		return selectSkillGapStudy;
	}

	public void setSelectSkillGapStudy(String selectSkillGapStudy) {
		this.selectSkillGapStudy = selectSkillGapStudy;
	}
	

}
