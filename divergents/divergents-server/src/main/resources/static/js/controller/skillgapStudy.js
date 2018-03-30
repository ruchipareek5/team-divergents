var gapStudy = angular.module('divergents');

gapStudy.controller('gapStudy' , function($scope,$http){
	
	$scope.tab = "Statewise";
	
	
	  /*$scope.stateList = [{'Select State'},
	                               { 'IISC'},
	                               { 'Admin'},
	                               { id:'chart4',name:'PR & Communication'},
	                               { id:'chart5',name:'Finance & Accounts'},
	                               { id:'chart6',name:'Monitoring'},
	                               { id:'chart7',name:'Procurement'},
	                               { id:'chart8',name:'Market Analytics'},
	                               { id:'chart9',name:'Legal'},
	                               { id:'chart10',name:'IT'},
	                               { id:'chart11',name:'Investing & Incentivizing'},
	                               {id:'chart12',name:'Reimbursable Skill Advisory Services'},
	                               {id:'chart13',name:'Skill India Mission Operation Project'},
	                               {id:'chart14',name:'HR'},
	                               {id:'chart15',name:'Corporate Priority Cell'},
	                               {id:'chart16',name:'PMKVY'},
	                               {id:'chart17',name:'Quality Assurance'},
	                               {id:'chart18',name:'Corporate Strategy and New Initiatives'}];*/
	
	$scope.states=["Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Delhi","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"];
});