var tenderRfp = angular.module('divergents');

tenderRfp.controller('tenderRfp' , function($scope,$http){
	$scope.tenders=false;
	$scope.Active=true;
	$scope.reset= function(){
		$scope.tenderDepartment="chart1";
			$scope.tenderCategory="category1";
			$scope.tenderNumber="" ;
			$scope.tenderTitle="";
		
	}
	
	$scope.tenderDepartment = 'chart1';
	  $scope.tenderDepartmentList = [{ id:'chart1',name:'Select Department'},
	                               { id:'chart2',name:'IISC'},
	                               { id:'chart3',name:'Admin'},
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
	                               {id:'chart18',name:'Corporate Strategy and New Initiatives'}];
	  $scope.tenderCategory = 'category1';
	  $scope.tenderCategoryList = [{ id:'category1',name:'Select Category'},
	                               { id:'category2',name:'TEN (Tender)'},
	                               { id:'category3',name:'IFP (Invitation For Proposal)'},
	                               { id:'category4',name:'RFP'},
	                               { id:'category5',name:'EoI (Expression Of Interest)'},
	                               { id:'category6',name:'RFQ (Request for Quotation)'}];
	$scope.gridOptionrfp = {
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
	              { name: 'tenderNumber', displayName: 'Tender No.' },
	              { name: 'tenderTitle',displayName: 'Tender Title'},
	              { name: 'tenderDepartment',displayName: 'Department'},
	              { name: 'tenderCategory',displayName: 'Category' },
	              { name: 'bidStartDate',displayName: 'Bid Start Date'},
	              { name: 'bidSubmissionDate', displayName:'Bid Submission Date'},
	              { name: 'tenderDocument',displayName: 'Tender Doc', cellTemplate: '<a ng-href="{{row.entity.tenderDocument}}" target="_blank" download><img src="images/pdf.png" class="pointer"></a>', cellClass:'pdf'},
	              { name: 'applyOnline',displayName: 'Apply Online',cellTemplate:'<a href="partials/applyonline.html" target="_blank"><button type="button" class="btn apply">Apply Now</button></a>'}
	                      
	    ]
	  }; 	
	
	

	$http.get('/getshowActiveTenders')
    .success(function (response) {
        $scope.gridOptionrfp.data= response;
    })
    .error(function (error) {
       //console.log("Error"+ error);
    });
	

	$scope.gridOptionsearch = {
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
	              { name: 'tenderNumber', displayName: 'Tender No.' },
	              { name: 'tenderTitle',displayName: 'Tender Title'},
	              { name: 'tenderDepartment',displayName: 'Department'},
	              { name: 'tenderCategory',displayName: 'Category' },
	              { name: 'bidStartDate',displayName: 'Bid Start Date'},
	              { name: 'bidSubmissionDate', displayName:'Bid Submission Date'},
	              { name: 'tenderDocument',displayName: 'Tender Doc', cellTemplate: '<a ng-href="{{row.entity.tenderDocument}}" target="_blank" download><img src="images/pdf.png" class="pointer"></a>', cellClass:'pdf'},
	              { name: 'applyOnline',displayName: 'Apply Online',cellTemplate:'<button type="button" class="btn apply" ng-click="apply()">Apply Now</button>'}
	                      
	    ]
	  }; 	
	
	
	
	
$scope.search= function(){
	
	
	if($scope.tenders==false && $scope.Active==true){
		$scope.tenders=true;
		$scope.Active=false;
	}
	else{
		$scope.tenders=false;
		$scope.Active=true;
	}
	
	
	if($scope.tenderCategory=="category1" && $scope.tenderDepartment=="chart1" && $scope.tenderNumber=="" && $scope.tenderDepartment==""){
		$scope.errorMessage="Select and fill fields to search";
	}
		
	else if($scope.tenderCategory=="" && $scope.tenderDepartment==""){
			$scope.errorMessage="";
			tenderNumber=$scope.tenderNumber;
		    tenderTitle=$scope.tenderTitle;
		    var method = "GET";
		    $http.get('/getshowTendersUsingTenderNumbertenderTitle',{
		    transformRequest: angular.identity,
		    params:{tenderNumber,tenderTitle},
		    headers: {'Content-Type': undefined}
		   })
		   .then(function(response){
			   console.log(response);
			   $scope.gridOptionsearch.data = response.data;
		   },function errorCallback(response){
		        console.log(JSON.stringify(response.data));
		   });
		}
		
		else if($scope.tenderCategory==""){
			$scope.errorMessage="";
			tenderNumber=$scope.tenderNumber;
		    tenderTitle=$scope.tenderTitle;
		    tenderDepartment=$scope.tenderDepartment;
		    var method = "GET";
		    $http.post('/getshowTendersUsingTenderNumbertenderTitleTenderDepartment', {
		    transformRequest: angular.identity,
		    params:{tenderNumber,tenderTitle,tenderDepartment},
		    headers: {'Content-Type': undefined}
		   })
		   .then(function(response){
			   console.log(response);
			   $scope.gridOptionsearch.data = response.data;
		   },function errorCallback(response){
		        console.log(JSON.stringify(response.data));
		   });
		}
		
		else if($scope.tenderDepartment==""){
			$scope.errorMessage="";
			tenderNumber=$scope.tenderNumber;
		    tenderTitle=$scope.tenderTitle;
		    tenderCategory=$scope.tenderCategory;
		    var method = "GET";
		    $http.get('/getshowTendersUsingTenderNumbertenderTitleTenderCategory', {
		    transformRequest: angular.identity,
		    params:{tenderNumber,tenderTitle,tenderCategory},
		    headers: {'Content-Type': undefined}
		   })
		   .then(function(response){
			   console.log(response);
			   $scope.gridOptionsearch.data = response.data;
		   },function errorCallback(response){
		        console.log(JSON.stringify(response.data));
		   });
		}
		
		
		else{
			$scope.errorMessage="";
            tenderNumber=$scope.tenderNumber;
			tenderTitle = $scope.tenderTitle;
			tenderCategory = $scope.tenderCategory;
			tenderDepartment = $scope.tenderDepartment;
			var method = "GET";
		    $http.get('/getShowTenders', {
		    transformRequest: angular.identity,
		    params:{tenderNumber,tenderTitle,tenderCategory,tenderDepartment},
		    headers: {'Content-Type': undefined}
		   })
		   .then(function(response){
			   console.log(response);
			   $scope.gridOptionsearch.data = response.data;
		   },function errorCallback(response){
		        console.log(JSON.stringify(response.data));
		   });
		}
}

	$scope.getTableHeight = function() {
	       var rowHeight = 30;
	       var headerHeight = 30;
	       return {
	          height: ($scope.gridOptionsearch.data.length * rowHeight + headerHeight) + "px"
	       };
	    };
	    $scope.getTableHeight = function() {
		       var rowHeight = 30;
		       var headerHeight = 30;
		       return {
		          height: ($scope.gridOptionrfp.data.length * rowHeight + headerHeight) + "px"
		       };
		    };

});