var aboutUs = angular.module('divergents');

aboutUs.controller('aboutUs', function($scope, $http, $timeout){

	
    $scope.sectors =[
  {
    'id': 'Construction and Building Technology',
     'name': "Construction and Building Technology",
     'categories': [{
        'id': 'Architectural Stonemasonry',
        'dep': "Architectural Stonemasonry"
    }, {
        'id': 'Bricklaying',
        'dep': "Bricklaying"
   
    
    
    },
    {
        'id': 'Cabinetmaking',
        'dep': "Cabinetmaking"
   
    
    
    },
    {
        'id': 'Carpentry',
        'dep': "Carpentry"
   
    
    
    },
    {
        'id': 'Concrete Construction Work',
        'dep': "Concrete Construction Work"
   
    
    
    },
    {
        'id': 'Electrical Installations',
        'dep': "Electrical Installations"
   
    
    
    },
    {
        'id': 'Joinery',
        'dep': "Joinery"
   
    
    
    },
    {
        'id': 'Landscape Gardening',
        'dep': "Landscape Gardening"
   
    
    
    },
    {
        'id': 'Plastering and Drywall Systems',
        'dep': "Plastering and Drywall Systems"
   
    
    
    },
    {
        'id': 'Plumbing and Heating',
        'dep': "Plumbing and Heating"
   
    
    
    },
    {
        'id': 'Refrigeration and Air Conditioning',
        'dep': "Refrigeration and Air Conditioning"
   
    
    
    },
    
    
    
    ]
  },
  {
    'id': 'Creative Arts and Fashion',
     'name': "Creative Arts and Fashion",
     'categories':  [{
        'id': 'Fashion Technology',
        'dep': "Fashion Technology"
    }, {
        'id': 'Floristry',
        'dep': "Floristry"
    },
    {
        'id': 'Graphic Design Technology',
        'dep': "Graphic Design Technology"
   
    
    
    },
    {
        'id': 'jewellry',
        'dep': "jewellry"
   
    
    
    },
    
    ]
  }];
    
    $scope.submit = function(){
    	var submitSkillcompetitionURI = "/submitSkillcompetition";
		 $http({

				url : submitSkillcompetitionURI,
				method : "POST",
				data : angular.toJson($scope.find),
				headers : {
				'Content-type': 'application/json'
				           }

	       }).then(function(response)
	       
	       	{
	        var findResponse=response.data;
	       
	       if(findResponse == 1)
	    	   {
	    	   
	    	   $scope.find="";
	    	   
	    	   $scope.successMessage = "Submission Successful";
	    	   
	    	   $timeout(function() {
	            	  $scope.successMessage="";
	               }, 2000);
	    	   
	    	   }
	       else 
    	   {
    	   $scope.find="";
    	   $scope.errorMessage = "Data cannot be submitted";
    	   
    	   $timeout(function() {
            	  $scope.errorMessage="";
               }, 2000);
    	   }
       });
}
    
});