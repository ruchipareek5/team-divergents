var trainingPartner = angular.module('divergents');

trainingPartner.controller( 'trainingPartner' , function($scope,$http,$rootScope,$location){
	
	//Method to route using $location.path()
	
	$scope.feedbackshow= false;
	$scope.feedbackSuccess="";
	
	$scope.tpSwitch = 'home';
	//$rootScope.screen = 'screen2';
	//$rootScope.templateShow = false;
	$scope.openStudent = function()
	{
		$rootScope.templateShowTP = false;
		$rootScope.templateShowI = false;
		$rootScope.templateShowGovt = false;
		$rootScope.templateShow = true;
	
	var openStudentUrl = "/student";
	$location.path(openStudentUrl);
	};

	$scope.openIndustry = function()
	{
		$rootScope.templateShowGovt = false;
		$rootScope.templateShow = false;
		$rootScope.templateShowTP = false;
		$rootScope.templateShowI = true;
		var openStudentUrl = "/industry";
		$location.path(openStudentUrl);
		};

	$scope.openGovt = function(){
		
		$rootScope.templateShow = false;
		
		$rootScope.templateShowI = false;
		$rootScope.templateShowTP = false;
		$rootScope.templateShowGovt = true;
		var openStudentUrl = "/govt";
		$location.path(openStudentUrl);
		};
	
	$scope.openTrainingPartner = function(){
		$rootScope.templateShowGovt = false;
		$rootScope.templateShow = false;
		$rootScope.templateShowI = false;
		$rootScope.templateShowTP = true;
		var openStudentUrl = "/trainingPartner";
		$location.path(openStudentUrl);
		};


		
		$scope.feedback=function(){
			if($scope.feedbackshow== true){
				$scope.feedbackshow= false;
			}
			else{
				$scope.feedbackshow= true;
			}
		}
		
		
		$scope.feedbackSubmit= function(){
			$scope.feedbackSuccess="Thank you, we will get back to you shortly.";
			var feedbackSubmit = "/submitFeedback";
			 $http({

					url : feedbackSubmit,
					method : "POST",
					data : angular.toJson($scope.feedback),
					headers : {
					'Content-type': 'application/json'
					           }

		       }).then(function(response)
		    		   {
		    	   console.log(response);
		    	   $scope.feedbackSuccess="Thank you, we will get back to you shortly.";
		    		   });
			
		}
});