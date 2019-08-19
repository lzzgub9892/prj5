<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
role管理
<TABLE border="1" width="100%">
<TR>
	<TD>rid</TD>
	<TD>rname</TD>
	<TD>operate</TD>
</TR>
<c:forEach items="${list}" var="role">
<TR>
	<TD>${role.rid}</TD>
	<TD>${role.rname}</TD>
	<TD>
	<a href="findById?rid=${role.rid}">Update</a></TD>
</TR>
</c:forEach>
</TABLE>

<a href="goInput">Save</a>
</body>
</html>
