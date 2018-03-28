var signup = angular.module('divergents');

signup.controller( 'signup' , function($scope,$http,$timeout){
	
	$scope.submit = function(){
		 var registerforRPLURI = "/registerForRpl";
		 $http({

				url : registerforRPLURI,
				method : "POST",
				data : angular.toJson($scope.tp),
				headers : {
				'Content-type': 'application/json'
				           }

	       }).then(function(response)
	       
	       	{
	        var signUpResponse=response.data;
	       
	       if(signUpResponse == 1)
	    	   {
	    	   
	    	   $scope.tp="";
	    	   
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