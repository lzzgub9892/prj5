<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="stylesheet" href="css/main.css">
<script language=JavaScript src="js/comm.js"></script> -->
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form name="form_list" method="post" action="ruku.htm">
<table class="table">
  <tr class=list align="center">
    <td width="20%" align="center" bordercolor="#6666FF">业务类型</td>
    <td width="15%" align="center" bordercolor="#6666FF">业务状态</td>
    <td width="15%" align="center" bordercolor="#6666FF">申请人</td>
    <td width="20%" align="center" bordercolor="#6666FF">身份证件号码</td>
    <td width="15%" align="center" bordercolor="#6666FF">受理时间</td>
    <td width="15%" align="center" bordercolor="#6666FF">受理人</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_list.submit();">
    <td bordercolor="#6666FF">所有权登记</td>
    <td bordercolor="#6666FF">&lt;已受理&gt;</td>
    <td bordercolor="#6666FF">张三</td>
    <td bordercolor="#6666FF">610101200808085555</td>
    <td bordercolor="#6666FF">20080926</td>
    <td bordercolor="#6666FF">园区办01</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_list.submit();">
    <td bordercolor="#6666FF">他项权登记</td>
    <td bordercolor="#6666FF">&lt;已受理&gt;</td>
    <td bordercolor="#6666FF">李四</td>
    <td bordercolor="#6666FF">610101200606066666</td>
    <td bordercolor="#6666FF">20080926</td>
    <td bordercolor="#6666FF">业务专员</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_list.submit();">
    <td bordercolor="#6666FF">预告登记</td>
    <td bordercolor="#6666FF">&lt;已受理&gt;</td>
    <td bordercolor="#6666FF">王麻子</td>
    <td bordercolor="#6666FF">610101198806066666</td>
    <td bordercolor="#6666FF">20080926</td>
    <td bordercolor="#6666FF">业务大厅</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_list.submit();">
    <td bordercolor="#6666FF">异议登记</td>
    <td bordercolor="#6666FF">&lt;已受理&gt;</td>
    <td bordercolor="#6666FF">伍学名</td>
    <td bordercolor="#6666FF">610101198008081234</td>
    <td bordercolor="#6666FF">20080926</td>
    <td bordercolor="#6666FF">业务专员</td>
  </tr>
</table>
</form>
</body>
</html>