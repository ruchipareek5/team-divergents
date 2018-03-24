var findtrainingcenter = angular.module('divergents');

findtrainingcenter.controller('findtrainingcenter', function($scope,$http){
	console.log("Working TC");
	
	
	
		$http.get('/getallStates')
    .success(function (response) {
        console.log("this is working" + response);
    })
    .error(function (response) {
       console.log("Error");
    });

//	
//	
//	$http.get('/getallDistrict')
//    .success(function (response) {
//        console.log(response);
//    })
//    .error(function (response) {
//       console.log("Error");
//    });
//	
//	
//	$http.get('/getallBlock')
//    .success(function (response) {
//        console.log(response);
//    })
//    .error(function (response) {
//       console.log("Error");
//    });
//	
//	
//	$http.get('/getallSector')
//    .success(function (response) {
//        console.log(response);
//    })
//    .error(function (response) {
//       console.log("Error");
//    });
//	
//	
//	$http.get('/getallJobroles')
//    .success(function (response) {
//        console.log(response);
//    })
//    .error(function (response) {
//       console.log("Error");
//    });
	
//	$scope.findtc =function(){
//        $http({
//            method: 'POST',
//            url: "/findtrainingcenter",
//            data : angular.toJson($scope.x)
//        })
//             .then(function(response){
//            	 
//             });
//        }
	
	
	
});