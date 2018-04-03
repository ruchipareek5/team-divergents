var gapStudy = angular.module('divergents');

gapStudy.controller('gapStudy' , function($scope,$http){
	
	
	$scope.showDetail= false;
	$scope.stateforanalysis="";
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
	
	
	              
	$scope.showYourInterest=function(){
		if($scope.showInterest== false){
		$scope.showInterest= true;}
		else{
			$scope.showInterest= false;
		}
	}

	
	$scope.search= function(){
		console.log($scope.stateforanalysis);
		console.log($scope.districtforanalysis);
	}
});