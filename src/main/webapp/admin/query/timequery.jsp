<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<form action="/admin/findStart" method="post">
		<table class="table">
		    <tr class=toplist align="center">
				<td align="right">申请时间：</td>
		     	<td>
			      	<input class="date" name="begintime1" type="text" size="24" placeholder="输入时间">
			      	  至
			        <input class="date" name="begintime2" type="text" size="24" placeholder="输入时间">
		     	</td>
		    </tr>
		    <tr class=toplist align="center">
		     	<td align="right">填发时间：</td>
		      	<td width="70%">
			      	<input class="date" name="textfield5222" type="text" size="24" placeholder="输入时间">
					至
			  		<input class="date" name="textfield52222" type="text" size="24" placeholder="输入时间">
		  	  	</td>
		    </tr>
		    <tr align="center" >
		        <td colspan=2>
		        	<input name="servicetypeid" type="text"/>
		        </td>
		    </tr>
		    <tr align="center">
		        <td colspan=2>
		        	<button>查询</button>
		        </td>
		    </tr>
		</table>
	</form>
</body>
</html>