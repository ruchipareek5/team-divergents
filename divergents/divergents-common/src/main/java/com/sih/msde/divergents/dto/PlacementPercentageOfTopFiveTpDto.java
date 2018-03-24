package com.sih.msde.divergents.dto;

public class PlacementPercentageOfTopFiveTpDto {

	private String trainingPartnerName;
	private long totalPlacements;
	
	public String getTrainingPartnerName() {
		return trainingPartnerName;
	}
	public void setTrainingPartnerName(String trainingPartnerName) {
		this.trainingPartnerName = trainingPartnerName;
	}
	public long getTotalPlacements() {
		return totalPlacements;
	}
	public void setTotalPlacements(long totalPlacements) {
		this.totalPlacements = totalPlacements;
	}
	public PlacementPercentageOfTopFiveTpDto(String trainingPartnerName, long totalPlacements) {
		super();
		this.trainingPartnerName = trainingPartnerName;
		this.totalPlacements = totalPlacements;
	}
	public PlacementPercentageOfTopFiveTpDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
