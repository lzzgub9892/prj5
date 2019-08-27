<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	${ownerships }
	${houses }
	<table width="100%" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
	    <tr class=list align="center">
	      <td width="10%" bordercolor="#6666FF">登记簿编号</td>
	      <td width="35%" align="center" bordercolor="#6666FF">房屋坐落</td>
	      <td width="20%" align="center" bordercolor="#6666FF">所有权人（份额）</td>
	      <td width="10%" align="center" bordercolor="#6666FF">土地证号</td>
	      <td width="10%" align="center" bordercolor="#6666FF">登记时间</td>
	      <td align="center" bordercolor="#6666FF">终审人/登簿人</td>
	      <td align="center" bordercolor="#6666FF">查看</td>
	    </tr>
	    <c:forEach items=""></c:forEach>
	</table>
</body>
</html>