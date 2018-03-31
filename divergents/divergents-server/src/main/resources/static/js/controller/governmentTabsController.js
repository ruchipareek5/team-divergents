var govPartnerTabs = angular.module('divergents');

govPartnerTabs.controller('govPartnerTabs',function($scope,$http)
		{
	
	 $scope.chartType = 'chart3';
	 $scope.chartTypeList = [{ id:'chart3',name:'Placement of top 5 TP'},{id:'chart4',name:'Maximum CSR contibutions'}];

	 $scope.generateChart = function()
	  {
	    if($scope.chartType == 'chart3')
	      {
	        //$scope.response = "Ruchi";
	    	//maxCsrContribution();
	      }
	    else if ($scope.chartType == 'chart4')
	      {
	    	//$scope.response = "Prateek";
	         //topFiveTpPlacementPercentage();
	      }
	    
	  }
	 
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
	 
	  $http.get("/getTotalCandidatesTrained")
      .then(function(response) {
    	  if(response.data)
    		  {
    		  $scope.totalCandidatesTrained = response.data;
    		  }
    	  else
    		  {
    		  $scope.totalCandidatesTrained = 0;
    		  }
          
      });
	  
	  $http.get("/getTotalCandidatesCertified")
      .then(function(response) {
      	if(response.data == null)
      		{
      		$scope.totalCandidatesCertified = 0;
      		}
      	else
      		{
      		$scope.totalCandidatesCertified = response.data;
      		}
          
      });
	  
	  $http.get("/getTotalTrainingCenters")
      .then(function(response) {
      	if(response.data == null)
      		{
      		$scope.totalTrainingCenters = 0;
      		}
      	else
      		{
      		$scope.totalTrainingCenters = response.data;
      		}
          
      });
	  
	  $http.get("/getTotalCandidatesPlaced")
      .then(function(response) {
      	if(response.data == null)
      		{
      		$scope.totalCandidatesPlaced = 0;
      		}
      	else
      		{
      		$scope.totalCandidatesPlaced = response.data;
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
           console.log(organisationName);
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
          $('#total-cs').highcharts(json);

       });
        });
        
       
        
 
    
    $(document).ready(function() {
  	  
  	  var processed_json = new Array();
       
      $.getJSON("/PlacementPercentageOfTopFiveTp",function(data) {
         for(var i=0;i<data.length;i++)
        {
         processed_json.push([data[i].trainingPartnerName,data[i].totalPlacements]);
        }
         
        var chart = {
           plotBackgroundColor: null,
           plotBorderWidth: null,
           plotShadow: false
        };
        var title = {
           text: 'Top 5 Training Partners with maximum placement percentage'   
        };      
        var tooltip = {
           pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        };
        var plotOptions = {
           pie: {
              allowPointSelect: true,
              cursor: 'pointer',
              
              dataLabels: {
                 enabled: true,
                 format: '<b>{point.name}%</b>:{point.percentage:.1f} %',
                 style: {
                    color: (Highcharts.theme && Highcharts.theme.contrastTextColor)||
                    'black'
                 }
              }
           }
        };
        var series = [{
           type: 'pie',
           name: 'Total Placements',
           data: processed_json
        }];
        // Radialize the colors
        Highcharts.getOptions().colors = Highcharts.map(
           Highcharts.getOptions().colors, function (color) {
              return {
                 radialGradient: { cx: 0.5, cy: 0.3, r: 0.7 },
                 stops: [
                    [0, color],
                    [1, Highcharts.Color(color).brighten(-0.3).get('rgb')] // darken
                 ]
              };
           }
        );
	  
        var json = {};   
        json.chart = chart; 
        json.title = title;     
        json.tooltip = tooltip;  
        json.series = series;
        json.plotOptions = plotOptions;
        $('#placement-percen').highcharts(json);  
     });
      });
	
		});