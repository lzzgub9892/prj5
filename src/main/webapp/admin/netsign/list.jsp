<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
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
<div id="app">
起始日期<INPUT TYPE="date" v-model="startDate" NAME="startDate">终止日期<INPUT TYPE="date" v-model="endDate" NAME="endDate">
<input type="button" @click="get()" value="查询">
<TABLE class="table table-striped table-hover">
<thead>
<TR>
	<th>网签id</th>
	<th>网签编号</th>
	<th>网签时间</th>
</TR>
</thead>
<TR style="cursor:pointer "  v-for="n in json.list" @click="examine(n.netid)">
	<TD>{{n.netid}}</TD>
	<TD>{{n.netnumber}}</TD>
	<TD>
	{{n.nettime}}</TD>
</TR>
</TABLE>
<TABLE border="1" width="100%">
<TR>
	<TD><button type="button" class="btn btn-info" @click="first()">首页</button></TD>
	<TD><button type="button" class="btn btn-info" @click="before()">上一页</button></TD>
	<TD><button type="button" class="btn btn-info" @click="next()">下一页</button></TD>
	<TD><button type="button" class="btn btn-info" @click="end()">末页</button></TD>
	<TD>
	第<INPUT TYPE="text" NAME="pageNow" id="pageNow" v-model="pageNow" size="1">页
	一页<INPUT TYPE="text" NAME="limit" v-model="limit" size="1">条  {{json.page.pageNow}}/{{json.page.pageCount}} 总共{{json.page.count}}条记录</TD>
	<TD><button type="button" class="btn btn-primary" @click="get()">go</button></TD>
</TR>
</TABLE>
</div>
</body>
</html>
<script>
	window.onload = function(){
	    var vm = new Vue({
	        el:'#app',
	        data:{
	            json:'',
	            pageNow:1,
	            limit:5,
	            startDate:'',
	            endDate:''
	        },
	        mounted:function(){
	        	this.get();
	        },
	        methods:{
	            get:function(){
	            	this.$http({
	                	method:'post',
	                	url:'findByPage',
	                	emulateJSON:true, 
	                	params:{
	                		pageNow:this.pageNow,
	                		limit:this.limit,
	                		startDate:this.startDate,
	                		endDate:this.endDate
	                	},	
	                }).then(function(res){
	                	 this.json=res.body;
	                },function(){
	                    console.log('请求失败处理');
	                });
	            },
	            first:function(){
	            	this.pageNow = 1;
	            	this.get();
	            },
	            next:function(){
		            if(this.pageNow<this.json.page.pageCount){
	            		this.pageNow = parseInt(this.pageNow)+1;
		            }	
	            	this.get();
	            },
	            before:function(){
            	 	if(this.pageNow>1){
	            		this.pageNow = parseInt(this.pageNow)-1;
            	 	}
	            	this.get();
	            },
	            end:function(){
	            	this.pageNow = this.json.page.pageCount;
	            	this.get();
	            },
	            examine:function(netid){
	            	window.location.href ="<%=basePath%>admin/netsign/examine.jsp?netid="+netid;
		        }
	            
	        }
	    });
	}
	
	
</script>
    
