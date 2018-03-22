var manageWebinars = angular.module('divergents');

manageWebinars.controller('manageWebinars' , function($scope,$http){
   
	$scope.gridOptions1 = {
            enableGridMenus : false,
            enableSorting: false,
            enableFiltering: false,
            enableCellEdit : false,
            enableColumnMenus : false,
            enableHorizontalScrollbar:0,
            enableVerticalScrollbar:1,
            paginationPageSizes: [5, 10, 20, 30],
            paginationPageSize: 10,
            useExternalPagination: true,
            columnDefs : [
                { name: 'webinarName', displayName: 'Webinar Name', cellClass:'wname'},
                { name: 'pdfPath', displayName: 'Description Pdf', cellTemplate: '<img src="image/pdf.png" class="pointer" ng-click=grid.appScope.download(row)>', cellClass:'pdf'},
                { name: 'uploadedOn', displayName: 'Upload Date', cellClass:'date'}
            ]};

        $http.get('data.json')
            .then(function(response) {
                $scope.gridOptions1.data = response.data;
            });


        $scope.gridOptions2 = {
            enableGridMenus : false,
            enableSorting: false,
            enableFiltering: false,
            enableCellEdit : false,
            enableColumnMenus : false,
            enableHorizontalScrollbar:0,
            enableVerticalScrollbar:1,
            paginationPageSizes: [5, 10, 20, 30],
            paginationPageSize: 10,
            useExternalPagination: true,
            columnDefs : [
                { name: 'webinarName', displayName: 'Webinar Name'},
                { name: 'appName', displayName: 'Applicant Name'},
                { name: 'contactNo', displayName: 'Contact Number'},
                { name: 'Email', displayName: 'Email Id'},
                { name: 'Occupation', displayName: 'Occupation'}
            ]};

        $http.get('data1.json')
            .then(function(response) {
                $scope.gridOptions2.data = response.data;
            });
});


