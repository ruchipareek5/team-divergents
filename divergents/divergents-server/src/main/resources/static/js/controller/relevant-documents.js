var policy = angular.module('divergents');

policy.controller('policy' , function($scope,$http){
	$scope.alphabet="";
	$scope.letter="";
	$scope.gridOptions = {
            enableGridMenus : false,
            enableSorting: false,
            enableFiltering: false,
            enableCellEdit : false,
            enableColumnMenus : false,
            enableHorizontalScrollbar:0,
            enableVerticalScrollbar:0,
            paginationPageSizes: [5, 10, 20, 30],
            paginationPageSize: 10,
            useExternalPagination: true,
            columnDefs : [

                /*{ name: 'policyId', displayName: 'ID', cellClass:'trainingCenterCellClass'},*/
                { name: 'policyNo', displayName: 'Policy No.', cellClass:'policy'},
                { name: 'title', displayName: 'Title', cellClass:'title'},
                { //name: 'policyDocUrl', displayName: 'Document', cellTemplate: '<a download="File.pdf" ui-sref ="policy.placeDetail({placeId: row.entity.id })"$policyDocUrl title="ImageName"><img src="images/pdf.png" class="pointer"></a>', cellClass:'pdf'}
                	name: 'policyDocUrl', displayName: 'Document', cellTemplate: '<a ng-href="{{row.entity.policyDocUrl}}" target="_blank" download><img src="images/pdf.png" class="pointer"></a>', cellClass:'pdf'}
                
                
                ]};
	
	  $scope.search= function(x){
  		var fd = new FormData();
  	    fd.append("letter", x+"%")
  	    var method = "POST";
  	    $http.post('/getPolicyForSelectedLetter', fd, {
  	    transformRequest: angular.identity,
  	    headers: {'Content-Type': undefined}
  	   })
  	   .then(function(response){
  		   $scope.gridOptions.data = response.data;
  	   },function errorCallback(response){
  	        console.log(JSON.stringify(response.data));
  	   });
  	}
        /*$http.get("partials/data.json")
            .then(function(response) {
                $scope.gridOptions.data = response.data;
            });*/
       

});