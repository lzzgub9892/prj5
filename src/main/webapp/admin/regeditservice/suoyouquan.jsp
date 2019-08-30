<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
</style>
<script>
	$(document).ready(function(){

		/*获取上个页面传递的roomid和所有人id*/
		/*=================================================*/
		var url = location.search; //获取url中"?"符后的字串
	     var theRequest = new Object();
	     if (url.indexOf("?") != -1) {
	         var str = url.substr(1);
	         strs = str.split("&");
	         for(var i = 0; i < strs.length; i ++) {
	             theRequest[strs[i].split("=")[0]]=unescape(strs[i].split("=")[1]);
	         }
	     }
		/*=================================================*/
		
		var types="";
		var client="";
		$.post("/admin/findAllServicetype",{clientid:theRequest.applicantid},function(data){
			if(data!=null){
				client=data.client;
				$("#proposer").val(client.clientname);
				$("#idcard").val(client.idcard);
				types=data.servicetypes;
				for(var i=0;i<types.length;i++){
					if(types[i].pid==0){
						$("#bigservicetype").append("<option value="+types[i].servicetypeid+">"+types[i].servicetype+"11</option>");
					}
				}
				fillType(1);
			}
		});
		
		function fillType(servicetypeid){
			for(var i=0;i<types.length;i++){
				if(types[i].pid==servicetypeid){
					$("#servicetype").append("<option value="+types[i].servicetypeid+">"+types[i].servicetype+"</option>");
				}
			}
		}
		$("#bigservicetype").change(function(){
			$("#servicetype").empty();
			var value=$(this).val();
			fillType(value);
		});
		function getstate(){
			if($("#checkbox1").is(":checked")&&$("#checkbox2").is(":checked")&&$("#checkbox3").is(":checked")&&$("#checkbox4").is(":checked")){
				$("#shouli").attr("disabled",false);
			}else{
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
<h3>房屋登记</h3>
<form name="form" method="post" action="/admin/saveMidservice">
<table class="table">
  <tr>
    <td width="25%">选择登记类型</td>
    <td colspan="3">
      <select id="bigservicetype"></select>
      <select id="servicetype" name="servicetypeid"></select>    
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
      （二）申请人身份证明；<br>
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
      <input name="textfield3" type="text" placeholder="在此处填写其他必要文件名称" size="29">
      </label>
    </p>      </td>
  </tr>
  <tr>
    <td>申请人：</td>
    <td width="25%"><label>
      <input name="proposer" id="proposer" type="text" placeholder="如：伍学名" size="22">
    </label></td>
    <td width="25%">申请人身份证件号码：</td>
    <td width="25%"><input name="idcard" id="idcard" type="text" placeholder="如：610101198008081234" size="22" maxlength="18"></td>
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
