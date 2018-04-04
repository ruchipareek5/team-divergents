var capacityBuilder = angular.module('divergents');

capacityBuilder.controller('capacitybuilder',function($scope,$http){
	$scope.showCapacityBuilding =false;
	$http.get("/getallJobRoles").then(function(response){
		
		$scope.jobRoleList = response.data;
	}, function(errorResponse){
		
	});
		
		
		 $http.get("/getTotalJobRoles")
	    .then(function(response) {
	    	if(response.data == null){
	    		$scope.totalJobRoles = 0;
	    	}
	    	else
	    		{
	    		$scope.totalJobRoles = response.data;
	    		}
	        
	    });

	    $http.get("/getTotalCandidatesTrained")
	          .then(function(response) {
	        	  if(response.data == null)
	        		  {
	        		  $scope.totalCandidatesTrained =0;  
	        		  }
	        	  else
	        		  {
	        		  $scope.totalCandidatesTrained =response.data;
	        		  }
	        	  
	          });

	       $http.get("/getTotalTrainingPartners")
	                .then(function(response) {
	                	if(response.data == null)
	                		{
	                		$scope.totalTrainingPartners = 0;
	                		}
	                	else
	                		{
	                		$scope.totalTrainingPartners = response.data;
	                		}
	                });


	        $http.get("/getTotalSectorSkillCouncil")
	                  .then(function(response) {
	                	  if(response.data == null)
	                		  {
	                		  $scope.totalSectorSkillCouncils = 0;
	                		  }
	                	  else
	                		  {
	                		  $scope.totalSectorSkillCouncils = response.data;
	                		  }
	                  });

	        $http.get("/getAnnualTarget")
	                          .then(function(response) {
	                        	  if(response.data == null)
	                        		  {
	                        		  $scope.annualTarget = 0;
	                        		  }
	                        	  else
	                        		  {
	                        		  $scope.annualTarget = response.data;
	                        		  }
	                          });
	$scope.showCapacityBuilding = function(){
		if($scope.showCapacityBuilding == false){
					if($scope.showCapacityBuilding == false)
					{
					//var capacityBuilding = rowData.entity.
					}
				
				}
				else{
				
				}
		};
	

		$scope.gridOptionsTPCapacity = {
			enableGridMenus : false,  
			         enableSorting: false, 
			         enableFiltering: false,
			         enableCellEdit : false,
			         enableColumnMenus : false,
			         paginationPageSizes: [10, 2, 50],
			         paginationPageSize: 2,   
			         useExternalPagination: true,   
					 columnDefs: [
						 { name: 'trainingid', displayName: 'Training ID', cellClass:'trainingCenterCellClass',headerCellClass:'', width: '10%'},
			              { name: 'trainingtitle', displayName: 'Training Title' ,cellClass:'trainingCenterCellClass',headerCellClass:'' , width: '25%'},
						  { name: 'ssc', displayName: 'Sector Skill Council' ,cellClass:'trainingCenterCellClass',headerCellClass:'' , width: '25%'},
			              { name: 'startdate',displayName: 'Start Date' , cellClass:'trainingCenterCellClass',headerCellClass:'', width: '10%'},
			              { name: 'enddate', displayName:'End Date',headerCellClass:'trainingCenters',cellClass:'trainingCenterCellClass',width: '10%'},
						  { name: 'curriculum',displayName: 'Curriculum' , cellClass:'trainingCenterCellClass',headerCellClass:'', width: '10%', cellTemplate: '<a ng-href="{{row.entity.Curriculum}}" target="_blank" download><img src="images/pdf.png" class="pointer"></a>'},
						  { name: 'Register',displayName: 'Register' , cellClass:'trainingCenterCellClass',headerCellClass:'', width: '11%', cellTemplate: '<button type="button" class="btn btn-info btn-xs" style="margin-top:5pt" ng-click=grid.appScope.showCapacityBuilding(row)>Register</button>'},
			              
			    ]
		};
		
		$scope.gridOptionsABCapacity = {
				enableGridMenus : false,  
				         enableSorting: false, 
				         enableFiltering: false,
				         enableCellEdit : false,
				         enableColumnMenus : false,
				         paginationPageSizes: [10, 2, 50],
				         paginationPageSize: 2,   
				         useExternalPagination: true,   
						 columnDefs: [
						      { name: 'trainingid', displayName: 'Training ID', cellClass:'trainingCenterCellClass',headerCellClass:'', width: '10%'},
				              { name: 'trainingtitle', displayName: 'Training Title' ,cellClass:'trainingCenterCellClass',headerCellClass:'' , width: '25%'},
							  { name: 'ssc', displayName: 'Sector Skill Council' ,cellClass:'trainingCenterCellClass',headerCellClass:'' , width: '25%'},
				              { name: 'startdate',displayName: 'Start Date' , cellClass:'trainingCenterCellClass',headerCellClass:'', width: '10%'},
				              { name: 'enddate', displayName:'End Date',headerCellClass:'trainingCenters',cellClass:'trainingCenterCellClass',width: '10%'},
							  { name: 'curriculum',displayName: 'Curriculum' , cellClass:'trainingCenterCellClass',headerCellClass:'', width: '10%', cellTemplate: '<a ng-href="{{row.entity.Curriculum}}" target="_blank" download><img src="images/pdf.png" class="pointer"></a>'},
							  { name: 'Register',displayName: 'Register' , cellClass:'trainingCenterCellClass',headerCellClass:'', width: '11%', cellTemplate: '<button type="button" class="btn btn-info btn-xs" style="margin-top:5pt" ng-click=grid.appScope.showCapacityBuilding(row)>Register</button>'},
				              
				    ]
			};
		$http.get('/getallUpcomingTrainingsForAssessmentBody')
		   .success(function (response) {
			   console.log(response);
		       $scope.gridOptionsABCapacity.data= response;
		   })
		   .error(function (error) {
		      console.log("Error"+ error);
		   });	
		$http.get('/getallUpcomingTrainingsForTrainingPartner')
		   .success(function (response) {
			   console.log(response);
		       $scope.gridOptionsTPCapacity.data= response;
		   })
		   .error(function (error) {
		      console.log("Error"+ error);
		   });	
		$scope.showCapacityBuilding=function(){
			if($scope.showCapacity == true){
				$scope.showCapacity = false;
			}
			else{
				$scope.showCapacity = true;
			}
		}
		
		
		$scope.getTableHeightTP = function() {
		       var rowHeight = 30;
		       var headerHeight = 30;
		       return {
		          height: ($scope.gridOptionsTPCapacity.data.length * rowHeight + headerHeight) + "px"
		       };
		    };
		$scope.getTableHeightAB = function() {
			       var rowHeight = 30;
			       var headerHeight = 30;
			       return {
			          height: ($scope.gridOptionsABCapacity.data.length * rowHeight + headerHeight) + "px"
			       };
			    };
		
		
});