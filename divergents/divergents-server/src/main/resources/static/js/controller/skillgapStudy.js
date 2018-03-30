var gapStudy = angular.module('divergents');

gapStudy.controller('gapStudy' , function($scope,$http){
	$scope.showDetail= false;
	$scope.tab = "Statewise";
    $scope.gridOptionstate = {
	         enableGridMenus : false,  
	         enableSorting: false, 
	         enableFiltering: false,
	         enableCellEdit : false,
	         enableColumnMenus : false,
	         enableHorizontalScrollbar:0,
	         enableVerticalScrollbar:0,  
	         useExternalPagination: true,  
	         
	         columnDefs: [
	              { name: 'documentname', displayName: 'Document'},
	              { name: 'file', displayName: 'File',cellTemplate: '<a href="{{row.entity.file}}" target="_blank" download><img src="images/pdf.png" class="pointer"></a>' }
	              ]
	  }; 	
	
	

	$http.get('partials/data4.json')
   .success(function (response) {
       $scope.gridOptionstate.data= response;
   })
   .error(function (error) {
      console.log("Error"+ error);
   });
	              
	$scope.showYourInterest=function(){
		if($scope.showInterest== false){
		$scope.showInterest= true;}
		else{
			$scope.showInterest= false;
		}
		
		
	}


});