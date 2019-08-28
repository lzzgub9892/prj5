<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>
</head>
<body>
<div id="app">
	<table width="738" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
  <tr class=list align="center">
    <td colspan="5" bordercolor="#6666FF"><div align="left">售房人基本信息：</div></td>
    <td rowspan="4" align="center" valign="middle" bordercolor="#6666FF"></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">售房人：</td>
    <td bordercolor="#6666FF">
    {{seller.clientname}}
      </td>
    <td bordercolor="#6666FF">户籍地址：</td>
    <td colspan="2" bordercolor="#6666FF">{{seller.address}}</td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">联系电话：</td>
    <td bordercolor="#6666FF">{{seller.phone}}</td>
    <td bordercolor="#6666FF">证件号码：</td>
    <td colspan="2" bordercolor="#6666FF">{{seller.idcard}}</td>
    </tr>
   <tr class=list align="center">
    <td colspan="5" bordercolor="#6666FF"><div align="left">购房人基本信息：</div></td>
    <td rowspan="4" align="center" valign="middle" bordercolor="#6666FF"></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">购房人：</td>
    <td bordercolor="#6666FF">
    {{buyer.clientname}}
      </td>
    <td bordercolor="#6666FF">户籍地址：</td>
    <td colspan="2" bordercolor="#6666FF">{{buyer.address}}</td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">联系电话：</td>
    <td bordercolor="#6666FF">{{buyer.phone}}</td>
    <td bordercolor="#6666FF">证件号码：</td>
    <td colspan="2" bordercolor="#6666FF">{{buyer.idcard}}</td>
    </tr>
  
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF">&nbsp;</td>
  </tr>
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF"><div align="left">房产基本信息：</div></td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td width="100" bordercolor="#6666FF">区：</td>
    <td width="145" bordercolor="#6666FF">{{house.zone.zname}}</td>
    <td width="100" bordercolor="#6666FF">建筑区划：</td>
    <td width="145" bordercolor="#6666FF">{{house.buildingarea.bname}}</td>
    <td width="100" bordercolor="#6666FF">丘地号：</td>
    <td bordercolor="#6666FF">-</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">房屋性质：</td>
    <td bordercolor="#6666FF">{{house.roomtype.rname }}</td>
    <td bordercolor="#6666FF">取得方式：</td>
    <td bordercolor="#6666FF">{{house.gainingmethod.gname }}</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td bordercolor="#6666FF">房屋坐落：</td>
    <td colspan="3" bordercolor="#6666FF">{{house.location }}</td>
    <td bordercolor="#6666FF">分户图：</td>
    <td bordercolor="#6666FF">-</td>
  </tr>
  
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF">&nbsp;</td>
  </tr>
 
  <tr align="center" class=list>
    <td colspan="6" bordercolor="#6666FF">&nbsp;</td>
  </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="6" align="center" bordercolor="#6666FF">
      <input name="dengjibu" type="button" value="通过" @click="examine()">      &nbsp;
      <input type="button" name="Submit" value="取消" @click="cancel()"></td>
    </tr>
  <tr class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this)>
    <td colspan="6" align="center" bordercolor="#6666FF">&nbsp;</td>
  </tr>
</table>
	
</div>
</body>
</html>
<script>
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
	            json:'',
	            netsign:'',
	            buyer:'',
	            seller:'',
	            room:'',
	            building:'',
	            house:''
	        },
	        mounted:function(){
	        	this.get();
	        },
	        methods:{
	            get:function(){
	            	this.$http({
	                	method:'post',
	                	url:'examineInput',
	                	emulateJSON:true, 
	                	params:{
	                		netid:theRequest.netid
	                	},	
	                }).then(function(res){
	                	 this.json=res.body;
	                	 this.netsign=this.json.netsign;
	                	 this.buyer=this.netsign.buyerClient;
	                	 this.seller=this.netsign.sellerClient;
	                	 this.room=this.netsign.room;
	                	 this.building=this.room.building;
	                	 this.house=this.building.house;
	                },function(){
	                    console.log('请求失败处理');
	                });
	            },
	            examine:function(){
	            	this.$http({
	                	method:'post',
	                	url:'examine',
	                	emulateJSON:true, 
	                	params:{
	                		netid:this.netsign.netid
	                	},	
	                }).then(function(res){
	                	if(res.body.message==null||res.body.message==""){
	    					alert("登记成功");
	    					window.location.href ="<%=basePath%>admin/netsign/list.jsp";
	    				  }else{      
	    			        alert(res.body.message);
	    				  } 
	                
	                	 
	                	 
	                },function(){
	                    console.log('请求失败处理');
	                });
		        },
		        cancel:function(){
		        	window.location.href ="<%=basePath%>admin/netsign/list.jsp";

		        }
	            
	        }
	    });
	}
	
	
</script>
    
