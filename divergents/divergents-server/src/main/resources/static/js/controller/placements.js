var placement = angular.module('divergents');

placement.controller( 'placementController' , function($scope,$http,$timeout){
	
	$scope.submit = function(){

		var getReportedIssuesURI = "/getReportedIssues";
		
		 $http({
				    url: getReportedIssuesURI, 
				    method: "GET",
				    params: {institutionId:$scope.reportedIssues.institutionId,institutionName:$scope.reportedIssues.institutionName},
				    
			    headers : {
				'Content-type': 'application/json'
				           }

	       }).then(function(response)
	       
	       	{
	          $scope.gridOptions.data=response.data;
	             });
	}
	
	
	
	
	$scope.gridOptions = {
	         enableGridMenus : false,  
	         enableSorting: false, 
	         enableFiltering: false,
	         enableCellEdit : false,
	         enableColumnMenus : false,  
	         columnDefs: [
	              { name: 'issueType', displayName:'Issue Type', cellClass:'issueTypeCellClass'},
	              { name: 'issueDescription', displayName:'Issue Description' ,cellClass:'issueDescriptionCellClass'},
	              { name: 'issueReportDate', displayName:'Issue Report Date' , cellClass:'issueReportDateCellClass'}
	            
	              
	    ]
	  }; 
	
	
});