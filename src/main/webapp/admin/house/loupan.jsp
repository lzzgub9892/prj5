<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
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
<div id="app">
<form action="<%=basePath%>admin/house/fenhu.jsp" method="post" name="form_info" >
<table width="100%" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
  <tr class=list align="center">
    <td colspan="6" bordercolor="#6666FF"><div align="left">楼盘基本信息：</div></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">建设单位：</td>
    <td bordercolor="#6666FF">
      {{house.company.cname}}</td>
    <td bordercolor="#6666FF">项目名称：</td>
    <td bordercolor="#6666FF">{{house.hname}}</td>
    <td bordercolor="#6666FF">土地用途：</td>
    <td align="center" valign="middle" bordercolor="#6666FF">{{house.landuse.lname}}</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">土地权属：</td>
    <td bordercolor="#6666FF">{{house.landownership.oname}}</td>
    <td bordercolor="#6666FF">房屋性质：</td>
    <td bordercolor="#6666FF">{{house.roomtype.rname}}</td>
    <td bordercolor="#6666FF">设计用途：</td>
    <td align="center" valign="middle" bordercolor="#6666FF">{{house.designpurposes.dname}}</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td width="100" bordercolor="#6666FF">区：</td>
    <td width="145" bordercolor="#6666FF">{{house.zone.zname}}</td>
    <td width="100" bordercolor="#6666FF">建筑区划：</td>
    <td width="145" bordercolor="#6666FF">{{house.buildingarea.bname}}</td>
    <td width="100" bordercolor="#6666FF">丘地号：</td>
    <td bordercolor="#6666FF">---</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">土地证号：</td>
    <td bordercolor="#6666FF">{{house.landnumber.lnname}}</td>
    <td bordercolor="#6666FF">房屋结构：</td>
    <td bordercolor="#6666FF">{{house.buildingstructure.bsname}}</td>
    <td bordercolor="#6666FF">取得方式：</td>
    <td bordercolor="#6666FF">{{house.gainingmethod.gname}}</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">房屋坐落：</td>
    <td colspan="3" bordercolor="#6666FF">{{house.location}}</td>
    <td bordercolor="#6666FF">分户图：</td>
    <td bordercolor="#6666FF">---</td>
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
  <tr v-for="b in building" class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) onClick="document.form_info.submit();">
    <td bordercolor="#6666FF">{{b.buildingname}}</td>
    <td bordercolor="#6666FF">{{b.buildingnumber}}</td>
    <td bordercolor="#6666FF">{{b.floor}}</td>
    <td bordercolor="#6666FF">{{b.count}}</td>
    <td bordercolor="#6666FF">{{b.totalarea}}</td>
    <td bordercolor="#6666FF">{{b.descripe}}</td>
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
</div>
</body>
<script language=JavaScript src="js/comm.js"></script>
<script type="text/javascript">
window.onload = function(){
	var url = location.search; //获取url中"?"符后的字串
    var theRequest = new Object();
    if (url.indexOf("?") != -1) {
        var str = url.substr(1);
        strs = str.split("&");
        for(var i = 0; i < strs.length; i ++) {
            theRequest[strs[i].split("=")[0]]=unescape(strs[i].split("=")[1]);
        }
    }
    var vm = new Vue({
        el:'#app',
        data:{
            map:'',
            house:'',
            building:''
        },
        mounted:function(){
        	this.get();
        },
        methods:{
            get:function(){
            	this.$http({
                	method:'post',
                	url:'findbuilding',
                	emulateJSON:true, 
                	params:{
                		hid:theRequest.hid
                	},	
                }).then(function(res){
                	 this.map=res.body;
                	 this.house=this.map.house;
                	 this.building=this.map.building;
                },function(){
                    console.log('请求失败处理');
                });
                }
	        }
	    });
	}
</script>
</html>