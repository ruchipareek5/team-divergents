var submit = angular.module('divergents');

submit.controller( 'submitController' , function($scope,$http,$timeout){
	
	$scope.register = function(){
		 var trainingPartnerAffiliationURI = "/registerInterestedTp";
		 $http({

				url : trainingPartnerAffiliationURI,
				method : "POST",
				data : angular.toJson($scope.affiliation),
				headers : {
				'Content-type': 'application/json'
				           }

	       }).then(function(response)
	       
	       	{
	        var affiliationResponse=response.data;
	       if(affiliationResponse == 1)
	    	   {
	    	   
	    	   $scope.affiliation="";
	    	   
	    	   $scope.successMessage = "Submission Successful";
	    	   
	    	   $timeout(function() {
	            	  $scope.successMessage="";
	               }, 2000);
	    	   
	    	   }
	       else if (affiliationResponse == -1)
	    	   {
	    	   $scope.affiliation="";
	    	   $scope.errorMessage = "You have already applied for this Job Role";
	    	   
	    	   $timeout(function() {
	            	  $scope.errorMessage="";
	               }, 2000);
	    	   }
	       else
	    	   {
	    	   $scope.affiliation="";
	    	   $scope.registrationFailed = "Sorry, Registration cannot be processed";
	    	  
	       $timeout(function() {
         	  $scope.errorMessage="";
            }, 2000);
	    	   }
 	   });

	}

})