var tenderRfp = angular.module('divergents');

tenderRfp.controller('tenderRfp' , function($scope,$http){
	$scope.reset= function(){
		$scope.departmentType="chart1";
			$scope.categoryType="category1";
			$scope.tenderno="" ;
			$scope.tendertitle="";
		
	}
	
	$scope.departmentType = 'chart1';
	  $scope.departmentTypeList = [{ id:'chart1',name:'Select Department'},
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
	  $scope.categoryType = 'category1';
	  $scope.categoryTypeList = [{ id:'category1',name:'Select Category'},
	                               { id:'category2',name:'TEN (Tender)'},
	                               { id:'category3',name:'IFP (Invitation For Proposal)'},
	                               { id:'category4',name:'RFP'},
	                               { id:'category5',name:'EoI (Expression Of Interest)'},
	                               { id:'category6',name:'RFQ (Request for Quotation)'}];
	$scope.gridOptionrfp = {
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
	              { name: 'srNo', displayName: 'Sr.', width:"5%"},
	              { name: 'tenderNo', displayName: 'Tender No.' },
	              { name: 'tenderTitle',displayName: 'Tender Title'},
	              { name: 'department',displayName: 'Department'},
	              { name: 'category',displayName: 'Category' },
	              { name: 'startdate',displayName: 'Bid Start Date'/*, width: '30%'*/},
	              { name: 'submissiondate', displayName:'Bid Submission Date',width:"10%"},
	              { name: 'tenderDocument',displayName: 'Tender Document', cellTemplate: '<a ng-href="{{row.entity.tenderDocument}}" target="_blank" download><img src="images/pdf.png" class="pointer"></a>'},
	              { name: 'applyOnline',displayName: 'Apply Online',cellTemplate:'<button type="button" class="btn apply" ng-click="apply()">Apply Now</button>'}
	                      
	    ]
	  }; 	
	
	

	$http.get('partials/data.json')
    .success(function (response) {
        $scope.gridOptionrfp.data= response;
    })
    .error(function (error) {
       console.log("Error"+ error);
    });
	

	$scope.search= function(){
		if($scope.departmentType=="" && $scope.categoryType=="" && $scope.tenderno=="" && $scope.tendertitle==""){
			$scope.errorMessage="Enter the value to search";
			$http.get('/gettenderRfp')
		    .success(function (response) {
		        $scope.gridOptionrfp.data= response;
		    })
		    .error(function (error) {
		       console.log("Error"+ error);
		    });
		}
		
		else {
			$http.get('/getalltenderRfps')
	    .success(function (response) {
	        $scope.gridOptionrfp.data= response;
	    })
	    .error(function (error) {
	       console.log("Error"+ error);
	    });
		}
	
}

});