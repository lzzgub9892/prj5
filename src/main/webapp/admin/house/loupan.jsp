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
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {color: #FFFFFF}
.STYLE2 {color: #3366CC}
-->
</style>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"></head>
<body>
<form action="fenhu.htm" method="post" name="form_info" target="main">
<table width="100%" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
  <tr class=list align="center">
    <td colspan="6" bordercolor="#6666FF"><div align="left">楼盘基本信息：</div></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">建设单位：</td>
    <td bordercolor="#6666FF">
      云帆公司</td>
    <td bordercolor="#6666FF">项目名称：</td>
    <td bordercolor="#6666FF">空中花园</td>
    <td bordercolor="#6666FF">土地用途：</td>
    <td align="center" valign="middle" bordercolor="#6666FF">住宅</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">土地权属：</td>
    <td bordercolor="#6666FF">国有</td>
    <td bordercolor="#6666FF">房屋性质：</td>
    <td bordercolor="#6666FF">经济适用房</td>
    <td bordercolor="#6666FF">设计用途：</td>
    <td align="center" valign="middle" bordercolor="#6666FF">住宅</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td width="100" bordercolor="#6666FF">区：</td>
    <td width="145" bordercolor="#6666FF">新城区</td>
    <td width="100" bordercolor="#6666FF">建筑区划：</td>
    <td width="145" bordercolor="#6666FF">皇城路</td>
    <td width="100" bordercolor="#6666FF">丘地号：</td>
    <td bordercolor="#6666FF">-</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">土地证号：</td>
    <td bordercolor="#6666FF">2233</td>
    <td bordercolor="#6666FF">房屋结构：</td>
    <td bordercolor="#6666FF">砖混</td>
    <td bordercolor="#6666FF">取得方式：</td>
    <td bordercolor="#6666FF">拍卖</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">房屋坐落：</td>
    <td colspan="3" bordercolor="#6666FF">西安市新城区皇城东路6号</td>
    <td bordercolor="#6666FF">分户图：</td>
    <td bordercolor="#6666FF">-</td>
  </tr>
  
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF">&nbsp;</td>
  </tr>
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF"><div align="left">楼栋信息：</div></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF"><div align="center">楼栋名称</div></td>
    <td bordercolor="#6666FF"><div align="center">幢编号</div></td>
    <td bordercolor="#6666FF"><div align="center">总层数</div></td>
    <td bordercolor="#6666FF"><div align="center">分户房屋（套）</div></td>
    <td bordercolor="#6666FF"><div align="center">幢总面积（平方）</div></td>
    <td bordercolor="#6666FF"><div align="center">备注</div></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_info.submit();">
    <td bordercolor="#6666FF">一号楼</td>
    <td bordercolor="#6666FF">1234</td>
    <td bordercolor="#6666FF">8</td>
    <td bordercolor="#6666FF">48</td>
    <td bordercolor="#6666FF">3000</td>
    <td bordercolor="#6666FF">普通公寓</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_info.submit();">
    <td bordercolor="#6666FF">二号楼</td>
    <td bordercolor="#6666FF">8888</td>
    <td bordercolor="#6666FF">8</td>
    <td bordercolor="#6666FF">64</td>
    <td bordercolor="#6666FF">3600</td>
    <td bordercolor="#6666FF">精装公寓</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_info.submit();">
    <td bordercolor="#6666FF">三号楼</td>
    <td bordercolor="#6666FF">8888</td>
    <td bordercolor="#6666FF">8</td>
    <td bordercolor="#6666FF">64</td>
    <td bordercolor="#6666FF">3600</td>
    <td bordercolor="#6666FF">精装公寓</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_info.submit();">
    <td bordercolor="#6666FF">四号楼</td>
    <td bordercolor="#6666FF">8888</td>
    <td bordercolor="#6666FF">8</td>
    <td bordercolor="#6666FF">64</td>
    <td bordercolor="#6666FF">3600</td>
    <td bordercolor="#6666FF">精装公寓</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_info.submit();">
    <td bordercolor="#6666FF">五号楼</td>
    <td bordercolor="#6666FF">8888</td>
    <td bordercolor="#6666FF">8</td>
    <td bordercolor="#6666FF">64</td>
    <td bordercolor="#6666FF">3600</td>
    <td bordercolor="#6666FF">精装公寓</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_info.submit();">
    <td bordercolor="#6666FF">六号楼</td>
    <td bordercolor="#6666FF">8888</td>
    <td bordercolor="#6666FF">8</td>
    <td bordercolor="#6666FF">64</td>
    <td bordercolor="#6666FF">3600</td>
    <td bordercolor="#6666FF">精装公寓</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_info.submit();">
    <td bordercolor="#6666FF">综合楼</td>
    <td bordercolor="#6666FF">8888</td>
    <td bordercolor="#6666FF">8</td>
    <td bordercolor="#6666FF">64</td>
    <td bordercolor="#6666FF">3600</td>
    <td bordercolor="#6666FF">办公</td>
  </tr>
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF">&nbsp;</td>
  </tr>
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF"><div align="center"></div>
      <div align="left"></div></td>
  </tr>
</table>
</form>
</body>
</html>