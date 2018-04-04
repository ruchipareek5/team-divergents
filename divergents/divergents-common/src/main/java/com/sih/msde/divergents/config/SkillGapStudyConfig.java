package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="skillgapstudy",locations="classpath:sql/skillgapstudy.yml")
public class SkillGapStudyConfig {
	
	private String selectSkillGapStudy;
	private String selectSkillGapStudyusingState;
	private String selectSkillGapStudyusingDistrict;
	private String selectRecommendedCourseusingState;
	private String selectRecommendedCourseusingDistrict;
	private String selectRecommendedCourseusingDistrictandState;

	public String getSelectRecommendedCourseusingState() {
		return selectRecommendedCourseusingState;
	}

	public void setSelectRecommendedCourseusingState(String selectRecommendedCourseusingState) {
		this.selectRecommendedCourseusingState = selectRecommendedCourseusingState;
	}

	public String getSelectRecommendedCourseusingDistrict() {
		return selectRecommendedCourseusingDistrict;
	}

	public void setSelectRecommendedCourseusingDistrict(String selectRecommendedCourseusingDistrict) {
		this.selectRecommendedCourseusingDistrict = selectRecommendedCourseusingDistrict;
	}

	public String getSelectRecommendedCourseusingDistrictandState() {
		return selectRecommendedCourseusingDistrictandState;
	}

	public void setSelectRecommendedCourseusingDistrictandState(String selectRecommendedCourseusingDistrictandState) {
		this.selectRecommendedCourseusingDistrictandState = selectRecommendedCourseusingDistrictandState;
	}

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
