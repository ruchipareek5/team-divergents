var divergents = angular.module('divergents', ['ngRoute',
                                        'ui.grid',
                                         'ui.grid.edit',
                                          'ui.grid.cellNav',
                                          'ui.grid.autoResize',
                                          'ui.bootstrap',
                                          'ui.grid.pagination']);


divergents.config(function($routeProvider, $httpProvider){
	
	$routeProvider.when('/', {
	    templateUrl : 'nsdcAdmin.html'

	})
	.otherwise('/');
	
	$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
	
});