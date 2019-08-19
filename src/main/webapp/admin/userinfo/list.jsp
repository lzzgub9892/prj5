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
用户管理
<TABLE border="1" width="100%">
<TR>
	<TD>uid</TD>
	<TD>uname</TD>
	<TD>roles</TD>
	<TD>status</TD>
	<TD>operate</TD>
</TR>
<c:forEach items="${list}" var="userinfo">
<TR>
	<TD>${userinfo.uid}</TD>
	<TD>${userinfo.uname}</TD>
	<TD>${userinfo.roles}</TD>
	<TD>${userinfo.isdelete?'已删除':'正常'}</TD>
	<TD>
		<a href="${!userinfo.isdelete?'delete':'revoke'}?uid=${userinfo.uid}">${!userinfo.isdelete?'删除':'恢复'}</a> 
	<a href="findById?uid=${userinfo.uid}">Update</a></TD>
</TR>
</c:forEach>
</TABLE>

<a href="goInput">Save</a>
</body>
</html>
