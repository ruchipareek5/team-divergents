var divergents = angular.module('divergents', ['ngRoute',
                                        'ui.grid',
                                         'ui.grid.edit',
                                          'ui.grid.cellNav',
                                          'ui.grid.autoResize',
                                          'ui.bootstrap',
                                          'ui.grid.pagination']);


divergents.config( function($routeProvider, $httpProvider){
	
	$routeProvider.when('/nsdc', {
	    templateUrl : 'nsdcAdmin.html'

	})
	.otherwise('/');
	
	$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
	
});
divergents.controller('signupCtrl', function($scope,$http){
	
});
divergents.controller('loginCtrl' , function($rootScope, $http, $location, $route,$scope,$timeout){
	$scope.credentials = {
			
	};
	 //Signup Function
	 $scope.signUp = function()
	 {
		 
	 }
	 //Authenticate Function
	var authenticate = function(credentials)
	{
		var setSession = "/getUserDetails";
		  var headers = credentials ? {
	          authorization : "Basic " + btoa(credentials.userId + ":" + credentials.password)
	        } : {};
	        $http.get(setSession,{
	            headers : headers
	        }).then(function(response){
	        	if(response.name)
	        		{
	        		$rootScope.authenticated = true;
	        		var loginControllerURI = "/loginUrl";
	        		  
	        		  $http({

	        					url : loginControllerURI,
	        					method : "POST",
	        					transformResponse: [function (data)  {
	        	                    //console.log(data);

	        	                    spock = data;
	        	                    return data;
	        	                   }],
	        					//data : angular.toJson($scope.user),
	        					headers : {
	        					'Content-type': 'application/json'
	        					           }

	        		       }).then(function(response)
	        		       
	        		       	{
	        		        var loginAction=response.data;
	        		        console.log(loginAction);
	        		       
	        		       });
	        		}
	        	else
	        		{
	        		$rootScope.authenticated = false;
	        		}
	        }, function(errorResponse){
	        	$rootScope.authenticated = false;
	        })
	}
	authenticate();
	$scope.credentials = {
			
	};

	//Login function 
	 $scope.login = function() {
	        authenticate($scope.credentials, function(){
	        	if($rootScope.authenticated)
	        		{
	        		
	        		}
	        	else{
	        		
	        	}
	        });
	    };
$scope.logout = function()
{$http.post("/logout").then(function(response){
	$rootScope.authenticated = false;
	$location.path = '/';
}, function(errorResponse){
	$rootScope.authenticated = false;
	$location.path = '/';
})
	};
	});