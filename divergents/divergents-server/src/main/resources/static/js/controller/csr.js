var csrIndustry = angular.module('divergents');

csrIndustry.controller( 'csrIndustry' , function($scope,$http,$timeout){
	
	$scope.submit = function(){
		 var submitforCSRURI = "/submitForCsr";
		 $http({

				url : submitforCSRURI,
				method : "POST",
				data : angular.toJson($scope.csr),
				headers : {
				'Content-type': 'application/json'
				           }

	       }).then(function(response)
	       
	       	{
	        var submitResponse=response.data;
	       
	       if(submitResponse == 1)
	    	   {
	    	   
	    	   $scope.csr="";
	    	   
	    	   $scope.successMessage = "Submission Successful";
	    	   
	    	   $timeout(function() {
	            	  $scope.successMessage="";
	               }, 2000);
	    	   
	    	   }
	       else 
	    	   {
	    	   $scope.errorMessage = "Data cannot be submitted";
	    	   
	    	   $timeout(function() {
	            	  $scope.errorMessage="";
	               }, 2000);
	    	   }
	       });
	}
})