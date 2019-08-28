<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<link rel="stylesheet" href="css/style_1.css">
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script
	src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<link
	href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style type="text/css">
<!--

-->
</style>
</head>
<body>
	<div id="app">
		<form class="container" name="form" method="post" action="fenhu.htm">
			<table width="300" border="0" align="center" cellpadding="0"
				cellspacing="0">

					<tr  v-for="house in json" >
						<label>请选择备案合同楼盘：</label>
						<select class="form-control" id="sel" @change="filea($event.target.selectedIndex)">
							<option v-for="house in json" style="width: 100px"
							value="house.hid" >{{house.hname}}</span></option>
						</select>
					</tr>
					<tr>
						<label>请选择楼栋</label>
						<select class="form-control">
							<option v-for="build in building" style="width: 100px">{{build.buildingname}}</option>
						</select>
					</tr>
				<tr>
					<td height="28" colspan="2"><div align="center">
							<input type="submit" name="Submit" value="下一步">
						</div></td>
				</tr>
			</table>
		</form>
	</div>
</body>
<script language=JavaScript src="<%=basePath%>js/comm.js"></script>
<script type="text/javascript">
var html = $.ajax({
	  async: false
	 }).responseText;
window.onload = function(){
    var vm = new Vue({
        el:'#app',
        data:{
            json:'',
            building:''    
        },
        created:function(){
        	this.get();
        },
        methods:{
            get:function(){
            	this.$http({
                	method:'post',
                	url:'<%=basePath%>admin/house/findall',
                	emulateJSON:true, 
                	params:{
                		
                	},	
                }).then(function(res){
                	 this.json=res.body;
                },function(){
                    console.log('请求失败处理');
                });
                },
                filea:function(obj){
                	var hid=this.json[obj].hid;
                	this.$http({
                    	method:'post',
                    	url:'<%=basePath%>admin/house/findbuilding',
                    	emulateJSON:true, 
                    	params:{
                    		hid:hid
                    	},	
                    }).then(function(res){
                    	 this.map=res.body;
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