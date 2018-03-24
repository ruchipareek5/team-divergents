var govt = angular.module('divergents');

govt.controller( 'govt' , function($scope,$http,$rootScope,$location){
	$rootScope.templateShowGovt = false;
	//Method to route using $location.path()
	
	//$rootScope.screen = 'screen4';
	
	$rootScope.templateShow = false;
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