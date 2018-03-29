//   $(document).ready(function() {  
//         	
//         	 trainingPartnerName=[];
//         	 totalPlacements=[];
//         	 totalPlacemetsSum=0
//         	  var jobRole='Safai karamchari';
//         	 $.getJSON("/PlacementPercentageOfTopFiveTp?jobRole=" +jobRole,function(data) {
//              for(var i=0;i<data.length;i++)
//             {
//             	trainingPartnerName.push(data[i].trainingPartnerName);
//          		totalPlacements.push(data[i].totalPlacements);
//                 totalPlacemetsSum += totalPlacements[i];
//             }
//            var chart = {
//               type: 'column'
//            };
//            var title = {
//               text: 'Placement Percentage of Top 5 Training Partners According to Job Role'   
//            };
//            var subtitle = {
//               text: 'Last 2 years'  
//            };
//            var xAxis = {
//               categories: trainingPartnerName,
//               crosshair: true
//            };
//            var yAxis = {
//               min: 0,
//               title: {
//                  text: 'Placement Percentage'         
//               },
//               labels: {
//            formatter:function() {
//                var pcnt = (this.value / totalPlacemetsSum) * 100;
//                return Highcharts.numberFormat(pcnt,0,',') + '%';
//            }
//        }
//            };
//            var tooltip = {
//               headerFormat: '<span style = "font-size:10px">{point.key}</span><table>',
//               pointFormat: '<tr><td style = "color:{series.color};padding:0">{series.name}: </td>' +
//                  '<td style = "padding:0"><b>{point.y:.0f} Placements</b></td></tr>',
//               footerFormat: '</table>',
//               shared: true,
//               useHTML: true
//            };
//            var plotOptions = {
//               column: {
//                  pointPadding: 0.2,
//                  borderWidth: 0
//               },
//               
//            };  
//            var credits = {
//               enabled: false
//            };
//            var series= [
//               {
//                  name: 'Placements',
//                  data: totalPlacements
//               }
//            ];     
//         
//            var json = {};   
//            json.chart = chart; 
//            json.title = title;   
//            json.subtitle = subtitle; 
//            json.tooltip = tooltip;
//            json.xAxis = xAxis;
//            json.yAxis = yAxis;  
//            json.series = series;
//            json.plotOptions = plotOptions;  
//            json.credits = credits;
//            $('#placementPercentage').highcharts(json);
//  
//         });
//         	});