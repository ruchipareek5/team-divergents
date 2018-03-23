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
});