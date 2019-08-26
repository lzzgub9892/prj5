<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<!-- 新 Bootstrap4 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/css/bootstrap.min.css">
 
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
 
<!-- popper.min.js 用于弹窗、提示、下拉菜单 -->
<script src="https://cdn.staticfile.org/popper.js/1.12.5/umd/popper.min.js"></script>
 
<!-- 最新的 Bootstrap4 核心 JavaScript 文件 -->
<script src="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>
<form name="form" method="post" action="">
	
  <table width="738" border="0" cellpadding="1" cellspacing="1" bgcolor="#CCCCCC">
    <tr align="center" class=list>
      <td height="25" colspan="2" bordercolor="#6666FF"><div align="center" class="title">信息统计</div></td>
    </tr>

    <tr class=toplist>
      <td width="100" bordercolor="#6666FF">请选择统计方式：</td>
      <td bordercolor="#6666FF">
      <select id="condition" name="condition">
        <option value="1" selected="selected">房屋产别统计</option>
        <option value="2">房屋结构统计</option>
        <option value="3">建筑年代统计</option>
        <option value="5">建筑区划统计</option>
        <option value="6">房屋土地性质</option>
       </select>
       </td>
    </tr>
    <tr class=toplist>
      <td bordercolor="#6666FF">统计时段：</td>
      <td bordercolor="#6666FF"><input type="text" size="16" id="startdate" NAME="startdate">
        至
        <input type="text" size="16" id="enddate" NAME="enddate"></td>
    </tr>
    <tr height="65" align="center" class=list>
      <td height="18" colspan="2" valign="top" bordercolor="#6666FF" class="toplist_text">&nbsp;</td>
    </tr>
    <tr height="65" align="center" class=list>
      <td colspan="2" valign="top" bordercolor="#6666FF" class="toplist_text"><button type="button" onclick="tongji()">开始统计</button></td>
    </tr>
    <tr height="65" id="tongjitu" align="center" class=list style="display:none">
      <td colspan="2" valign="top" bordercolor="#6666FF" class="toplist_text"></td>
    </tr>
  </table>
</form>
</body>
<script type="text/javascript">
	 function tongji(){
		 window.location.href ="<%=basePath%>admin/statistics/show.jsp?condition="+$("#condition").val()+"&startdate="+$("#startdate").val()+"&enddate="+$("#enddate").val();
	 };
</script>
</html>