var gapStudy = angular.module('divergents');

gapStudy.controller('gapStudy' , function($scope,$http){
	
	$scope.tab = "Statewise";
	$scope.states=["Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Delhi","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"];
	$scope.reports=[" Education & Skill Development Services"," Furniture & Furnishings industry"," Media & Entertainment"," Organized Retail sector"," Pharmaceuticals"," Private Security Services"," Telcommunications","Agriculture","Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"];
});