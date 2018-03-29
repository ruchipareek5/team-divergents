var trainingMaterial = angular.module('divergents');

trainingMaterial.controller('trainingMaterial' , function($scope,$http){
	
	$scope.jobrolename="";
	$scope.errorMessage="";
	
	$scope.gridOptionsTrainingMaterial = {
	         enableGridMenus : false,  
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
	              { name: 'trainingmaterialid', displayName: 'Training Material Id', cellClass:'trainingCenterCellClass',headerCellClass:''},
	              { name: 'trainingtitle', displayName: 'Training Title' ,cellClass:'trainingCenterCellClass',headerCellClass:'' },
	              {name: 'trainingmaterialurl', displayName: 'Document', cellTemplate: '<a ng-href="{{row.entity.trainingmaterialurl}}" target="_blank" download><img src="images/pdf.png" class="pointer"></a>', cellClass:'pdf'}
	              
	    ]
	  }; 	
	
	
	$http.get('/getalltrainingmaterial')
    .success(function (response) {
        $scope.gridOptionsTrainingMaterial.data= response;
    })
    .error(function (error) {
       console.log("Error"+ error);
    });
	
	  $scope.search= function(x){
		  if($scope.jobrolename==""){
			 
			  $scope.errorMessage="Enter Jobrole";
		  }
		  else{
			  $scope.errorMessage="";
	  		var fd = new FormData();
	  	    fd.append("jobrolename", x+"%")
	  	    var method = "POST";
	  	    $http.post('/gettrainingmaterialusingjobrole', fd, {
	  	    transformRequest: angular.identity,
	  	    headers: {'Content-Type': undefined}
	  	   })
	  	   .then(function(response){
	  		 $scope.gridOptionsTrainingMaterial.data= response.data;
	  	   },function errorCallback(response){
	  	        console.log(JSON.stringify(response.data));
	  	   });
	  	}
	  }
	
	
});
