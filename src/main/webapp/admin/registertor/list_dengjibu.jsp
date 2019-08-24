<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/main.css">
<script language=JavaScript src="js/comm.js"></script>
<style type="text/css">
<!--
body {
	background-image: url(images/bg.gif);
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {color: #FFFFFF}
-->
</style>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"></head>
<body>
<form name="form_list" method="post" action="findAll">
	
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
    <c:forEach items="${roomList }" var="room">
	    <tr class=toplist onMouseOver=mouseovertr(this) onMouseOut=mouseouttr(this) >
	      <td bordercolor="#6666FF">${room.roomid }</td>
	      <td bordercolor="#6666FF">
	      							${room.building.house.zone.city.cname }
	      							${room.building.house.zone.zname }
	      							${room.building.house.hname }
	      							${room.building.buildingname }
	      							${room.roomnumber }
	      </td>
	      <td bordercolor="#6666FF">
	      		<c:forEach items="${room.ownerships }" var="ownership">
				      ${ownership.client.clientname }(${ownership.client.serviceshares.share })
	      		</c:forEach>
	      </td>
	      <td bordercolor="#6666FF">${room.building.house.landnumber.lnname }</td>
	      <td bordercolor="#6666FF">${room.ownerships[0].registertime }</td>
	      <td bordercolor="#6666FF">${room.ownerships[0].userinfo.uname }</td>
	       <td bordercolor="#6666FF">
	       	<a href="findByRoomId?roomid=${room.roomid }" style="color: blue">${room.ownerships[0]==null?'已灭籍':'查看详情'}</a>
	       </td>
	     
	    </tr>
    </c:forEach>
  </table>
  <TABLE border="1" width="100%">
	<TR>
		<td><a href="javascript:frist(1)">首页</a></td>
		<td><a href="javascript:prev(${page.pageNow })">上一页</a></td>
		<td><a href="javascript:next(${page.pageNow },${page.pageCount })">下一页</a></td>
		<td><a href="javascript:last(${page.pageCount })">尾页</a></td>
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
	function frist(){
		document.getElementById("pageNow").value= 1;
		document.forms[0].submit();
	}
	function prev(pageNow){
		if(pageNow<=1){
			document.getElementById("pageNow").value= 1;
		}else{
			document.getElementById("pageNow").value= pageNow-1;
		}
		document.forms[0].submit();
	}
	function next(pageNow,pageCount){
		if(pageNow>=pageCount){
			document.getElementById("pageNow").value= pageCount;
		}else{
			document.getElementById("pageNow").value= pageNow+1;
		}
		document.forms[0].submit();
	}
	function last(pageCount){
		document.getElementById("pageNow").value= pageCount;
		document.forms[0].submit();
	}
</script>