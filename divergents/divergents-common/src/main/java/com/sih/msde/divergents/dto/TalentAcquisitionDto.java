package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class TalentAcquisitionDto extends BaseDto{

	private String candidateDetailsId;
	private String candidateName;
	private String candidateAge;
	private String candidateLocation;
	private String candidateMail;
	
	public TalentAcquisitionDto(String candidateDetailsId, String candidateName, String candidateAge,
			String candidateLocation, String candidateMail) {
		super();
		this.candidateDetailsId = candidateDetailsId;
		this.candidateName = candidateName;
		this.candidateAge = candidateAge;
		this.candidateLocation = candidateLocation;
		this.candidateMail = candidateMail;
	}
	

	public String getCandidateDetailsId() {
		return candidateDetailsId;
	}
	public void setCandidateDetailsId(String candidateDetailsId) {
		this.candidateDetailsId = candidateDetailsId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getCandidateAge() {
		return candidateAge;
	}
	public void setCandidateAge(String candidateAge) {
		this.candidateAge = candidateAge;
	}
	public String getCandidateLocation() {
		return candidateLocation;
	}
	public void setCandidateLocation(String candidateLocation) {
		this.candidateLocation = candidateLocation;
	}
	public String getCandidateMail() {
		return candidateMail;
	}
	public void setCandidateMail(String candidateMail) {
		this.candidateMail = candidateMail;
	}
}
