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
<form name="form_list" method="post" action="findByRoomId">
	
  <table width="100%" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
    <tr class=list align="center">
      <td width="10%" bordercolor="#6666FF">登记簿编号</td>
      <td width="35%" align="center" bordercolor="#6666FF">房屋坐落</td>
      <td width="20%" align="center" bordercolor="#6666FF">所有权人（份额）</td>
      <td width="10%" align="center" bordercolor="#6666FF">土地证号</td>
      <td width="10%" align="center" bordercolor="#6666FF">登记时间</td>
      <td align="center" bordercolor="#6666FF">终审人/登簿人</td>
    </tr>
    <c:forEach items="${roomList }" var="room">
	    <tr class=toplist onMouseOver=mouseovertr(this) onMouseOut=mouseouttr(this) onClick="document.form_list.submit();">
	      <td bordercolor="#6666FF">${room.roomid }</td>
	      <input type="hidden" name="roomid" value="${room.roomid }">
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
	    </tr>
    </c:forEach>
  </table>
  
</form>
</body>
</html>