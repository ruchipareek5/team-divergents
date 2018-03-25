var jobRole = angular.module('divergents');

jobRole.controller('jobRole' , function($scope,$http){
	
	$scope.alphabet="R";
	$scope.letter="";
	$scope.showCenters= false;
   
	$scope.gridOptions = {
	         enableGridMenus : false,  
	         enableSorting: false, 
	         enableFiltering: false,
	         enableCellEdit : false,
	         enableColumnMenus : false,
	         paginationPageSizes: [10, 2, 50],
	         paginationPageSize: 2,   
	         useExternalPagination: true,   
	         columnDefs: [
	              { name: 'jobRoleId', displayName: 'ID', cellClass:'trainingCenterCellClass',headerCellClass:'trainingCenters', width: '10%'},
	              { name: 'jobRoleName', displayName: 'Job Role' ,cellClass:'trainingCenterCellClass',headerCellClass:'trainingCenters' , width: '30%'},
	              { name: 'ssc',displayName: 'Sector Skill Council' , cellClass:'trainingCenterCellClass',headerCellClass:'trainingCenters', width: '30%'},
	              { name: 'Training Center | State', displayName:'Training Center | State' , cellTemplate: '<button type="button" class="btn btn-info btn-xs" style="margin-top:5pt" ng-click=grid.appScope.showTrainingCenter(row)>Check here</button>',headerCellClass:'trainingCenters',cellClass:'trainingCenterCellClass',width: '30%'}
	              
	    ]
	  }; 	
	
	
	
	$scope.gridOptionsTrainingCenter = {
	         enableGridMenus : false,  
	         enableSorting: false, 
	         enableFiltering: false,
	         enableCellEdit : false,
	         enableColumnMenus : false,
	         paginationPageSizes: [10, 2, 50],
	         paginationPageSize: 2,   
	         useExternalPagination: true,   
	         columnDefs: [
	          { name: 'trainingCentreName', displayName: 'Training Centres', cellClass:'trainingCenterCellClass',headerCellClass:'trainingCenters', width: '50%'},
	          { name: 'state', displayName: 'State' ,cellClass:'trainingCenterCellClass',headerCellClass:'trainingCenters',width: '50%' },
	          
	    ]
	  }; 	
	
	
	
	
	$scope.search= function(x){
		var fd = new FormData();
	    fd.append("letter", x+"%")
	    var method = "POST";
	    $http.post('/getJobRoleForSelectedLetter', fd, {
	    transformRequest: angular.identity,
	    headers: {'Content-Type': undefined}
	   })
	   .then(function(response){
		   $scope.gridOptions.data = response.data;
	   },function errorCallback(response){
	        console.log(JSON.stringify(response.data));
	   });
	}
	
	
	
	
	
	$scope.showTrainingCenter=function(rowData){
		if($scope.showCenters == false){
			var jobRole=rowData.entity.jobRoleId;
			var fd = new FormData();
		    fd.append("jobroleId",jobRole)
		    var method = "POST";
		    $http.post('/getTrainingCenterforJobRole', fd, {
		    transformRequest: angular.identity,
		    headers: {'Content-Type': undefined}
	   })
	   .then(function(response){
		  $scope.gridOptionsTrainingCenter.data = response.data;
	   },function errorCallback(response){
	        console.log(JSON.stringify(response.data));
	   });
		
		$scope.showCenters= true;
		
		}
		else{
			$scope.showCenters= false;
		}
	 }
	
	
	
	
	
	
});