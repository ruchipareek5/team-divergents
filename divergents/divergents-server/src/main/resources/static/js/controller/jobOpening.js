var jobOpening = angular.module('divergents');

jobOpening.controller('jobOpening' , function($scope,$http){
	
	$scope.jobrolename="";
	$scope.location="";
	$scope.errorMessage="";
	$scope.showInterest= false;
   
	$scope.gridOptionsJobs = {
	         enableGridMenus : false,  
	         rowHeight: 30,
	         enableSorting: false, 
	         enableFiltering: false,
	         enableCellEdit : false,
	         enableColumnMenus : false,
	         enableHorizontalScrollbar:0,
	         enableVerticalScrollbar:0,
	         paginationPageSizes: [10, 2, 50],
	         paginationPageSize: 2,   
	         useExternalPagination: true,  
	         
	         columnDefs: [
	              { name: 'jobId', displayName: 'Job Id', cellClass:'jobOpeningGrid',headerCellClass:'',width: '10%'},
	              { name: 'jobTitle', displayName: 'Job Title' ,cellClass:'jobOpeningGrid',headerCellClass:'' },
	              { name: 'organization',displayName: 'Organization' , cellClass:'jobOpeningGrid',headerCellClass:''},
	              { name: 'location',displayName: 'Location' , cellClass:'jobOpeningGrid',headerCellClass:'trainingCenters'},
	              { name: 'ctc',displayName: 'CTC' , cellClass:'jobOpeningGrid',headerCellClass:'trainingCenters', width: '10%'},
	              { name: 'jobDescription',displayName: 'Job Description' , cellClass:'jobOpeningGrid',headerCellClass:'trainingCenters', width: '20%'},
	              { name: 'Show Interest', displayName:'Show Interest' , cellTemplate: '<i class="fa fa-thumbs-o-up" style="color: blue; cursor: pointer; font-size: 2em" ng-click=grid.appScope.showYourInterest(row)> </i>',headerCellClass:'trainingCenters',cellClass:''}
	                      
	    ]
	  }; 	
	
	

	$http.get('/getallJobOpenings')
    .success(function (response) {
        $scope.gridOptionsJobs.data= response;
    })
    .error(function (error) {
       console.log("Error"+ error);
    });
	
	
	
	$scope.search= function(){
		
		if($scope.jobrolename=="" && $scope.location==""){
			$scope.errorMessage="Enter the value to search";
			$http.get('/getallJobOpenings')
		    .success(function (response) {
		        $scope.gridOptionsJobs.data= response;
		    })
		    .error(function (error) {
		       console.log("Error"+ error);
		    });
		}
		
		else if($scope.location==""){
			$scope.errorMessage="";
			var fd = new FormData();
		    fd.append("jobrolename", "%"+$scope.jobrolename+"%")
		    console.log(fd);
		    var method = "POST";
		    $http.post('/getJobOpeningsUsingJobRole', fd, {
		    transformRequest: angular.identity,
		    headers: {'Content-Type': undefined}
		   })
		   .then(function(response){
			   console.log(response);
			   $scope.gridOptionsJobs.data = response.data;
		   },function errorCallback(response){
		        console.log(JSON.stringify(response.data));
		   });
		}
		
		else if($scope.jobrolename==""){
			$scope.errorMessage="";
			var fd = new FormData();
		    fd.append("location", "%"+$scope.location+"%")
		    console.log(fd);
		    var method = "POST";
		    $http.post('/getJobOpeningsUsingLocation', fd, {
		    transformRequest: angular.identity,
		    headers: {'Content-Type': undefined}
		   })
		   .then(function(response){
			   console.log(response);
			   $scope.gridOptionsJobs.data = response.data;
		   },function errorCallback(response){
		        console.log(JSON.stringify(response.data));
		   });
		}
		
		else{
			$scope.errorMessage="";
			var fd = new FormData();
			fd.append("jobrolename", "%"+$scope.jobrolename+"%")
		    fd.append("location", "%"+$scope.location+"%")
		    console.log(fd);
		    var method = "POST";
		    $http.post('/getJobOpeningsUsingJobRoleandLocation', fd, {
		    transformRequest: angular.identity,
		    headers: {'Content-Type': undefined}
		   })
		   .then(function(response){
			   console.log(response);
			   $scope.gridOptionsJobs.data = response.data;
		   },function errorCallback(response){
		        console.log(JSON.stringify(response.data));
		   });
		}

		
		
		
		
	}
	
	
	
	$scope.showYourInterest=function(){
		if($scope.showInterest== false){
		$scope.showInterest= true;}
		else{
			$scope.showInterest= false;
		}
		
		
	}
	$scope.getTableHeight = function() {
	       var rowHeight = 30;
	       var headerHeight = 30;
	       return {
	          height: ($scope.gridOptionsJobs.data.length * rowHeight + headerHeight) + "px"
	       };
	    };
	
	
	
	
	
	
	
});