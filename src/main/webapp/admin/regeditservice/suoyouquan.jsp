<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style_1.css">
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
</style>
<script>
	$("document").ready(function(){
		function getstate(){
			if($("#checkbox1").is(":checked")&&$("#checkbox2").is(":checked")&&$("#checkbox3").is(":checked")&&$("#checkbox4").is(":checked")){
				$("#shouli").attr("disabled",false);
			}else{
				alert(111111111111);
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
<form name="form" method="post" action="/admin/findAll" onSubmit=event.returnValue=window.showModalDialog("huidan.htm",this,"dialogWidth:450px;dialogHeight:450px")>
<table border="0" width="100%" cellspacing="0" cellpadding="0" class="table">
  <tr>
    <td width="25%">所有权登记</td>
    <td colspan="3">
      <select name="servicetypeid">
	      <c:forEach items="${servicetypes}" var="type">
	        <option value="${type.servicetypeid }">${type.servicetype }</option>
	      </c:forEach>
      </select>    
    </td>
  </tr>
  <tr>
    <td>所有权登记必要文件：</td>
    <td colspan="3"><p>
      <label>
      <input id="checkbox1" name="checkbox1" type="checkbox" value="checkbox" checked>
      </label>
      （一）申请人签名或盖章的登记申请书； <br>
      <label>
      <input id="checkbox2" name="checkbox2" type="checkbox" value="checkbox" checked>
      </label>
      （二）申请人身份证明；<u> </u><br>
      <label>
      <input id="checkbox3" name="checkbox3" type="checkbox" value="checkbox" checked>
      </label>
      （三）登记原因证明文件； <br>
      <label>
      <input id="checkbox4" name="checkbox4" type="checkbox" value="checkbox" checked>
      </label>
      （四）房屋权属证书，但登记原因证明文件为人民法院、仲裁委员会生效的法律文书的，以及法律、法规和本办法另有规定的除外；<br>
      <label>
      <input name="checkbox5" type="checkbox" value="checkbox">
      </label>
      （五）为完成登记所必需的其他文件。
      <label>
      <input name="textfield3" type="text" value="在此处填写其他必要文件名称" size="29">
      </label>
    </p>      </td>
  </tr>
  <tr>
    <td>申请人：</td>
    <td width="25%"><label>
      <input name="proposer" type="text" value="伍学名" size="22">
    </label></td>
    <td width="25%">申请人身份证件号码：</td>
    <td width="25%"><input name="textfield2" type="text" value="610101198008081234" size="22" maxlength="18"></td>
  </tr>
  <tr>
    <td><input id="checkbox6" type="checkbox" name="checkbox6" value="checkbox">代理人：</td>
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
      <input id="shouli" name="shouli" type="submit" id="shouli" value="受理">
      &nbsp;&nbsp;<input id="quxiao" type="reset" name="Submit" value="取消">
    </label></td>
    </tr>
</table>
</form>
</body>
</html>
