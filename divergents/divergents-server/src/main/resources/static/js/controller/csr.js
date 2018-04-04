var csrIndustry = angular.module('divergents');

csrIndustry.controller( 'csrIndustry' , function($scope,$http,$timeout){
	
	$scope.selectedModel = 'Direct Sponsorship for skill development';
	  $scope.modelList = [         { id:'Direct Sponsorship for skill development',name:'Direct Sponsorship for skill development'},
	                               { id:'Setting up of COEs/Institute',name:'Setting up of COEs/Institute'},
	                               { id:'Setup Multi Skill Training Centers',name:'Setup Multi Skill Training Centers'},
	                               { id:'Setup Trade Specific labs/Centers',name:'Setup Trade Specific labs/Centers'},
	                               { id:'Donate Land,Building and Machinery',name:'Donate Land,Building and Machinery'},
	                               { id:'Align your Training to Sector Skill Councils',name:'Align your Training to Sector Skill Councils'}];
	
	$scope.submit = function(){
		 var submitforCSRURI = "/submitForCsr";
		 $http({

				url : submitforCSRURI,
				method : "POST",
				data : angular.toJson($scope.find),
				headers : {
				'Content-type': 'application/json'
				           }

	       }).then(function(response)
	       
	       	{
	        var findResponse=response.data;
	       
	       if(findResponse == 1)
	    	   {
	    	   
	    	   $scope.find="";
	    	   
	    	   $scope.successMessage = "Submission Successful";
	    	   
	    	   $timeout(function() {
	            	  $scope.successMessage="";
	               }, 2000);
	    	   
	    	   }
	       else 
	    	   {
	    	   $scope.find="";
	    	   $scope.errorMessage = "Data cannot be submitted";
	    	   
	    	   $timeout(function() {
	            	  $scope.errorMessage="";
	               }, 2000);
	    	   }
	       });
	}
})