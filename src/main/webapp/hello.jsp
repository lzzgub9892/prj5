<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <h3>欢迎进入房管局后台</h3>
      <img alt="" src="<%=basePath%>img/1fd1ff2d-245f-488e-afea-08d14eac3fd7.jpg" >
</body>
</html>