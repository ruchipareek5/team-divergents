package com.sih.msde.divergents.dto;



public class SkillcompetitionDto {

	private String participantName;
	private String participantEmail;
	private String participantAddress;
	private String participantAge;
	private String skillSector;
	private String skillSectorCategory;
	
	
	
	
	public String getparticipantName() {
		return participantName;
	}
	public void setparticipantName(String participantName) {
		this.participantName = participantName;
	}
	public String getparticipantEmail() {
		return participantEmail;
	}
	public void participantEmail(String participantEmail) {
		this.participantEmail = participantEmail;
	}
	public String getparticipantAddress() {
		return participantAddress;
	}
	public void setparticipantAddress(String participantAddress) {
		this.participantAddress = participantAddress;
	}
	public String getparticipantAge() {
		return participantAge;
	}
	public void setAge(String participantAge) {
		this.participantAge = participantAge;
	}
	public String getskillSector() {
		return skillSector;
	}
	public void setskillSector(String skillSector) {
		this.skillSector = skillSector;
	}
	public String getskillSectorCategory() {
		return skillSectorCategory;
	}
	public void setCategory(String skillSectorCategory) {
		this.skillSectorCategory = skillSectorCategory;
	}
	
	
	public SkillcompetitionDto(String participantName, String participantEmail, String participantAddress,
			String participantAge, String skillSector, String skillSectorCategory) {
		super();
		this.participantName = participantName;
		this.participantEmail = participantEmail;
		this.participantAddress = participantAddress;
		this.participantAge = participantAge;
		this.skillSector = skillSector;
		this.skillSectorCategory =skillSectorCategory;
	}
	public SkillcompetitionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		
	
}
