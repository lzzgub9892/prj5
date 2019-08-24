<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style_1.css">
<style type="text/css">
<!--
body {
	background-image: url(images/bg.gif);
}
-->
</style>
</head>
<body>
<form name="form" method="post" action="list_dengjibu.htm">
<table width="300" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="28" colspan="2">请输入需要打印登记簿编号：</td>
  </tr>
  <tr>
    <td height="28">登记簿编号：</td>
    <td><input name="roomid" type="text" >      </td>
  </tr>
  <tr>
    <td height="28" colspan="2"><div align="center">
        <input name="dayin" type="button" id="dayin" value="打印" onClick=confirm("确定打印登记簿？")>
		&nbsp;<input name="dayin_all" type="button" id="dayin_all" value="打印全部未打印登记簿" onClick=confirm("确定打印全部未打印登记簿？")>
    </div></td>
  </tr>
</table>
</form>
</body>
</html>