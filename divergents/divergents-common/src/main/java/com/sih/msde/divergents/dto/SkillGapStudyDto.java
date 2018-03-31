package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class SkillGapStudyDto extends BaseDto{
	
	private String jobrolename;
	private String noofskilledmanpower;
	private String countCandidate;
	public String getJobrolename() {
		return jobrolename;
	}
	public void setJobrolename(String jobrolename) {
		this.jobrolename = jobrolename;
	}
	public String getNoofskilledmanpower() {
		return noofskilledmanpower;
	}
	public void setNoofskilledmanpower(String noofskilledmanpower) {
		this.noofskilledmanpower = noofskilledmanpower;
	}
	public String getCountCandidate() {
		return countCandidate;
	}
	public void setCountCandidate(String countCandidate) {
		this.countCandidate = countCandidate;
	}
	public SkillGapStudyDto(String jobrolename, String noofskilledmanpower, String countCandidate) {
		super();
		this.jobrolename = jobrolename;
		this.noofskilledmanpower = noofskilledmanpower;
		this.countCandidate = countCandidate;
	}
	public SkillGapStudyDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
