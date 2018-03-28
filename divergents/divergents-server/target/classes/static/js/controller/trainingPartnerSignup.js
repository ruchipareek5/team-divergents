var signup = angular.module('divergents');

signup.controller('signupCtrl' ,['$scope', '$http', function($scope,$http){
  
  $scope.signup=function(){
  if($scope.newUser.userRole == true)
  {
  	$scope.newUser.userRole = "TP";
  	console.log($scope.newUser.userRole);
  }
  console.log(angular.toJson($scope.newUser));
  var signupControllerURI = "/skillIndiaSignup";
  
  $http({

			url : signupControllerURI,
			method : "POST",
			data : angular.toJson($scope.newUser),
			headers : {
			'Content-type': 'application/json'
			           }

       }).then(function(response)
       
       	{
        var signUpResponse=response.data;
        console.log(signUpResponse);
       
       });
  }

}
]);