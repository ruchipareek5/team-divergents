var csrFundingPublicUser = angular.module('divergents');

csrFundingPublicUser.controller('csrFundingPublicUser' , function($scope,$http,$window){
	$scope.login = function(){
		console.log(angular.toJson($scope.user));
   

});