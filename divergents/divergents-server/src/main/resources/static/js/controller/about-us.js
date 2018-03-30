var aboutUs = angular.module('divergents');

aboutUs.controller('aboutUs', function($scope, $http)
		{
    
    $scope.sectors =[
  {
    'id': '1',
     'name': "Construction and Building Technology",
     'categories': [{
        'id': '11',
        'dep': "Architectural Stonemasonry"
    }, {
        'id': '12',
        'dep': "Bricklaying"
   
    
    
    },
    {
        'id': '13',
        'dep': "Cabinetmaking"
   
    
    
    },
    {
        'id': '14',
        'dep': "Carpentry"
   
    
    
    },
    {
        'id': '15',
        'dep': "Concrete Construction Work"
   
    
    
    },
    {
        'id': '16',
        'dep': "Electrical Installations"
   
    
    
    },
    {
        'id': '17',
        'dep': "Joinery"
   
    
    
    },
    {
        'id': '18',
        'dep': "Landscape Gardening"
   
    
    
    },
    {
        'id': '20',
        'dep': "Plastering and Drywall Systems"
   
    
    
    },
    {
        'id': '21',
        'dep': "Plumbing and Heating"
   
    
    
    },
    {
        'id': '22',
        'dep': "Refrigeration and Air Conditioning"
   
    
    
    },
    
    
    
    ]
  },
  {
    'id': '2',
     'name': "Creative Arts and Fashion",
     'categories':  [{
        'id': '23',
        'dep': "Fashion Technology"
    }, {
        'id': '24',
        'dep': "Floristry"
    },
    {
        'id': '25',
        'dep': "Graphic Design Technology"
   
    
    
    },
    {
        'id': '25',
        'dep': "jewellry"
   
    
    
    },
    
    ]
  }];
});