<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<head>
<link rel="stylesheet" href="css/main.css">
<script language=JavaScript src="js/comm.js"></script>
<style type="text/css">
<!--
body {
	background-image: url(images/bg.gif);
}
.STYLE1 {color: #FFFFFF}
-->
</style>
</head>
<body>
<form name="form_list" method="post" action="loupan.htm">
<table width="100%" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
  <tr class=list align="center">
    <td width="20%" bordercolor="#6666FF">楼盘名称</td>
    <td width="15%" align="center" bordercolor="#6666FF">楼盘信息</td>
    <td width="15%" align="center" bordercolor="#6666FF">项目负责人</td>
    <td width="20%" align="center" bordercolor="#6666FF">预售许可证号</td>
    <td width="15%" align="center" bordercolor="#6666FF">楼盘状态</td>
    <td align="center" bordercolor="#6666FF">资料员</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_list.submit();">
    <td bordercolor="#6666FF">空中花园</td>
    <td bordercolor="#6666FF">相关楼盘信息</td>
    <td bordercolor="#6666FF">张三</td>
    <td bordercolor="#6666FF">1234567890</td>
    <td bordercolor="#6666FF">五证齐全</td>
    <td bordercolor="#6666FF">园区办01</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_list.submit();">
    <td bordercolor="#6666FF">雅荷花园</td>
    <td bordercolor="#6666FF">相关楼盘信息</td>
    <td bordercolor="#6666FF">李四</td>
    <td bordercolor="#6666FF">1234567891</td>
    <td bordercolor="#6666FF">在建查封</td>
    <td bordercolor="#6666FF">业务专员</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_list.submit();">
    <td bordercolor="#6666FF">绿地世纪城</td>
    <td bordercolor="#6666FF">相关楼盘信息</td>
    <td bordercolor="#6666FF">王麻子</td>
    <td bordercolor="#6666FF">1234567892</td>
    <td bordercolor="#6666FF">&nbsp;</td>
    <td bordercolor="#6666FF">业务大厅</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_list.submit();">
    <td bordercolor="#6666FF">中华世纪城</td>
    <td bordercolor="#6666FF">相关楼盘信息</td>
    <td bordercolor="#6666FF">伍学名</td>
    <td bordercolor="#6666FF">1234567893</td>
    <td bordercolor="#6666FF">&nbsp;</td>
    <td bordercolor="#6666FF">业务专员</td>
  </tr>
</table>
</form>
</body>
</html>
