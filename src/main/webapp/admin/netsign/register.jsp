<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<!-- 新 Bootstrap4 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/css/bootstrap.min.css">
 
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
 
<!-- popper.min.js 用于弹窗、提示、下拉菜单 -->
<script src="https://cdn.staticfile.org/popper.js/1.12.5/umd/popper.min.js"></script>
 
<!-- 最新的 Bootstrap4 核心 JavaScript 文件 -->
<script src="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(function(){
		function getstate(){
			if($("#checkbox1").is(":checked")&&$("#checkbox2").is(":checked")&&$("#checkbox3").is(":checked")&&$("#checkbox4").is(":checked")){
				$("#submit").attr("disabled",false);
			}else{
				$("#submit").attr("disabled",true);
			}
		}
		$("input[type=checkbox]").change(function(){
			getstate();
		});
		$("#submit").click(function(){    
			  var data = $("#registerForm").serialize();     
			   $.ajax({ 
			    type:'post',  
			    url:'register', 
			    cache: false,
			    data:data,  
			    dataType:'json', 
			    success:function(data){ 
				  if(data.message==null||data.message==""){
					alert("登记成功");
				  }else{      
			        alert(data.message);
				  } 
				  $("#registerForm")[0].reset();  
			    },
			    error:function(){ 
			     alert("请求失败");
			    }
			   })
			    
			});
		});

</script>
</head>
<body>
<form method="post" id="registerForm"   >
<table border="0" width="100%" cellspacing="0" cellpadding="0">
  <caption><h3>网签登记</h3></caption>
  <tr>
    <td>网签登记必要文件：</td>
    <td colspan="3"><p>
      <label>
      <input id="checkbox1" name="checkbox" type="checkbox" value="checkbox" checked>
      </label>
      （一）网签申请书； <br>
      <label>
      <input id="checkbox2" name="checkbox2" type="checkbox" value="checkbox" checked>
      </label>
      （二）购房人身份证明；<u> </u><br>
      <label>
      <input id="checkbox3" name="checkbox3" type="checkbox" value="checkbox" checked>
      </label>
      （三）售房人身份证明； <br>
      <label>
      <input id="checkbox4" name="checkbox4" type="checkbox" value="checkbox" checked>
      </label>
      （四）房屋权属证书<br>
    </p>      </td>
  </tr>
  <tr>
    <td>楼盘名称：</td>
    <td>
      <input name="hname" type="text">
    </td>
    <td>楼栋编号：</td>
    <td><input name="buildingnumber" type="text"></td>
    <td>门牌号：</td>
    <td><input name="roomnumber" type="text"></td>
  </tr>
  <tr>
    <td>购房人姓名：</td>
    <td><input type="text" name="buyername"></td>
    <td>购房人身份证件号码：</td>
    <td><input type="text" name="buyeridcard"></td>
  </tr>
  <tr>
    <td>售房人姓名：</td>
    <td><input type="text" name="sellername"></td>
    <td>售房人身份证件号码：</td>
    <td><input type="text" name="selleridcard"></td>
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
      <input name="shouli" type="button" id="submit" value="受理">
      &nbsp;&nbsp;<input type="reset" id="cancel" name="Submit" value="取消">
    </label></td>
    </tr>
</table>
</form>
</body>

</html>