<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
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

  <div class="input-group mb-3">
  <input type="text" name="inputnetnumber" v-model="inputnetnumber" class="form-control">
  <div class="input-group-append">
    <button class="btn btn-success" @click="query()" type="submit">查询</button> 
  </div>
  {{json.message}}
</div>
<table class="table table-striped">
    <thead>
      <tr>
        <th>网签编号</th>
        <th>网签状态</th>
      </tr>
    </thead>
    <tbody style="cursor:pointer ">
      <tr @click="examine(json.netsign.netid)">
        <td>{{netnumber}}</td>
		<td>{{netstatus}}</td>
      </tr>
    </tbody>
</table>
</div>
</body>
</html>
<script>
	window.onload = function(){
	    var vm = new Vue({
	        el:'#app',
	        data:{
	            json:'',
	            inputnetnumber:'',
	            netstatus:'',
	            netnumber:''
	        },
	        methods:{
	            query:function(){
	            	this.$http({
	                	method:'post',
	                	url:'query',
	                	emulateJSON:true, 
	                	params:{
	                		netnumber:this.inputnetnumber
	                	},	
	                }).then(function(res){
	                	 this.json=res.body;
	                	 if(this.json.netsign!=null&&this.json.netsign!=""){
		                	 this.netnumber=this.json.netsign.netnumber;
		                	 if(this.json.netstatus){
			                	 this.netstatus="已通过";
			               	 }else{
			               		this.netstatus="未通过";
				             }
	                	 }
	                },function(){
	                    console.log('请求失败处理');
	                });
	            },
	            examine:function(netid){
	            	window.location.href ="<%=basePath%>admin/netsign/onelist.jsp?netid="+netid;

		        }
	            
	        }
	    });
	}
	
	
</script>
    
