var docindustry = angular.module('divergents');

docindustry.controller('docindustry' , function($scope,$http){
	
	$scope.alphabet="";
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
	         enableHorizontalScrollbar:0,
	            enableVerticalScrollbar:0,
	         columnDefs:[

	                { name: 'documentNo', displayName: 'Policies | Reports', cellClass:'policy'},
	                { name: 'title', displayName: 'Title', cellClass:'title'},
	                { name: 'documentUrl', displayName: 'Document', cellTemplate: '<a ng-href="{{row.entity.documentUrl}}" target="_blank" download><img src="images/pdf.png" class="pointer"></a>', cellClass:'pdf'}
	                
	                
	                ]};

	
	$scope.search= function(x){
		var fd = new FormData();
	    fd.append("letter", x+"%")
	    var method = "POST";
	    $http.post('/getIndustryDocuments', fd, {
	    transformRequest: angular.identity,
	    headers: {'Content-Type': undefined}
	   })
	   .then(function(response){
		   $scope.gridOptions.data = response.data;
	   },function errorCallback(response){
	        console.log(JSON.stringify(response.data));
	   });
	}
	
	
	
	
});