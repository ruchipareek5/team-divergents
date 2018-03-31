package com.sih.msde.divergents.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="tenders",locations="classpath:sql/tenders.yml")
public class ShowTendersConfigSql {

	private String showTenders; //using all the fields
	private String showTendersUsingTenderNumberTenderTitle; //using tender number and tender title
	private String showTendersUsingTenderNumberTenderTitleTenderDepartment; //using tender number, tender title, tender department
	private String showTendersUsingTenderNumberTenderTitleTenderCategory; //using tender number,tender category , tender title
	
	
	public String getShowTenders() {
		return showTenders;
	}
	public void setShowTenders(String showTenders) {
		this.showTenders = showTenders;
	}
	public String getShowTendersUsingTenderNumberTenderTitle() {
		return showTendersUsingTenderNumberTenderTitle;
	}
	public void setShowTendersUsingTenderNumberTenderTitle(String showTendersUsingTenderNumberTenderTitle) {
		this.showTendersUsingTenderNumberTenderTitle = showTendersUsingTenderNumberTenderTitle;
	}
	public String getShowTendersUsingTenderNumberTenderTitleTenderDepartment() {
		return showTendersUsingTenderNumberTenderTitleTenderDepartment;
	}
	public void setShowTendersUsingTenderNumberTenderTitleTenderDepartment(
			String showTendersUsingTenderNumberTenderTitleTenderDepartment) {
		this.showTendersUsingTenderNumberTenderTitleTenderDepartment = showTendersUsingTenderNumberTenderTitleTenderDepartment;
	}
	public String getShowTendersUsingTenderNumberTenderTitleTenderCategory() {
		return showTendersUsingTenderNumberTenderTitleTenderCategory;
	}
	public void setShowTendersUsingTenderNumberTenderTitleTenderCategory(
			String showTendersUsingTenderNumberTenderTitleTenderCategory) {
		this.showTendersUsingTenderNumberTenderTitleTenderCategory = showTendersUsingTenderNumberTenderTitleTenderCategory;
	}
	
	
	
}
