package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class FeedbackDto extends BaseDto{
	
	private String name;
	private String aadharnumber;
	private String email;
	private String suggestion;
	
	
	public FeedbackDto(String name, String aadharnumber, String email, String suggestion) {
		super();
		this.name = name;
		this.aadharnumber = aadharnumber;
		this.email = email;
		this.suggestion = suggestion;
	}
	public FeedbackDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharnumber() {
		return aadharnumber;
	}
	public void setAadharnumber(String aadharnumber) {
		this.aadharnumber = aadharnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

}
