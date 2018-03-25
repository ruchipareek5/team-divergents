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
	              { name: 'jobRoleId', displayName: 'ID', cellClass:'sno',headerCellClass:'Institution-Name'},
	              { name: 'jobRoleName', displayName: 'Job Role' ,cellClass:'fname',headerCellClass:'Institution-Name' },
	              { name: 'jobRoleDescription', displayName: 'Description', cellClass:'sno',headerCellClass:'Institution-Name', width: 30},
	              { name: 'jobRoleUrl', displayName: 'To Visit' ,cellClass:'fname',headerCellClass:'Institution-Name' },
	              { name: 'ssc',displayName: 'ssc' , cellClass:'Type',headerCellClass:'Institution-Name'},
	              { name: 'Training Center | State', displayName:'Training Center | State' , cellTemplate: '<button type="button" class="btn btn-primary" ng-click=grid.appScope.showTrainingCenter(row)>Check</button>',headerCellClass:'Institution-Name',cellClass:'va'}
	              
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
	              { name: 'trainingCentreName', displayName: 'Training Centres', cellClass:'sno',headerCellClass:'Institution-Name', width: 30},
	              { name: 'state', displayName: 'State' ,cellClass:'fname',headerCellClass:'Institution-Name',width: 30 },
	              
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
		   console.log(response.data);
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