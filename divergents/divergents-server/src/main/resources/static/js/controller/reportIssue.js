var jobOpportunity = angular.module('divergents');

jobOpportunity.controller('reportIssueController',function($scope,$http,$timeout)
		{
			
	$scope.submit=function()
	{
		
		var reportIssueURI = "/reportIssues";
		$http
		({
			url : reportIssueURI,
			method : "POST",
			data : angular.toJson($scope.issue),
			headers : {
			'Content-type': 'application/json'
			           }
			
			
			
		}).then(function(response)
				{
				var response=response.data;	
				
			if(response == 1)
				
				{
				$scope.issue="";
				 $scope.successMessage = "Submission Successful";
		    	   
		    	   $timeout(function() {
		            	  $scope.successMessage="";
		               },5000000);
				}
			else
				{
				$scope.issue="";
				$scope.errorMessage = "Issue Cannot be submitted";
				 $timeout(function() {
	            	  $scope.successMessage="";
	               },5000000);
				}
				});
	}
		})