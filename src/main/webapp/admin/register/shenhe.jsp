<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/main.css">
<script language=JavaScript src="../../js/comm.js"></script>
<style type="../../text/css">
<!--
body {
	background-image: url(images/bg.gif);
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {color: #FFFFFF}
.STYLE2 {color: #3366CC}
-->
</style>
</head>
<body>
${error }
<form action="list_shenpi.htm" method="post" name="form_info" target="main">
<table width="738" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
  <tr class=list align="center">
    <td colspan="5" bordercolor="#6666FF"><div align="left">申请人基本信息：</div></td>
    <td rowspan="4" align="center" valign="middle" bordercolor="#6666FF"><img src="images/矢量徽标(效果C)100_100.jpg" width="100" height="100"></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">申请人：</td>
    <td bordercolor="#6666FF">
      ${regi.proposer }</td>
    <td bordercolor="#6666FF">户籍地址：</td>
    <td colspan="2" bordercolor="#6666FF">${regi.domicileaddress }</td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">联系电话：</td>
    <td bordercolor="#6666FF">${regi.proptel }</td>
    <td bordercolor="#6666FF">证件号码：</td>
    <td colspan="2" bordercolor="#6666FF">${regi.propidcard }</td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">代理人：</td>
    <td bordercolor="#6666FF">${regi.agent }</td>
    <td bordercolor="#6666FF">证件号码：</td>
    <td colspan="2" bordercolor="#6666FF">${regi.agentidcard }</td>
  </tr>
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF">&nbsp;</td>
  </tr>
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF"><div align="left">房产基本信息：</div></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td width="100" bordercolor="#6666FF">区：</td>
    <td width="145" bordercolor="#6666FF">${regi.zone }</td>
    <td width="100" bordercolor="#6666FF">建筑区划：</td>
    <td width="145" bordercolor="#6666FF">${regi.buildingarea }</td>
    <td width="100" bordercolor="#6666FF">丘地号：</td>
    <td bordercolor="#6666FF">-</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">登记种类：</td>
    <td bordercolor="#6666FF">${regi.registrationtypes }</td>
    <td bordercolor="#6666FF">房屋性质：</td>
    <td bordercolor="#6666FF">${regi.roomtype }</td>
    <td bordercolor="#6666FF">取得方式：</td>
    <td bordercolor="#6666FF">${regi.gainingmethod }</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">房屋坐落：</td>
    <td colspan="3" bordercolor="#6666FF">${regi.roomaddress }</td>
    <td bordercolor="#6666FF">分户图：</td>
    <td bordercolor="#6666FF">-</td>
  </tr>
  
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF">&nbsp;</td>
  </tr>
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF"><div align="left">共有人基本信息：</div></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF"><div align="center">共有人姓名</div></td>
    <td bordercolor="#6666FF"><div align="center">证件号码</div></td>
    <td bordercolor="#6666FF"><div align="center">户籍地址</div></td>
    <td bordercolor="#6666FF"><div align="center">共有方式</div></td>
    <td bordercolor="#6666FF"><div align="center">共有份额</div></td>
    <td bordercolor="#6666FF"><div align="center">联系方式</div></td>
  </tr>
  <c:forEach items="${sstss }" var="ssts">
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">${ssts.sharename }</td>
    <td bordercolor="#6666FF">${ssts.shareidcard }</td>
    <td bordercolor="#6666FF">${ssts.shareaddresss }</td>
    <td bordercolor="#6666FF">${ssts.sharetype }</td>
    <td bordercolor="#6666FF">${ssts.share }</td>
    <td bordercolor="#6666FF">${ssts.sharetel }</td>
  </tr>
  </c:forEach>
  
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF">&nbsp;</td>
  </tr>
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF"><div align="left">交验证件：</div></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="2" bordercolor="#6666FF"><span class="STYLE2">登记申请书一份：</span></td>
    <td colspan="4" bordercolor="#6666FF"><label><span class="STYLE2"><a target="_blank" href="<%=basePath%>/img/${regi.application }">登记申请书</a></span></label></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="2" bordercolor="#6666FF"><span class="STYLE2">身份证复印件一份：</span></td>
    <td colspan="4" bordercolor="#6666FF"><span class="STYLE2"><a target="_blank" href="<%=basePath%>/img/${regi.idcopy }">身份证复印件</a></span></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="2" bordercolor="#6666FF"><span class="STYLE2">一寸照片一张：</span></td>
    <td colspan="4" bordercolor="#6666FF"><span class="STYLE2"><a target="_blank" href="<%=basePath%>/img/${regi.photo }">一寸照片</a></span></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="2" bordercolor="#6666FF"><span class="STYLE2">购房发票复印件一份：</span></td>
    <td colspan="4" bordercolor="#6666FF"><span class="STYLE2"><a target="_blank" href="<%=basePath%>/img/${regi.purchasecopy }">购房发票</a></span></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="2" bordercolor="#6666FF"><span class="STYLE2">购房合同复印件（已备案）一份：</span></td>
    <td colspan="4" bordercolor="#6666FF"><span class="STYLE2"><a target="_blank" href="<%=basePath%>/img/${regi.contractcopy }">购房合同</a></span></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="2" bordercolor="#6666FF"><span class="STYLE2">契税完税证复印件一份：</span></td>
    <td colspan="4" bordercolor="#6666FF"><span class="STYLE2"><a target="_blank" href="<%=basePath%>/img/${regi.taxcopy }">契税完税证</a></span></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="6" bordercolor="#6666FF">&nbsp;</td>
  </tr>
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF"><div align="left">审批意见：</div></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF"><span class="STYLE2">审核意见：</span></td>
    <td colspan="3" bordercolor="#6666FF"><label>
      <textarea name="textarea" cols="40" rows="3"></textarea>
    </label></td>
    <td bordercolor="#6666FF">审核人：</td>
    <td bordercolor="#6666FF">系统管理员</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF"><span class="STYLE2">复审意见：</span></td>
    <td colspan="3" bordercolor="#6666FF"><textarea name="textarea2" cols="40" rows="3"></textarea></td>
    <td bordercolor="#6666FF">复审人：</td>
    <td bordercolor="#6666FF">系统管理员</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF"><span class="STYLE2">审批意见：</span></td>
    <td colspan="3" bordercolor="#6666FF"><textarea name="textarea3" cols="40" rows="3"></textarea></td>
    <td bordercolor="#6666FF">审批人：</td>
    <td bordercolor="#6666FF">系统管理员</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="6" bordercolor="#6666FF">&nbsp;</td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="6" align="center" bordercolor="#6666FF">
      <input type="submit" name="Submit" value="确认审批">
      &nbsp;&nbsp;
      <input type="reset" name="Submit2" value="全部清空"></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="6" align="center" bordercolor="#6666FF">&nbsp;</td>
  </tr>
</table>
</form>
</body>
</html>