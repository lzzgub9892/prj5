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
<form method="post" action="findAll">
uname<INPUT TYPE="text" NAME="uname" value="${log.uname }">action<INPUT TYPE="text" value="${log.action }" NAME="action"><input type="submit" value="Query">
<TABLE border="1" width="100%">
<TR>
	<TD>logid</TD>
	<TD>uid</TD>
	<TD>action</TD>
	<TD>actiontime</TD>
	<TD>uname</TD>
</TR>
<c:forEach items="${list}" var="log">
<TR>
	<TD>${log.logid}</TD>
	<TD>${log.uid}</TD>
	<TD>${log.action}</TD>
	<TD><fmt:formatDate value="${log.actiontime}" pattern="yyyy-MM-dd hh:mm:ss"/></TD>
	<TD>${log.uname}</TD>
</TR>
</c:forEach>
</TABLE>
<TABLE border="1" width="100%">
<TR>
	<TD><a href="javascript:go(1)">First</a></TD>
	<TD><a href="javascript:go(${page.pageNow+1})">Next</a></TD>
	<TD><a href="javascript:go(${page.pageNow-1})">Before</a></TD>
	<TD><a href="javascript:go(${page.pageCount})">End</a></TD>
	<TD>
	第<INPUT TYPE="text" NAME="pageNow" id="pageNow" value="${page.pageNow }" size="1">页
	一页<INPUT TYPE="text" NAME="limit" value=${page.limit } size="1">条  ${page.pageNow }/${page.pageCount } 总共${page.count }条记录</TD>
	<TD><input type="submit" value="go"></TD>
</TR>
</TABLE>
</form>
</body>
</html>
<script>
	function go(pageNow){
		document.getElementById("pageNow").value= pageNow;
		document.forms[0].submit();
	}
</script>