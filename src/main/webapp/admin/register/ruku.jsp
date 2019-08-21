<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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
</head>
<body>
<form action="save" method="post">
<table width="738" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
  <tr class=list align="center">
    <td colspan="5" bordercolor="#6666FF"><div align="left">申请人基本信息：</div></td>
    <td rowspan="4" align="center" valign="middle" bordercolor="#6666FF"><img src="images/矢量徽标(效果C)100_100.jpg" width="100" height="100"></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">申请人：</td>
    <td bordercolor="#6666FF">
      <input name="proposer" type="text" size="15"></td>
    <td bordercolor="#6666FF">户籍地址：</td>
    <td colspan="2" bordercolor="#6666FF"><input name="domicileaddress" type="text" size="32"></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">联系电话：</td>
    <td bordercolor="#6666FF"><input name="proptel" type="text" size="15"></td>
    <td bordercolor="#6666FF">证件号码：</td>
    <td colspan="2" bordercolor="#6666FF"><input name="propidcard" type="text" size="18"></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">代理人：</td>
    <td bordercolor="#6666FF"><input name="agent" type="text" size="15"></td>
    <td bordercolor="#6666FF">证件号码：</td>
    <td colspan="2" bordercolor="#6666FF"><input name="agentidcard" type="text" size="18"></td>
  </tr>
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF">&nbsp;</td>
  </tr>
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF"><div align="left">房产基本信息：</div></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td width="100" bordercolor="#6666FF">区：</td>
    <td width="145" bordercolor="#6666FF"><input name="zone" type="text" size="15"></td>
    <td width="100" bordercolor="#6666FF">建筑区划：</td>
    <td width="145" bordercolor="#6666FF"><input name="buildingarea" type="text" size="15"></td>
    <td width="100" bordercolor="#6666FF">丘地号：</td>
    <td bordercolor="#6666FF"><input name="textfield3" type="text" size="12"></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">登记种类：</td>
    <td bordercolor="#6666FF"><input name="registrationtypes" type="text" size="15"></td>
    <td bordercolor="#6666FF">房屋性质：</td>
    <td bordercolor="#6666FF"><input name="roomtype" type="text" size="15"></td>
    <td bordercolor="#6666FF">取得方式：</td>
    <td bordercolor="#6666FF"><input name="gainingmethod" type="text" size="12"></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">房屋坐落：</td>
    <td colspan="3" bordercolor="#6666FF"><input name="roomaddress" type="text" size="40"></td>
    <td bordercolor="#6666FF">分户图：</td>
    <td bordercolor="#6666FF"><input name="textfield8" type="text" size="12"></td>
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
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF"><input name="sharename" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="shareidcard" type="text" size="18"></td>
    <td bordercolor="#6666FF"><input name="shareaddresss" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="sharetype" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="share" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="sharetel" type="text" size="12"></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF"><input name="textfield422" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield42" type="text" size="18"></td>
    <td bordercolor="#6666FF"><input name="textfield423" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield43" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield424" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield432" type="text" size="12"></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF"><input name="textfield422" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield42" type="text" size="18"></td>
    <td bordercolor="#6666FF"><input name="textfield423" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield43" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield424" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield432" type="text" size="12"></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF"><input name="textfield422" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield42" type="text" size="18"></td>
    <td bordercolor="#6666FF"><input name="textfield423" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield43" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield424" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield432" type="text" size="12"></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF"><input name="textfield422" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield42" type="text" size="18"></td>
    <td bordercolor="#6666FF"><input name="textfield423" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield43" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield424" type="text" size="12"></td>
    <td bordercolor="#6666FF"><input name="textfield432" type="text" size="12"></td>
  </tr>
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF">&nbsp;</td>
  </tr>
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF"><div align="left">交验证件：</div></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="2" bordercolor="#6666FF"><span class="STYLE2">登记申请书一份：</span></td>
    <td colspan="4" bordercolor="#6666FF"><label>
      <input name="application" type="file" size="40">
      <input name="scan" type="button" id="scan" value="扫描/拍照">
    </label></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="2" bordercolor="#6666FF"><span class="STYLE2">伍学名身份证复印件一份：</span></td>
    <td colspan="4" bordercolor="#6666FF"><input name="idcopy" type="file" size="40">
      <input name="scan2" type="button" id="scan2" value="扫描/拍照"></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="2" bordercolor="#6666FF"><span class="STYLE2">伍学名一寸照片一张：</span></td>
    <td colspan="4" bordercolor="#6666FF"><input name="photo" type="file" size="40">
      <input name="scan3" type="button" id="scan3" value="扫描/拍照"></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="2" bordercolor="#6666FF"><span class="STYLE2">购房发票复印件一份：</span></td>
    <td colspan="4" bordercolor="#6666FF"><input name="purchasecopy" type="file" size="40">
      <input name="scan4" type="button" id="scan4" value="扫描/拍照"></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="2" bordercolor="#6666FF"><span class="STYLE2">购房合同复印件（已备案）一份：</span></td>
    <td colspan="4" bordercolor="#6666FF"><input name="contractcopy" type="file" size="40">
      <input name="scan5" type="button" id="scan5" value="扫描/拍照"></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="2" bordercolor="#6666FF"><span class="STYLE2">契税完税证复印件一份：</span></td>
    <td colspan="4" bordercolor="#6666FF"><input name="taxcopy" type="file" size="40">
      <input name="scan6" type="button" id="scan6" value="扫描/拍照"></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="6" bordercolor="#6666FF">&nbsp;</td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="6" align="center" bordercolor="#6666FF">
      <input type="submit" name="Submit" value="提交审核">
      &nbsp;&nbsp;
      <input type="reset" name="Submit2" value="全部清空"></td>
    </tr>
</table>
</form>
</body>
</html>