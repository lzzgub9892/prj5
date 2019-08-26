<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Highcharts Example</title>

<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<style type="text/css">
${
demo
.css
}
</style>
<script type="text/javascript">
	function getUrlParam(name) {
		res=[];
	    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
	    var r = window.location.search.substr(1).match(reg);  //匹配目标参数
	    if (r != null) return encodeURI(r[2]); return null; //返回参数值
	};
	
	$(function() {
		$.ajaxSetup({
			  url: "/xmlhttp/",
			  global: false,
			  async:false
			});
					
		var data;
		 var condition=getUrlParam('condition');
		 var startdate=getUrlParam('startdate');
		 var enddate=getUrlParam('enddate');
		 $.ajax({ 
			    type:'post',  
			    url:'show', 
			    cache: false,
			    data:{'condition':condition,
					  'startdate':startdate,
						'enddate':enddate
				    },  
			    dataType:'json', 
			    success:function(json){ 
				    data=json;
				    console.log(data);
			    	
			    },
			    error:function(){ 
			     alert("请求失败");
			    }
			   });
		$('#container')
				.highcharts(
						{
							chart : {
								type : 'column'
							},
							title : {
								text : ''
							},
							subtitle : {
								text : ''
							},
							xAxis : {
								type : 'category',
								labels : {
									rotation : -45,
									style : {
										fontSize : '13px',
										fontFamily : 'Verdana, sans-serif'
									}
								}
							},
							yAxis : {
								min : 0,
								title : {
									text : 'Population (millions)'
								}
							},
							legend : {
								enabled : false
							},
							tooltip : {
								pointFormat : '房屋数'
							},
							series : [ {
								name : '房屋数',
								data : data,
								dataLabels : {
									enabled : true,
									rotation : -90,
									color : '#FFFFFF',
									align : 'right',
									x : 4,
									y : 10,
									style : {
										fontSize : '13px',
										fontFamily : 'Verdana, sans-serif',
										textShadow : '0 0 3px black'
									}
								}
							} ]
						});
	});
</script>
</head>
<body>
	<script src="<%=basePath%>js/highcharts/js/highcharts.js"></script>
	<script src="<%=basePath%>js/highcharts/js/modules/exporting.js"></script>

	<div id="container"
		style="min-width: 500px; height: 400px; margin: 0 auto"></div>

</body>
</html>

