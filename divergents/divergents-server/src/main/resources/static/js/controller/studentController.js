var student = angular.module('divergents');

student.controller('student' , function($scope, $http,$rootScope,$location){
	
	
	$scope.feedbackshow= false;
	$scope.feedbackSuccess="";
	
   //$scope.studentHtml = 'studentHtml1';
   //$rootScope.templateShow = true;
	$rootScope.screen = 'screen1';
	$scope.studentSwitch = 'home';
	//Method to change screen based on value
	$scope.changeTemplate = function(){
		if($rootScope.screen == 'screen1'){
			$location.path('/industry');
		}
	}
	
	$rootScope.screen = 'screen1';
	$rootScope.templateShow = false;
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
		};	//-----------------------------------------------
		
		
		$scope.feedbackfun=function(){
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
					'Content-type': undefined
					           }

		       }).then(function(response)
		    		   {
		    	   console.log(response);
		    	   $scope.feedbackSuccess="Thank you, we will get back to you shortly.";
		    		   });
			
		}
		
		
});