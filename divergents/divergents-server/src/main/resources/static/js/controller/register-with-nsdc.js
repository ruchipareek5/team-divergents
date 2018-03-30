var submit = angular.module('divergents');

submit.controller( 'submitController' , function($scope,$http,$timeout){
	  $http.get('/getallJobRoles')
	  .then(function (response) {
		  //console.log(response);
	      $scope.jobRoleList = response.data;
	  },function(errorResponse)
	  {
		  
	  });
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
	    	   
	    	   $scope.successMessage = "Thank you for showing your interest. Please click here to complete the affiliation process";
	    	   
	    	   
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