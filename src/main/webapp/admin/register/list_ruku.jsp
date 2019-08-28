<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../css/main.css">
<script language=JavaScript src="../../js/comm.js"></script>

<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<style type="text/css">
<!--
body {
	background-image: url(images/bg.gif);
}
.STYLE1 {color: #FFFFFF}
-->
</style>
<script type="text/javascript">
	$(function(){
		/* $(".toplist").click(function(){
			$("form").submit();
			
			}); */
		 //点击button的方法
	    
		});
</script>
</head>
<body>

<table width="100%" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
  <tr class=list align="center">
    <td width="20%" bordercolor="#6666FF">业务类型</td>
    <td width="20%" align="center" bordercolor="#6666FF">业务状态</td>
    <td width="10%" align="center" bordercolor="#6666FF">申请人</td>
    <td width="15%" align="center" bordercolor="#6666FF">身份证件号码</td>
    
    <td width="15%" align="center" bordercolor="#6666FF">资料员</td>
    <td width="20%" align="center" bordercolor="#6666FF">操作</td>
  </tr>
  <c:forEach items="${regis }" var="regi">
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) >
    <td bordercolor="#6666FF">${regi.servicetype.servicetype }</td>
    <td bordercolor="#6666FF">&lt;已入库&gt;</td>
    <td bordercolor="#6666FF">${regi.proposer }</td>
    <td bordercolor="#6666FF">${regi.propidcard }</td>
    
    <td bordercolor="#6666FF">${user }</td>
    <td bordercolor="#6666FF">
    <button type="button" onclick="window.location.href='toshenhe?rtid=${regi.rtid }'" >进行审核</button>
    <button type="button" onclick="window.location.href='torukuupdate?rtid=${regi.rtid}'" >修改信息</button> </td>
  </tr>
 </c:forEach>
  
</table>

</body>

</html>