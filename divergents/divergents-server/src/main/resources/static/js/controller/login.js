var login = angular.module('divergents');

login.controller('loginCtrl' ,['$scope', '$http', function($scope,$http){
  
  $scope.login=function(){
  
  console.log(angular.toJson($scope.user));
  var loginControllerURI = "/loginUrl";
  
  $http({

			url : loginControllerURI,
			method : "POST",
			data : angular.toJson($scope.user),
			headers : {
			'Content-type': 'application/json'
			           }

       }).then(function(response)
       
       	{
        var loginAction=response.data;
        console.log(loginAction);
       
       });
  }

}
]);