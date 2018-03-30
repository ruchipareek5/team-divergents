var gapStudy = angular.module('divergents');

gapStudy.controller('gapStudy' , function($scope,$http){
	$scope.showDetail= false;
	$scope.tab = "Statewise";
	$scope.stateList=[
	                  {"name" :"Andhra Pradesh"},
	                  {"name" :"Arunachal Pradesh"},
	                  {"name" :"Assam"},
	                  {"name" :"Bihar"},
	                  {"name" :"Chhattisgarh"},
	                  {"name" :"Delhi"},
	                  {"name" :"Goa"},
	                  {"name" :"Gujarat"},
	                  {"name" :"Haryana"},
	                  {"name" :"Himachal Pradesh"},
	                  {"name" :"Jammu & Kashmir"},
	                  {"name" :"Jharkhand"},
	                  {"name" :"Karnataka"},
	                  {"name" :"Kerala"},
	                  {"name" :"Madhya Pradesh"},
	                  {"name" :"Maharashtra"},
	                  {"name" :"Manipur"},
	                  {"name" :"Meghalaya"},
	                  {"name" :"Mizoram"},
	                  {"name" :"Nagaland"},
	                  {"name" :"Odisha"},
	                  {"name" :"Punjab"},
	                  {"name" :"Rajasthan"},
	                  {"name" :"Sikkim"},
	                  {"name" :"Tamil Nadu"},
	                  {"name" :"Telangana"},
	                  {"name" :"Tripura"},
	                  {"name" :"Uttarakhand"},
	                  {"name" :"Uttar Pradesh"},
	                  {"name" :"West Bengal"}
	                  ];
	
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
	                  
	$scope.reports=[" Education & Skill Development Services"," Furniture & Furnishings industry"," Media & Entertainment"," Organized Retail sector"," Pharmaceuticals"," Private Security Services"," Telcommunications","Agriculture","Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"];
	$scope.showYourInterest=function(){
		if($scope.showInterest== false){
		$scope.showInterest= true;}
		else{
			$scope.showInterest= false;
		}
		
		
	}


});