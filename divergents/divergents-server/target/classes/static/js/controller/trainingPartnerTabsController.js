var trainingPartnerTabs = angular.module('divergents');

trainingPartnerTabs.controller('trainingPartnerTabs',function($scope, $http) {
	//write code here
  $scope.chartType = 'chart1';
  $scope.chartTypeList = [{ id:'chart1',name:'Placement of top 5 TP'},{id:'chart2',name:'Maximum CSR contibutions'}];
  //write code here
  $scope.generateChart = function()
  {
    if($scope.chartType == 'chart1')
      {
        //$scope.response = "Ruchi";
    	//maxCsrContribution();
      }
    else if ($scope.chartType == 'chart2')
      {
    	//$scope.response = "Prateek";
         //topFiveTpPlacementPercentage();
      }
    
  }


	
	
	 $http.get("/getTotalJobRoles")
    .then(function(response) {
    	if(response.data == null){
    		$scope.totalJobRoles = 0;
    	}
    	else
    		{
    		$scope.totalJobRoles = response.data;
    		}
        
    });

    $http.get("/getTotalCandidatesTrained")
          .then(function(response) {
        	  if(response.data == null)
        		  {
        		  $scope.totalCandidatesTrained =0;  
        		  }
        	  else
        		  {
        		  $scope.totalCandidatesTrained =response.data;
        		  }
        	  
          });

       $http.get("/getTotalTrainingPartners")
                .then(function(response) {
                	if(response.data == null)
                		{
                		$scope.totalTrainingPartners = 0;
                		}
                	else
                		{
                		$scope.totalTrainingPartners = response.data;
                		}
                });


        $http.get("/getTotalSectorSkillCouncil")
                  .then(function(response) {
                	  if(response.data == null)
                		  {
                		  $scope.totalSectorSkillCouncils = 0;
                		  }
                	  else
                		  {
                		  $scope.totalSectorSkillCouncils = response.data;
                		  }
                  });

        $http.get("/getAnnualTarget")
                          .then(function(response) {
                        	  if(response.data == null)
                        		  {
                        		  $scope.annualTarget = 0;
                        		  }
                        	  else
                        		  {
                        		  $scope.annualTarget = response.data;
                        		  }
                          });
                          
	
	
        //High Charts
        
        //Top 5 Corporates with maximum CSR Contribution in last 2 years
        
        
        
      $(document).ready(function() {  
          
           var organisationName=[];
           var csrFunds=[];
           var csrFundsSum=0;
           $.getJSON('/getTopFiveCorporates', function(data) {
              for(var i=0;i<data.length;i++)
             {
              organisationName.push(data[i].organisationName);
              csrFunds.push(data[i].csrFunds);
                 csrFundsSum+=csrFunds[i];
             }
            var chart = {
               type: 'column'
            };
            var title = {
               text: 'Top 5 Corporates with maximum CSR Contribution'   
            };
            var subtitle = {
               text: 'Last 2 years'  
            };
            var xAxis = {
               categories:organisationName,
               crosshair: true
            };
            var yAxis = {
               min: 0,
               title: {
                  text: 'CSR Contribution (INR)'         
               },
               labels: {
            formatter:function() {
                var pcnt = (this.value / csrFundsSum) * 100;
                return Highcharts.numberFormat(pcnt,0,',') + '%';
            }
        }
            };
            var tooltip = {
               headerFormat: '<span style = "font-size:10px">{point.key}</span><table>',
               pointFormat: '<tr><td style = "color:{series.color};padding:0">{series.name}: </td>' +
                  '<td style = "padding:0"><b>{point.y:.1f} INR</b></td></tr>',
               footerFormat: '</table>',
               shared: true,
               useHTML: true
            };
            var plotOptions = {
               column: {
                  pointPadding: 0.2,
                  borderWidth: 0
               },
               
            };  
            var credits = {
               enabled: false
            };
            var series= [
               {
                  name: 'CSR Contribution',
                  data: csrFunds
               }
            ];     
         
            var json = {};   
            json.chart = chart; 
            json.title = title;   
            json.subtitle = subtitle; 
            json.tooltip = tooltip;
            json.xAxis = xAxis;
            json.yAxis = yAxis;  
            json.series = series;
            json.plotOptions = plotOptions;  
            json.credits = credits;
            $('#total-csr').highcharts(json);
  
         });
          });
          
         
          
          
        // Placement Percentage of Top 5 TP in last 2 years
        
           $(document).ready(function() {  
          
           trainingPartnerName=[];
           totalPlacements=[];
           totalPlacemetsSum=0
            
           $.getJSON("/PlacementPercentageOfTopFiveTp",function(data) {
              for(var i=0;i<data.length;i++)
             {
              trainingPartnerName.push(data[i].trainingPartnerName);
              totalPlacements.push(data[i].totalPlacements);
                 totalPlacemetsSum += totalPlacements[i];
             }
            var chart = {
               type: 'column'
            };
            var title = {
               text: 'Placement Percentage of Top 5 Training Partners According to Job Role'   
            };
            var subtitle = {
               text: 'Last 2 years'  
            };
            var xAxis = {
               categories: trainingPartnerName,
               crosshair: true
            };
            var yAxis = {
               min: 0,
               title: {
                  text: 'Placement Percentage'         
               },
               labels: {
            formatter:function() {
                var pcnt = (this.value / totalPlacemetsSum) * 100;
                return Highcharts.numberFormat(pcnt,0,',') + '%';
            }
        }
            };
            var tooltip = {
               headerFormat: '<span style = "font-size:10px">{point.key}</span><table>',
               pointFormat: '<tr><td style = "color:{series.color};padding:0">{series.name}: </td>' +
                  '<td style = "padding:0"><b>{point.y:.0f} Placements</b></td></tr>',
               footerFormat: '</table>',
               shared: true,
               useHTML: true
            };
            var plotOptions = {
               column: {
                  pointPadding: 0.2,
                  borderWidth: 0
               },
               
            };  
            var credits = {
               enabled: false
            };
            var series= [
               {
                  name: 'Placements',
                  data: totalPlacements
               }
            ];     
         
            var json = {};   
            json.chart = chart; 
            json.title = title;   
            json.subtitle = subtitle; 
            json.tooltip = tooltip;
            json.xAxis = xAxis;
            json.yAxis = yAxis;  
            json.series = series;
            json.plotOptions = plotOptions;  
            json.credits = credits;
            $('#placement-percent').highcharts(json);
  
         });
          });			
});
