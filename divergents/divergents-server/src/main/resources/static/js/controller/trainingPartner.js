var trainingPartner = angular.module('divergents');

trainingPartner.controller( 'trainingPartner' , function($scope,$http,$rootScope,$location){
	
	//Method to route using $location.path()
	
	$scope.tpSwitch = 'home';
	//$rootScope.screen = 'screen2';
	//$rootScope.templateShow = false;
	$scope.openStudent = function()
	{
	$rootScope.templateShow = true;
	var openStudentUrl = "/student";
	$location.path(openStudentUrl);
	};

	$scope.openIndustry = function()
	{
		$rootScope.templateShowI = true;
		var openStudentUrl = "/industry";
		$location.path(openStudentUrl);
		};

	$scope.openGovt = function(){
		
		$rootScope.templateShowGovt = true;
		var openStudentUrl = "/govt";
		$location.path(openStudentUrl);
		};
	
	$scope.openTrainingPartner = function(){
		$rootScope.templateShowTP = true;
		var openStudentUrl = "/trainingPartner";
		$location.path(openStudentUrl);
		};
	//-----------------------------------------------
});