var aboutUs = angular.module('divergents');

aboutUs.controller('aboutUs', function($scope, $http)
		{
    
    $scope.sectors =[
  {
    'id': '1',
     'name': "Aquitaine",
     'categories': [{
        'id': '22',
        'dep': "Dordogne"
    }, {
        'id': '31',
        'dep': "Gironde"
    }]
  },
  {
    'id': '2',
     'name': "Auvergne",
     'categories':  [{
        'id': '3',
        'dep': "Allier"
    }, {
        'id': '15',
        'dep': "Cantal"
    }]
  }];
});