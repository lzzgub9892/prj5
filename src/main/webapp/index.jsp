<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<script>
	var code="";
	$(document).ready(function(){
		function createCode(){
			var codelength=4;
			var random=new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
			for(var i=0;i<codelength;i++){
				var index=Math.floor(Math.random()*62);
				code+=random[index];
			}
			$("#code").html(code);
		};
		createCode();
		$("#code").click(function(){
			code="";
			createCode();
		});

		function validate(){
			var inputcode=$("#inputcode").val().toUpperCase();
			var flag=false;
			if(inputcode.length<=0){
				$("#sp").text("请输入验证码");
			}else if(inputcode!=code.toUpperCase()){
				code="";
				createCode();
				$("#sp").text("验证码输入错误");
			}else{
				$("#sp").text("");
				flag=true;
			}
			return flag;
		};

		$("#inputcode").blur(function(){
			validate();
		});

		$("#loginbtn").click(function(){
			if($("#username").val()==null||$("#username").val()==""){
				$("#s1").text("账号不能为空");
			}else if($("#password").val()==null||$("#password").val()==""){
				$("#s2").text("密码不能为空");
			}else if($("#inputcode").val()==null||$("#inputcode").val()==""){
				$("#sp").text("请输入验证码");
			}else{
				if(validate()){
					$("#login").submit();
				}
			}
		});
	});
</script>
</head>
	<body>
	
		<form class="form" id="login" name="login" method="post" action="login">
			<table width="580" align="center" cellpadding="0" cellspacing="0">
			  <tr>
			    <td height="48" colspan="2" align="center">&nbsp;高陵县房管所 房屋产权产籍信息管理系统</td>
			  </tr>
			  <tr>
			    <td height="40" colspan="2" align="right">&nbsp;</td>
			  </tr>
			  <tr>
			    <td width="235" height="55" align="center">用户：</td>
			    <td width="343">
			        <input name="uname" type="text" id="username" placeholder="请输入账号" /><span style="color:red" id="s1"></span>    
			    </td>
			  </tr>
			  <tr>
			    <td height="55" align="center">密码：</td>
			    <td>
			        <input name="upass" type="password" id="password" placeholder="请输入密码" /><span style="color:red" id="s2"></span>    
			    </td>
			  </tr>
			  <tr>
			    <td height="55" align="center">
			      <div id="code" style="border:1px solid red;width:60px" onclick="createCode()"></div>
			    </td>
			    <td>
			   	  <input type="text" name="checkcode" id="inputcode" class="col-md-6 text verification" placeholder="请输入验证码" maxlength="5"><span style="color:red" id="sp"></span>
			    </td>
			  </tr>
			  <tr>
			    <td height="55" colspan="2" align="center">
			      <input type="button" id="loginbtn" value="登陆" />&nbsp;&nbsp;&nbsp;
			      <input type="button" id="cancel" value="取消" />    </td>
			  </tr>
			  <tr>
			    <td height="20" colspan="2" align="center">西安江凌网络科技有限公司</td>
			  </tr>
			</table>
		</form>
	</body>
</html>
