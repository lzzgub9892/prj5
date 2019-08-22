<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/main.css">
<script language=JavaScript src="js/comm.js"></script>
<script language=JavaScript>
 function showDengJiBu(page){
 	var pages = dengjibu.rows;
 	for(i=0;i<pages.length;i++){
		pages[i].style.display="none";
	}
	pages[page-1].style.display="";
 }
</script>
<style type="text/css">
<!--
body {
	background-image: url(images/bg.gif);
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.title {color: #000099}
-->
</style>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"></head>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="25" nowrap onClick=showDengJiBu(1) onMouseOver=mouseovertr(this) onMouseOut=mouseouttr(this)>登记簿&nbsp;</td>
    <td nowrap onClick=showDengJiBu(2) onMouseOver=mouseovertr(this) onMouseOut=mouseouttr(this)>基本状况&nbsp;</td>
    <td nowrap onClick=showDengJiBu(3) onMouseOver=mouseovertr(this) onMouseOut=mouseouttr(this)>共有部分&nbsp;</td>
    <td nowrap onClick=showDengJiBu(4) onMouseOver=mouseovertr(this) onMouseOut=mouseouttr(this)>所有权&nbsp;</td>
    <td nowrap onClick=showDengJiBu(5) onMouseOver=mouseovertr(this) onMouseOut=mouseouttr(this)>他项权（现房抵押）&nbsp;</td>
    <td nowrap onClick=showDengJiBu(6) onMouseOver=mouseovertr(this) onMouseOut=mouseouttr(this)>他项权（在建抵押）&nbsp;</td>
    <td nowrap onClick=showDengJiBu(7) onMouseOver=mouseovertr(this) onMouseOut=mouseouttr(this)>其他（预告登记）&nbsp;</td>
    <td nowrap onClick=showDengJiBu(8) onMouseOver=mouseovertr(this) onMouseOut=mouseouttr(this)>其他（查封登记）&nbsp;</td>
    <td nowrap onClick=showDengJiBu(9) onMouseOver=mouseovertr(this) onMouseOut=mouseouttr(this)>其他（异议登记）&nbsp;</td>
    <td nowrap>&nbsp;</td>
  </tr>
</table>
<table id="dengjibu" width="100%" border="0" cellpadding="0" cellspacing="0">

  <tr>
    <td colspan="10"><table width="738" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
      <tr align="center" class=list>
        <td height="25" colspan="2" bordercolor="#6666FF"><div align="center" class="title">登记簿&nbsp;封面</div></td>
      </tr>
      <tr align="center" class=list>
        <td width="245" bordercolor="#6666FF">丘　　　　　号:</td>
        <td width="393" bordercolor="#6666FF">234-545-2</td>
      </tr>
      <tr align="center" class=list>
        <td bordercolor="#6666FF">房屋登记簿编号：</td>
        <td bordercolor="#6666FF">${room.roomid }</td>
      </tr>
      <tr align="center" class=list>
        <td colspan="2" bordercolor="#6666FF">本号共 1 本 第 1 本 </td>
        </tr>
      <tr align="center" class=list>
        <td colspan="2" bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr align="center" class=list>
        <td colspan="2" bordercolor="#6666FF">陕西 省（自治区、直辖市） 西安 市 高陵 区（县、市）</td>
      </tr>
      <tr align="center" class=list>
        <td colspan="2" bordercolor="#6666FF">皇城东路 街（路） 6 号</td>
      </tr>
      <tr align="center" class=list>
        <td colspan="2" bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr align="center" class=list>
        <td colspan="2" bordercolor="#6666FF">登记机构：高陵县房管所</td>
      </tr>
    </table></td>
  </tr>
  <tr style="display:none">
    <td colspan="10"><table width="738" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
      <tr align="center" class=list>
        <td height="25" colspan="6" bordercolor="#6666FF"><div align="center" class="title">房屋登记簿&nbsp;基本状况</div></td>
      </tr>
      <tr align="center" class=list>
        <td colspan="6" bordercolor="#6666FF"><div align="left">房屋编号：${room.roomid }</div></td>
      </tr>
      <tr class=toplist>
        <td width="100" bordercolor="#6666FF">房屋坐落：</td>
        <td colspan="5" bordercolor="#6666FF">${room.building.house.zone.zname } ${room.building.house.hname } ${room.building.buildingname} ${room.roomnumber}</td>
        </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">地号：</td>
        <td width="145" bordercolor="#6666FF">${room.building.house.landnumber.lnname }</td>
        <td width="100" bordercolor="#6666FF">业务宗号：</td>
        <td width="145" bordercolor="#6666FF">&nbsp;</td>
        <td width="100" bordercolor="#6666FF">建筑物总层数：</td>
        <td bordercolor="#6666FF">${room.building.floor }</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">土地权属：</td>
        <td bordercolor="#6666FF">${room.building.house.landownership.oname }</td>
        <td bordercolor="#6666FF">建筑面积：</td>
        <td bordercolor="#6666FF">${room.building.totalarea }</td>
        <td bordercolor="#6666FF">规划用途：</td>
        <td bordercolor="#6666FF">${room.building.house.designpurposes.dname }</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">土地取得方式：</td>
        <td bordercolor="#6666FF">${room.building.house.gainingmethod.gname }</td>
        <td bordercolor="#6666FF">套内建筑面积：</td>
        <td bordercolor="#6666FF">120平米</td>
        <td bordercolor="#6666FF">房屋结构：</td>
        <td bordercolor="#6666FF">${room.building.house.buildingstructure.bsname }</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">土地使用年限：</td>
        <td bordercolor="#6666FF">70</td>
        <td bordercolor="#6666FF">共有建筑：</td>
        <td bordercolor="#6666FF">${room.building.house.publicbuildingss }</td>
        <td bordercolor="#6666FF">登记时间：</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">土地证号：</td>
        <td bordercolor="#6666FF">${room.building.house.landnumber.lnname }</td>
        <td bordercolor="#6666FF">专有部分面积：</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">终审人/登簿人：</td>
        <td bordercolor="#6666FF">业务专员/业务专员</td>
      </tr>

      <tr height="65" align="center" class=list>
        <td height="35" colspan="6" valign="top" bordercolor="#6666FF" class="toplist_text">附记</td>
      </tr>
      <tr class=toplist>
        <td colspan="6" align="center" bordercolor="#6666FF"><div align="left">房地产平面图：</div></td>
      </tr>
    </table></td>
  </tr>
  <tr style="display:none">
    <td colspan="10"><table width="738" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">

      <tr class=list>
        <td height="25" colspan="6" bordercolor="#6666FF"><div align="center" class="title">房屋登记簿&nbsp;建筑物区分所有业主共有部分</div></td>
        </tr>
      <tr class=list>
        <td colspan="2"width="245" bordercolor="#6666FF">建筑物区分所有业主共有部分权利人</td>
        <td colspan="4" bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=list>
        <td width="100" bordercolor="#6666FF"><div align="center">业务宗号</div></td>
        <td width="145" bordercolor="#6666FF"><div align="center">建筑编号</div></td>
        <td width="100" bordercolor="#6666FF"><div align="center">建筑物名称</div></td>
        <td width="145" bordercolor="#6666FF"><div align="center">登记时间</div></td>
        <td width="100" bordercolor="#6666FF"><div align="center">终审人/登簿人</div></td>
        <td bordercolor="#6666FF"><div align="center">附记</div></td>
      </tr>
      <c:forEach items="${room.building.house.publicbuildingss }" var="publicbuildings">
      <tr class=toplist>
        <td bordercolor="#6666FF">${room.ownerships[0].servicenumber }</td>
        <td bordercolor="#6666FF">${publicbuildings.pbid }</td>
        <td bordercolor="#6666FF">${publicbuildings.pbname }</td>
        <td bordercolor="#6666FF">2019/9/9</td>
        <td bordercolor="#6666FF"><div align="center">${room.ownerships[0].userinfo.uname }</div></td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      </c:forEach>

    </table></td>
  </tr>
  <tr style="display:none">
    <td colspan="10"><table width="738" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
      <tr align="center" class=list>
        <td height="25" colspan="5" bordercolor="#6666FF"><div align="center" class="title">房屋登记簿&nbsp;所有权权部分</div></td>
      </tr>
      <tr align="center" class=list>
        <td colspan="5" bordercolor="#6666FF"><div align="left">房屋编号：${room.roomid }</div></td>
      </tr>

      <tr class=toplist>
        <td width="245" bordercolor="#6666FF"><div align="center">内容\序号 </div></td>
        <td width="245" bordercolor="#6666FF"><div align="center">01</div></td>
        <td bordercolor="#6666FF"><div align="center">02</div></td>
        </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">业务宗号</td>
        <td bordercolor="#6666FF">${room.ownerships[0].servicenumber }</td>
        <td bordercolor="#6666FF">${room.ownerships[1].servicenumber }</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">所有权人</td>
        <td bordercolor="#6666FF">${room.ownerships[0].client.clientname }</td>
        <td bordercolor="#6666FF">${room.ownerships[1].client.clientname }</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">身份证明号</td>
        <td bordercolor="#6666FF">${room.ownerships[0].client.idcard }</td>
        <td bordercolor="#6666FF">${room.ownerships[1].client.idcard }</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">户籍所在地</td>
        <td bordercolor="#6666FF">${room.ownerships[0].client.address }</td>
        <td bordercolor="#6666FF">${room.ownerships[1].client.address }</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">共有情况</td>
        <td bordercolor="#6666FF">${room.ownerships[0].client.serviceshares }</td>
        <td bordercolor="#6666FF">${room.ownerships[1].client.serviceshares }</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">房屋取得方式</td>
        <td bordercolor="#6666FF">${room.building.house.gainingmethod.gname }</td>
        <td bordercolor="#6666FF">${room.building.house.gainingmethod.gname }</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">房屋性质</td>
        <td bordercolor="#6666FF">${room.building.house.roomtype.rname }</td>
        <td bordercolor="#6666FF">${room.building.house.roomtype.rname }</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">所有权证号</td>
        <td bordercolor="#6666FF">${room.ownerships[0].servicenumber }</td>
        <td bordercolor="#6666FF">${room.ownerships[1].servicenumber }</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">登记时间</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">终审人/登簿人</td>
        <td bordercolor="#6666FF">${room.ownerships[0].userinfo.uname }</td>
        <td bordercolor="#6666FF">${room.ownerships[1].userinfo.uname }</td>
        </tr>

      <tr align="center" class=list>
        <td height="35" colspan="5" valign="top" bordercolor="#6666FF" class="toplist_text">附记：</td>
      </tr>
      <tr align="center" class=list>
        <td colspan="5" bordercolor="#6666FF" class="toplist">注：所有权补、换证情况，以及共有人情况在本附记栏中记载。</td>
      </tr>
      
    </table></td>
  </tr>
  <tr style="display:none">
    <td colspan="10"><table width="738" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
      <tr align="center" class=list>
        <td height="25" colspan="5" bordercolor="#6666FF"><div align="center" class="title">房屋登记簿&nbsp;他项权利部分（现房抵押）</div></td>
      </tr>
      <tr align="center" class=list>
        <td colspan="5" bordercolor="#6666FF"><div align="left">房屋编号：${room.roomid }</div></td>
      </tr>
      <tr class=toplist>
        <td width="245" bordercolor="#6666FF"><div align="center">内容\序号 </div></td>
        <td width="245" bordercolor="#6666FF"><div align="center">01</div></td>
        <td bordercolor="#6666FF"><div align="center">02</div></td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">业务宗号</td>
       		 <c:forEach items="${room.existmortgages }" var="existmortgage">
        		<td bordercolor="#6666FF">${existmortgage.service.servicenumber }</td>
       		</c:forEach>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">一般抵押</td>
         <c:forEach items="${room.existmortgages }" var="existmortgage">
        		<td bordercolor="#6666FF">${existmortgage.generalmortgage }</td>
       		</c:forEach>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">最高抵押</td>
         <c:forEach items="${room.existmortgages }" var="existmortgage">
        		<td bordercolor="#6666FF">${existmortgage.maxmortgage }</td>
       		</c:forEach>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">抵押权人</td>
        <c:forEach items="${room.existmortgages }" var="existmortgage">
        		<td bordercolor="#6666FF">${existmortgage.mortgagee }</td>
       		</c:forEach>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">抵押人</td>
       <c:forEach items="${room.existmortgages }" var="existmortgage">
        		<td bordercolor="#6666FF">${existmortgage.mortgager }</td>
       		</c:forEach>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">债务人</td>
         <c:forEach items="${room.existmortgages }" var="existmortgage">
        		<td bordercolor="#6666FF">${existmortgage.debtor }</td>
       		</c:forEach>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">最高债权数额</td>
        <c:forEach items="${room.existmortgages }" var="existmortgage">
        		<td bordercolor="#6666FF">${existmortgage.maxclaim }</td>
       		</c:forEach>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">担保范围</td>
         <c:forEach items="${room.existmortgages }" var="existmortgage">
        		<td bordercolor="#6666FF">${existmortgage.scope }</td>
       		</c:forEach>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">债务履行期限</td>
         <c:forEach items="${room.existmortgages }" var="existmortgage">
        		<td bordercolor="#6666FF">${existmortgage.returntime }</td>
       		</c:forEach>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">登记时间</td>
         <c:forEach items="${room.existmortgages }" var="existmortgage">
        		<td bordercolor="#6666FF">${existmortgage.registertime }</td>
       		</c:forEach>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">终审人</td>
         <c:forEach items="${room.existmortgages }" var="existmortgage">
        		<td bordercolor="#6666FF">${existmortgage.userinfo.uname }</td>
       		</c:forEach>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">附记</td>
         <c:forEach items="${room.existmortgages }" var="existmortgage">
        		<td bordercolor="#6666FF">${existmortgage.descript }</td>
       		</c:forEach>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">取消业务宗号</td>
         <c:forEach items="${room.existmortgages }" var="existmortgage">
        		<td bordercolor="#6666FF">${existmortgage.service.servicenumber }</td>
       		</c:forEach>
      </tr>
     
      <tr align="center" class=list>
        <td height="25" colspan="5" valign="top" bordercolor="#6666FF" class="toplist_text">附记：</td>
      </tr>
      <tr align="center" class=list>
        <td colspan="5" bordercolor="#6666FF" class="toplist">注：他项权补、换证情况，以及地役权登记在本附记栏中记载。</td>
      </tr>
    </table></td>
  </tr>
  <tr style="display:none">
    <td colspan="10"><table width="738" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
      <tr align="center" class=list>
        <td height="25" colspan="5" bordercolor="#6666FF"><div align="center" class="title">房屋登记簿&nbsp;他项权利部分（在建工程抵押）</div></td>
      </tr>
      <tr align="center" class=list>
        <td colspan="5" bordercolor="#6666FF"><div align="left">房屋编号：20081001</div></td>
      </tr>
      <tr class=toplist>
        <td width="245" bordercolor="#6666FF"><div align="center">内容\序号 </div></td>
        <td width="245" bordercolor="#6666FF"><div align="center">01</div></td>
        <td bordercolor="#6666FF"><div align="center">02</div></td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">业务宗号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">一般抵押/最高抵押</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">抵押权人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">抵押人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">在建工程坐落</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">被担保主债权数额（最高债权数额）</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">担保范围</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">债务履行期限（债权确定期间）</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">抵押登记证明号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">登记时间</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">终审人/登簿人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">业务宗号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">最高债权确定事实和数额</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">登记时间</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">终审人/登簿人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">抵押注销业务宗号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">登记时间</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">终审人/登簿人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr align="center" class=list>
        <td height="25" colspan="5" valign="top" bordercolor="#6666FF" class="toplist_text">附记：</td>
      </tr>

    </table></td>
  </tr>
  <tr style="display:none">
    <td colspan="10"><table width="738" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
      <tr align="center" class=list>
        <td height="25" colspan="5" bordercolor="#6666FF"><div align="center" class="title">房屋登记簿&nbsp;其他部分（预告登记）</div></td>
      </tr>
      <tr align="center" class=list>
        <td colspan="5" bordercolor="#6666FF"><div align="left">房屋编号：20081001</div></td>
      </tr>
      <tr class=toplist>
        <td width="245" bordercolor="#6666FF"><div align="center">内容\序号 </div></td>
        <td width="245" bordercolor="#6666FF"><div align="center">01</div></td>
        <td bordercolor="#6666FF"><div align="center">02</div></td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">业务宗号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">预告登记种类</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">权利人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">权利人身份证明号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">义务人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">义务人身份证明号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">预告登记证明号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>

      <tr class=toplist>
        <td bordercolor="#6666FF">登记时间</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">终审人/登簿人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>

      <tr class=toplist>
        <td bordercolor="#6666FF">预告注销业务宗号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">登记时间</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">终审人/登簿人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr align="center" class=list>
        <td height="35" colspan="5" valign="top" bordercolor="#6666FF" class="toplist_text">附记：</td>
      </tr>
    </table></td>
  </tr>
  <tr style="display:none">
    <td colspan="10"><table width="738" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
      <tr align="center" class=list>
        <td height="25" colspan="5" bordercolor="#6666FF"><div align="center" class="title">房屋登记簿&nbsp;其他部分（查封登记）</div></td>
      </tr>
      <tr align="center" class=list>
        <td colspan="5" bordercolor="#6666FF"><div align="left">房屋编号：20081001</div></td>
      </tr>
      <tr class=toplist>
        <td width="245" bordercolor="#6666FF"><div align="center">内容\序号 </div></td>
        <td width="245" bordercolor="#6666FF"><div align="center">01</div></td>
        <td bordercolor="#6666FF"><div align="center">02</div></td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">业务宗号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">查封机关</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">查封文件</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">查封文号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">查封时间</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">查封期限</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>

      <tr class=toplist>
        <td bordercolor="#6666FF">登记时间</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">终审人/登簿人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">查封注销业务宗号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">解除查封文件</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">解除查封文号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">解除查封时间</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">登记时间</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">终审人/登簿人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr align="center" class=list>
        <td height="35" colspan="5" valign="top" bordercolor="#6666FF" class="toplist_text">附记：</td>
      </tr>
    </table></td>
  </tr>
  <tr style="display:none">
    <td colspan="10"><table width="738" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
      <tr align="center" class=list>
        <td height="25" colspan="5" bordercolor="#6666FF"><div align="center" class="title">房屋登记簿&nbsp;其他部分（异议登记）</div></td>
      </tr>
      <tr align="center" class=list>
        <td colspan="5" bordercolor="#6666FF"><div align="left">房屋编号：20081001</div></td>
      </tr>
      <tr class=toplist>
        <td width="245" bordercolor="#6666FF"><div align="center">内容\序号 </div></td>
        <td width="245" bordercolor="#6666FF"><div align="center">01</div></td>
        <td bordercolor="#6666FF"><div align="center">02</div></td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">业务宗号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>

      <tr class=toplist>
        <td bordercolor="#6666FF">申请人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">异议事项</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>

      <tr class=toplist>
        <td bordercolor="#6666FF">登记时间</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">终审人/登簿人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">异议注销业务宗号</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">登记时间</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr class=toplist>
        <td bordercolor="#6666FF">终审人/登簿人</td>
        <td bordercolor="#6666FF">&nbsp;</td>
        <td bordercolor="#6666FF">&nbsp;</td>
      </tr>
      <tr align="center" class=list>
        <td height="30" colspan="5" valign="top" bordercolor="#6666FF" class="toplist_text">附记：</td>
      </tr>
    </table></td>
  </tr>
  <tr style="display:none">
    <td colspan="10">&nbsp;</td>
  </tr>
</table>
</body>
</html>