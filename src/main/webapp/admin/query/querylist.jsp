<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
<form id="form" action="#" method="post"  target="_parent">
	<table id="table" class="table" >
	    <tr class=list align="center">
	      <td>登记簿编号</td>
	      <td>房屋坐落</td>
	      <td>所有权人（份额）</td>
	      <td>土地证号</td>
	      <td>登记时间</td>
	      <td>终审人/登簿人</td>
	    </tr>
	    <c:forEach items="${ownerships}" var="owner">
	    
	    	<tr align="center" onclick="go(${owner.roomid})">
	    		<td>${owner.osid }</td>
	    		<td>${owner.house.location }</td>
	    		<td>${owner.client.clientname }</td>
	    		<td>${owner.landnumber.lnname }</td>
	    		<td><fmt:formatDate value="${owner.registertime }" pattern="yyyy-MM-dd"/></td>
	    		<td>${owner.userinfo.uname }</td>
	    	</tr>
	    	
	    </c:forEach>
	</table>
	</form>
</body>

<script>
	function go(value){
		var ele=$("#form");
		alert(value);
		ele.prop("action","/admin/registertor/findByRoomId?roomid="+value);
		ele.submit();
	}
</script>

</html>