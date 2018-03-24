package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="findtrainingcenter",locations="classpath:sql/findtrainingcenter.yml")
public class FindTrainingCenterConfig {

	private String selectSqlAllStates;
	private String selectSqlAllDistrict;
	private String selectSqlAllBlock;
	private String selectSqlAllSector;
	private String selectSqlAllJobrole;
	private String selectSqlSpecfiedTrainingCenter1;
	public String getSelectSqlAllStates() {
		return selectSqlAllStates;
	}
	public void setSelectSqlAllStates(String selectSqlAllStates) {
		this.selectSqlAllStates = selectSqlAllStates;
	}
	public String getSelectSqlAllDistrict() {
		return selectSqlAllDistrict;
	}
	public void setSelectSqlAllDistrict(String selectSqlAllDistrict) {
		this.selectSqlAllDistrict = selectSqlAllDistrict;
	}
	public String getSelectSqlAllBlock() {
		return selectSqlAllBlock;
	}
	public void setSelectSqlAllBlock(String selectSqlAllBlock) {
		this.selectSqlAllBlock = selectSqlAllBlock;
	}
	public String getSelectSqlAllSector() {
		return selectSqlAllSector;
	}
	public void setSelectSqlAllSector(String selectSqlAllSector) {
		this.selectSqlAllSector = selectSqlAllSector;
	}
	public String getSelectSqlAllJobrole() {
		return selectSqlAllJobrole;
	}
	public void setSelectSqlAllJobrole(String selectSqlAllJobrole) {
		this.selectSqlAllJobrole = selectSqlAllJobrole;
	}
	public String getSelectSqlSpecfiedTrainingCenter1() {
		return selectSqlSpecfiedTrainingCenter1;
	}
	public void setSelectSqlSpecfiedTrainingCenter1(String selectSqlSpecfiedTrainingCenter1) {
		this.selectSqlSpecfiedTrainingCenter1 = selectSqlSpecfiedTrainingCenter1;
	}
	
	
	
	
}
