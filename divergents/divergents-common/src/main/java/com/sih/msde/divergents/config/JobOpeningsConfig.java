package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="jobOpening",locations="classpath:sql/jobOpening.yml")
public class JobOpeningsConfig {
	
	private String selectJobswithNameAndLocation;
	private String selectJobswithLocation;
	private String selectJobswithName;
	private String selectJobsAll;
	
	public String getSelectJobswithNameAndLocation() {
		return selectJobswithNameAndLocation;
	}
	public void setSelectJobswithNameAndLocation(String selectJobswithNameAndLocation) {
		this.selectJobswithNameAndLocation = selectJobswithNameAndLocation;
	}
	public String getSelectJobswithLocation() {
		return selectJobswithLocation;
	}
	public void setSelectJobswithLocation(String selectJobswithLocation) {
		this.selectJobswithLocation = selectJobswithLocation;
	}
	public String getSelectJobswithName() {
		return selectJobswithName;
	}
	public void setSelectJobswithName(String selectJobswithName) {
		this.selectJobswithName = selectJobswithName;
	}
	public String getSelectJobsAll() {
		return selectJobsAll;
	}
	public void setSelectJobsAll(String selectJobsAll) {
		this.selectJobsAll = selectJobsAll;
	}
	
	


}
