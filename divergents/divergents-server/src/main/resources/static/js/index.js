var divergents = angular.module('divergents', ['ngRoute',
                                        'ui.grid',
                                         'ui.grid.edit',
                                          'ui.grid.cellNav',
                                          'ui.grid.autoResize',
                                          'ui.bootstrap',
                                          'ui.grid.pagination']);


divergents.config( function($routeProvider, $httpProvider){
	
	$routeProvider.when('/nsdc', {
	    templateUrl : 'nsdcAdmin.html',
	    	controller : 'nsdcAdmin'
	})
	.when('/student', {
		templateUrl : 'templates/student.html',
        controller : 'student'
	})
    .when('/login',{
        templateUrl : 'becomeTP.html',
        controller : 'becomeTP'
    }).
    when('/logout',{
    	 templateUrl : 'webinarsPublicUser.html',
         controller : 'webinarsPublicUser'
    })
	.otherwise('/');
	
	$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
	
});
divergents.controller('signupCtrl', function($scope,$http){
	
});
divergents.controller('loginCtrl' , function($rootScope, $http, $location, $route,$scope,$timeout){
$scope.openStudent = function()
{
	var openStudentUrl = '/student';
	$rootScope.templateShow = true;
	$location.path = openStudentUrl;
}

	
// -----------------------------------------------------------------------------
//	$rootScope.priv = "PU";
//	$scope.credentials = {
//			
//	};
//	 //Signup Function
//	 $scope.signUp = function()
//	 {
//		 
//	 }
	 
//----------------------------------------------------------------------------	 
//	 //check and route to different tenplates
//	    var checkAndSetState =function(submitRoutingUrl,acceptedRoutingUrl){
//	        $http({
//	            method: 'POST',
//	            url: "/getApplicationState"})
//	             .then(function(response){
//	            	 var appState = response.data.applicationState;
////	                 alert("Application get successful, state = " + appState);
//	                 if(appState == 'Draft'){
//	                     $location.path(submitRoutingUrl);
//	                 }
//
//	                 else{
//	                     //alert("Not routing to pc " + appState);
//	                     $location.path(acceptedRoutingUrl);
//	                 }
//
//	             });
//
//	     
//
//	    }
	 
//-----------------------------------------------------------	 
	 //success callback function
//	    var successCallBack = function(authenticated) {
//	        if (authenticated) {
//	            var userType = $rootScope.type;
//	            var PU = '"PU"';
//	            var TP = '"TP"';
//	            var NSDC = '"NSDC"';
//	            var appState = "Submit";
//
//
//
//	            if(userType == PU){
//	                
//	              //  $location.path("/assessmentBody");
//	                $rootScope.priv = "PU";
//	                //$location.hrefcheckAndSetState("/profileCreationAb","/assessmentBody");
//	            }
//
//	            if(userType == TP){
//	                
//	                $rootScope.priv = "TP";
//	                //checkAndSetState("/profileCreationTp","/trainingPartner");
//	            }
//
//	            if(userType == NSDC){
//	                
//	                //$location.path("/master");
//	                $rootScope.priv = "NSDC";
//	            }
//
//	            $scope.error = false;
//	            $rootScope.authenticated = true;
//
//
//	        } 
//	    
//	}
// -----------------------------------------------------------------------
	 //Authenticate Function
//	var authenticate = function(credentials)
//	{
//		var setSession = "/user";
//		  var headers = credentials ? {
//	          authorization : "Basic " + btoa(credentials.userId + ":" + credentials.password)
//	        } : {};
//	        $http.get(setSession,{
//	            headers : headers
//	        }).then(function(response){
//	        	if(response.status == 200)
//	        		{
//	        		$rootScope.authenticated = true;
//	        		var loginControllerURI = "/loginUrl";
//	        		  
//	        		  $http({
//
//	        					url : loginControllerURI,
//	        					method : "GET",
//	        					transformResponse: [function (data)  {
//	        	                    //console.log(data);
//
//	        	                    spock = data;
//	        	                    return data;
//	        	                   }],
//	        					//data : angular.toJson($scope.user),
//	        					headers : {
//	        					'Content-type': 'application/json'
//	        					           }
//
//	        		       }).then(function(response)
//	        		       
//	        		       	{
//	        		    	   
//	        		        var loginAction=response.data;
//	        		        console.log(loginAction);
//	        		       
//	        		       }, function(errorResponse){
//	        		    	   $rootScope.authenticated = false;
//	        		       });
//	        		  $location.path = "/login";
//	        		}
//	        	else
//	        		{
//	        		$rootScope.authenticated = false;
//	        		}
//	        	
//	        	$rootScope.type = JSON.stringify(response.data.authorities[0].authority);
//	            successCallBack($rootScope.authenticated);
//	            
//	        }, function(errorResponse){
//	        	$rootScope.authenticated = false;
//	        })
//	}
	
// -------------------------------------------------------
//	authenticate();
//	$scope.credentials = {
//			
//	};
//---------------------------------------------
	//Login function 
//	 $scope.login = function() {
//	        authenticate($scope.credentials, function(){
//	        	if($rootScope.authenticated)
//	        		{
//	        		
//	        		}
//	        	else{
//	        		
//	        	}
//	        });
//	    };
//-----------------------------------------------
//$scope.logout = function()
//{
//	$rootScope.authenticated = false;
//	$rootScope.type= "logout";
//	
//	$http.post("logout").then(function(response){
//		window.location.href ="/logout";
//	
//	//$location.path = '/logout';
//}, function(errorResponse){
//	$rootScope.authenticated = false;
//	window.location.href ="/";
//})
//	};
	});