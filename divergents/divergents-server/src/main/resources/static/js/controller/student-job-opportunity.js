var jobOpportunity = angular.module('divergents');

jobOpportunity.controller('jobOpportunityController',function($scope,$http,$timeout)
		{
			
	$scope.submit=function()
	{
		console.log($scope.issue);
		if($scope.issue.issueWith == "TP")
			{
			console.log("Inside TP");			
			}
		else if($scope.issue.issueWith == "AB")
			{
			console.log("Inside AB");	
			}
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
				console.log("Successful");
				}
				});
	}
		})