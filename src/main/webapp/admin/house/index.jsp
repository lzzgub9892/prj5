<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
}
.STYLE1 {color: #FFFFFF}
-->
</style>
</head>
<body>
<div id="app">
<form name="form_list" method="post" action="loupan.jsp">
<table width="100%" border="0" cellpadding="1" cellspacing="1" bgcolor="#749cdf">
  <tr class=list align="center">
    <td width="20%" bordercolor="#6666FF">楼盘名称</td>
    <td width="15%" align="center" bordercolor="#6666FF">楼盘信息</td>
    <td width="20%" align="center" bordercolor="#6666FF">预售许可证号</td>
    <td width="15%" align="center" bordercolor="#6666FF">楼盘状态</td>
  </tr>
  <tr v-for="l in json"  class=toplist onmouseover=mouseovertr(this) onmouseout=mouseouttr(this) @click="filea(l.hid)" onClick="document.form_list.submit();">
    <td width="20%" bordercolor="#6666FF">{{l.hname}}</td>
    <td width="15%" align="center" bordercolor="#6666FF">楼盘信息</td>
    <td width="20%" align="center" bordercolor="#6666FF">23333</td>
    <td width="15%" align="center" bordercolor="#6666FF">{{l.housestatus.housestatus}}</td>
  </tr>
</table>
</form>
</div>
</body>
<script language=JavaScript src="js/comm.js"></script>
<script type="text/javascript">
window.onload = function(){
    var vm = new Vue({
        el:'#app',
        data:{
            json:''
        },
        mounted:function(){
        	this.get();
        },
        methods:{
            get:function(){
            	this.$http({
                	method:'post',
                	url:'findall',
                	emulateJSON:true, 
                	params:{
                		
                	},	
                }).then(function(res){
                	 this.json=res.body;
                },function(){
                    console.log('请求失败处理');
                });
                },
                filea:function(id){
                    var hid=id;
                    $.ajax({
    					url: "findbuilding",
    					dataType: 'json',
    					type: 'post',
    					data:{
    						hid:hid
    					},
    					success:function(data){
    						console.log(data)
    					},
    					error:function(err){
    						console.log(err)
    					}
    				});
                    }
	        }
	    });
	}
</script>
</html>
