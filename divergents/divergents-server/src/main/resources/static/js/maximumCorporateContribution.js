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
            $('#container').highcharts(json);
  
         });
         	});