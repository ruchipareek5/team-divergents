package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="findtrainingcenter")
public class FindTrainingCenterConfig {

	private String selectSqlAllStates;
	private String selectSqlAllDistrict;
	private String selectSqlAlltehsil;
	private String selectSqlAllSector;
	private String selectSqlAllJobrole;
	private String selectSqlSpecfiedTrainingCenter1;
	private String selectSqlSpecfiedTrainingCenter2;
	
	public String getSelectSqlAllStates() {
		return selectSqlAllStates;
	}
	public String getSelectSqlAllDistrict() {
		return selectSqlAllDistrict;
	}
	public String getSelectSqlAlltehsil() {
		return selectSqlAlltehsil;
	}
	public String getSelectSqlAllSector() {
		return selectSqlAllSector;
	}
	public String getSelectSqlSpecfiedTrainingCenter2() {
		return selectSqlSpecfiedTrainingCenter2;
	}
	public void setSelectSqlSpecfiedTrainingCenter2(String selectSqlSpecfiedTrainingCenter2) {
		this.selectSqlSpecfiedTrainingCenter2 = selectSqlSpecfiedTrainingCenter2;
	}
	public void setSelectSqlSpecfiedTrainingCenter1(String selectSqlSpecfiedTrainingCenter) {
		this.selectSqlSpecfiedTrainingCenter1 = selectSqlSpecfiedTrainingCenter;
	}
	public String getSelectSqlAllJobrole() {
		return selectSqlAllJobrole;
	}
	public String getSelectSqlSpecfiedTrainingCenter1() {
		return selectSqlSpecfiedTrainingCenter1;
	}
	
}
