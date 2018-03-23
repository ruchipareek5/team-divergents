var login = angular.module('divergents');

login.controller( 'home' , function($scope,$http,$rootScope,$location){
	
	$scope.screen = 'screen1';
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
	
});