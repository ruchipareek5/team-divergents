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
    
    
    
    $scope.gridOptionSkillGap = {
	         enableGridMenus : false,  
	         enableSorting: false, 
	         enableFiltering: false,
	         enableCellEdit : false,
	         enableColumnMenus : false,
	         enableHorizontalScrollbar:0,
	         enableVerticalScrollbar:0,  
	         useExternalPagination: true,  
	         
	         columnDefs: [
	              { name: 'jobrolename', displayName: 'Job Role'},
	              { name: 'noofskilledmanpower', displayName: 'Skilled Manpower'},
	              { name: 'countCandidate', displayName: 'Number of Candidates'}
	              ]
	  }; 	
	
	

	$http.get('partials/data4.json')
   .then(function (response) {
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

	
	$scope.search= function(){
		if($scope.state=="" && $scope.district==""){
			$scope.errorMessage="Enter the value to search";

		}
		
		else if($scope.state==""){
			$scope.errorMessage="";
			var fd = new FormData();
		    fd.append("district", "%"+$scope.district+"%")
		    console.log(fd);
		    var method = "POST";
		    $http.post('/getSkillGapStudyUsingDistrict', fd, {
		    transformRequest: angular.identity,
		    headers: {'Content-Type': undefined}
		   })
		   .then(function(response){
			   console.log(response);
			   $scope.gridOptionSkillGap.data = response.data;
		   },function errorCallback(response){
		        console.log(JSON.stringify(response.data));
		   });
		}
		
		else if($scope.district==""){
			$scope.errorMessage="";
			var fd = new FormData();
		    fd.append("state", "%"+$scope.state+"%")
		    console.log(fd);
		    var method = "POST";
		    $http.post('/getSkillGapStudyUsingState', fd, {
		    transformRequest: angular.identity,
		    headers: {'Content-Type': undefined}
		   })
		   .then(function(response){
			   console.log(response);
			   $scope.gridOptionSkillGap.data = response.data;
		   },function errorCallback(response){
		        console.log(JSON.stringify(response.data));
		   });
		}
		
		else{
			$scope.errorMessage="";
			var fd = new FormData();
			fd.append("state", "%"+$scope.state+"%")
		    fd.append("district", "%"+$scope.district+"%")
		    console.log(fd);
		    var method = "POST";
		    $http.post('/getSkillGapStudyUsingStateandDistrict', fd, {
		    transformRequest: angular.identity,
		    headers: {'Content-Type': undefined}
		   })
		   .then(function(response){
			   console.log(response);
			   $scope.gridOptionSkillGap.data = response.data;
		   },function errorCallback(response){
		        console.log(JSON.stringify(response.data));
		   });
	}

		
	}
});