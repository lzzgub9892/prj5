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
uname<INPUT TYPE="text" NAME="uname">action<INPUT TYPE="text" NAME="">
<input type="button" @click="get()" value="Query">
<TABLE border="1" width="100%">
<TR>
	<TD>网签id</TD>
	<TD>网签编号</TD>
	<TD>网签时间</TD>
</TR>
<TR  v-for="n in json.list" @click="examine(n.netid)">
	<TD>{{n.netid}}</TD>
	<TD>{{n.netnumber}}</TD>
	<TD>{{n.nettime}}</TD>
</TR>
</TABLE>
<TABLE border="1" width="100%">
<TR>
	<TD><button @click="first()">First</button></TD>
	<TD><button @click="next()">Next</button></TD>
	<TD><button @click="before()">Before</button></TD>
	<TD><button @click="end()">End</button></TD>
	<TD>
	第<INPUT TYPE="text" NAME="pageNow" id="pageNow" v-model="pageNow" size="1">页
	一页<INPUT TYPE="text" NAME="limit" v-model="limit" size="1">条  {{json.page.pageNow}}/{{json.page.pageCount}} 总共{{json.page.count}}条记录</TD>
	<TD><input type="button" @click="get()" value="go"></TD>
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
	            limit:10
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
	                		limit:this.limit
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
	            	window.location.href ="<%=basePath%>admin/netsign/examine.jsp?netid=1";
		        }
	            
	        }
	    });
	}
	
	
</script>
    
