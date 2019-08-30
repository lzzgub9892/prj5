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
	     		<td width="150" align="right">受理流水号：</td>
	     		<td width="245">
	     			<input name="servicenumber" type="text" size="37">
	     		</td>
	     	</tr>
			<tr class=toplist align="center">
	      		<td align="right">产权人：</td>
	      		<td>
	      			<input name="clientname" type="text" size="37">
	      		</td>
	      	</tr>
			<tr class=toplist align="center">
				<td align="right">产权人身份证明号：</td>
		        <td>
		        	<input name="idcard" type="text" size="37">
		        </td>
		    </tr>
	      	<tr class=toplist align="center">
	      		<td align="right">产权证号：</td>
			    <td>
			    	<input name="textfield4" type="text" size="37">
			    </td>
	      	</tr>
	      	<tr class=toplist align="center">
			    <td align="right">原产权人：</td>
			    <td>
			    	<input name="oldclientname" type="text" size="37">
			    </td>
		    </tr>
		    <tr class=toplist align="center">
		        <td align="right">原产权证号：</td>
		        <td>
		        	<input name="textfield32" type="text" size="37">
		        </td>
		    </tr>
		    <tr align="center">
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