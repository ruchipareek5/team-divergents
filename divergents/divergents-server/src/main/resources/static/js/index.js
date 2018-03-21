var divergents = angular.module('divergents', ['ngRoute',
                                        'ui.grid',
                                         'ui.grid.edit',
                                          'ui.grid.cellNav',
                                          'ui.grid.autoResize',
                                          'ui.bootstrap',
                                          'ui.grid.pagination']);


divergents.config(['$routeProvider','$httpProvider', function($routeProvider, $httpProvider){
	
	$routeProvider.when('/nsdc', {
	    templateUrl : 'nsdcAdmin.html'

	})
	.otherwise('/');
	
	$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
	
}]);
divergents.controller('index', function($scope,$http,$rootScope,$route,$location){
	
});