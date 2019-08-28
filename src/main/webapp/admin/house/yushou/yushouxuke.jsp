<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<link rel="stylesheet" href="css/style_1.css">
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style type="text/css">
<!--
body {
	background-image: url(images/bg.gif);
}
-->
</style>
<script type="text/javascript">
$("document").ready(function(){
	function getstate(){
		if($("#checkbox1").is(":checked")&&$("#checkbox2").is(":checked")&&$("#checkbox3").is(":checked")&&$("#checkbox4").is(":checked")&&$("#checkbox42").is(":checked")&&$("#checkbox43").is(":checked")&&$("#checkbox5").is(":checked")){
			$("#shouli").attr("disabled",false);
		}else{
			alert("必填项哦 必须填完");
			$("#shouli").attr("disabled",true);
		}
	}
	$("input[type=checkbox]").change(function(){
		getstate();
	}); 
	$("#checkbox6").change(function(){
		if($("#checkbox6").is(":checked")){
			$(".dailifile").attr("disabled",false);
		}else{
			$(".dailifile").attr("disabled",true);
		}
	});
});
</script>
</head>
<body>
<form name="form" method="post" action="<%=basePath%>admin/regeditservice/list_shouli.jsp" onSubmit=event.returnValue=window.showModalDialog("huidan.htm",this,"dialogWidth:450px;dialogHeight:450px")>
<table border="0" width="100%" cellspacing="0" cellpadding="0">
  <tr>
    <td width="25%">商品房预售许可证申请：</td>
    <td colspan="3">&nbsp;</td>
  </tr>
  <tr>
    <td>商品房预售许可证必要文件：</td>
    <td colspan="3"><p>
      <label>
      <input name="checkbox1" id="checkbox1" type="checkbox" value="checkbox" checked>
      </label>
      （一）开发商签名或盖章的预售申请书； <br>
      <label>
      <input name="checkbox2" id="checkbox2" type="checkbox" value="checkbox" checked>
      </label>
      （二）项目负责人身份证明；<u> </u><br>
      <label>
      <input name="checkbox3" id="checkbox3" type="checkbox" value="checkbox" checked>
      </label>
      （三）土地使用权证； <br>
      <label>
      <input name="checkbox4" id="checkbox4" type="checkbox" value="checkbox" checked>
      </label>
      （四）建设用地规划许可证；<br>
      <label>
      <input name="checkbox42" id="checkbox42" type="checkbox" value="checkbox" checked>
      </label>
（四）建设工程规划许可证；<br>
<label>
<input name="checkbox43" id="checkbox43" type="checkbox" value="checkbox" checked>
</label>
（四）施工许可证；<br>
      <label>
      <input name="checkbox5" type="checkbox" id="checkbox5" value="checkbox">
      </label>
      （五）为完成登记所必需的其他文件。
      <label>
      <input name="textfield3" type="text" value="在此处填写其他必要文件名称" size="29">
      </label>
    </p>      </td>
  </tr>
  <tr>
    <td>项目负责人：</td>
    <td width="25%"><label>
      <input name="textfield" type="text" value="伍学名" size="22">
    </label></td>
    <td width="25%">项目负责人身份证件号码：</td>
    <td width="25%"><input name="textfield2" type="text" value="610101198008081234" size="22" maxlength="18"></td>
  </tr>
  <tr>
    <td><input type="checkbox" name="checkbox6" id="checkbox6" value="checkbox">
      代理人：</td>
    <td><input class="dailifile" type="text" name="daili" size="22" disabled></td>
    <td>代理人身份证件号码：</td>
    <td><input class="dailifile" type="text" name="dailicode" size="22" disabled></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td colspan="3">&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td colspan="3"><label></label></td>
  </tr>
  <tr>
    <td colspan="4" align="center"><label>
      <input name="shouli" type="submit" id="shouli" value="受理">
      &nbsp;&nbsp;<input type="reset" name="Submit" value="取消">
    </label></td>
    </tr>
</table>
</form>
</body>
</html>