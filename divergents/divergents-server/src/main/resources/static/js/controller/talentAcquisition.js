var talentAcquisition = angular.module('divergents');

talentAcquisition.controller('talentAcquisition' , function($scope,$http){
	
	$scope.jobrolename="";
	$scope.errorMessage="";
	$scope.openBlock="block1";
	
	$scope.gridOptionsTalent = {
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
	              { name: 'candidateDetailsId', displayName: 'Candidate ID', cellClass:'trainingCenterCellClass',headerCellClass:''},
	              { name: 'candidateName', displayName: 'Name' ,cellClass:'trainingCenterCellClass',headerCellClass:'' },
	              { name: 'candidateAge',displayName: 'Age' , cellClass:'trainingCenterCellClass',headerCellClass:''},
	              { name: 'candidateLocation',displayName: 'Location' , cellClass:'trainingCenterCellClass',headerCellClass:''},
	              { name: 'candidateMail',displayName: 'Email' , cellClass:'trainingCenterCellClass',headerCellClass:''}
	    ]
	  }; 
	
	
	$scope.search= function(x){
		if($scope.jobrolename==""){
			$scope.errorMessage="Enter Job Role";
		}
		
		else{
			$scope.errorMessage="";
			$scope.openBlock="block2";
  		var fd = new FormData();
  	    fd.append("jobrolename", x+"%")
  	    var method = "POST";
  	    $http.post('/getCandidatedForEnteredJobRole', fd, {
  	    transformRequest: angular.identity,
  	    headers: {'Content-Type': undefined}
  	   })
  	   .then(function(response){
  		 $scope.gridOptionsTalent.data= response.data;
  	   },function errorCallback(response){
  	        console.log(JSON.stringify(response.data));
  	   });
  	}
}
	
	
});