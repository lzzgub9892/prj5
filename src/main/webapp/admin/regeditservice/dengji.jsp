<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>选择登记类型</title>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<script>
	$(document).ready(function(){
		$.post("/admin/getByPid",{"pid":0},function(data){
			if(data!=null){
				for(var i=0;i<data.length;i++){
					$("#servicetype").append("<option value="+data[i].servicetypeid+">"+data[i].servicetype+"</option>");
				}
			}
		});
	});
</script>
</head>
<body>
	<form action="/admin/getServicetype" method="post">
		<select id="servicetype" name="servicetypeid"></select>
		<button>登记</button>
	</form>
</body>
</html>