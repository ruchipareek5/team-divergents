var student = angular.module('divergents');

student.controller('student' , function($scope, $http,$rootScope,$location){
   //$scope.studentHtml = 'studentHtml1';
   //$rootScope.templateShow = true;
	$rootScope.screen = 'screen1';
	//Method to change screen based on value
	$scope.changeTemplate = function(){
		if($rootScope.screen == 'screen1'){
			$location.path('/industry');
		}
	}
	
	$rootScope.screen = 'screen1';
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