<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<script>
	var ps;
	var cs;
	$(function(){
		$.ajax({
			type: "POST",
			url:"/admin/province/findAll",
			dataType:"json",
			success:function(msg){
				ps=msg;
				fillP();
			}
		});
		function fillP(){
			$.each(ps,function(i,item){
				$("#p").append("<option value="+i+">"+item.pname+"</option>");
			});	
			fillC(0);
		}
		function fillC(index){
			$("#c").empty();
			cs=ps[index].citys;
			$.each(cs,function(i,item){
				$("#c").append("<option value="+i+">"+item.cname+"</option>");
			});
			fillZ(0);
		}
		function fillZ(index){
			$("#z").empty();
			var zs=cs[index].zones;
			$.each(zs,function(i,item){
				$("#z").append("<option value="+i+">"+item.zname+"</option>");
			});
		}
		$("#p").change(function(){
			var value=$(this).val();
			fillC(value);
		});
		$("#c").change(function(){
			var value=$(this).val();
			fillZ(value);
		});
		$(".date").focus(function(){
			$(this).prop('type','date');
		});
		$(".date").blur(function(){
			if($(this).val()==null||$(this).val()==""){
				$(this).prop('type','text');
			}
		});
		$("select").focus(function(){
			$(this).prop("size","5");
		});
		$("select").blur(function(){
			$(this).prop("size","");
		});
		$("select").change(function(){
			$(this).prop("size","");
		});
	});
</script>
</head>
<body>
<form class="form" name="form" method="post" action="/admin/findStart">
  <table class="table" border="0" cellpadding="1" cellspacing="1">
    <tr align="center" class=list>
      <td height="25" colspan="4"><div align="center" class="title">综合查询</div></td>
    </tr>

    <tr class=toplist>
      <td width="100">请选择查询类型：</td>
      <td colspan="3"><select name="servicetype">
        <option>所有权信息查询</option>
        <option>他项权信息查询</option>
        <option>预告信息查询</option>
        <option>查封信息查询</option>
        <option>更正和异议查询</option>
        <option>预售许可证查询</option>
        <option>预售合同备案查询</option>
        <option>登记簿信息查询</option>
      </select>      </td>
    </tr>
    <tr class=toplist>
      <td width="100">受理流水号：</td>
      <!-- 业务编号（业务表==》客户表） -->
      <td width="245"><input name="servicenumber" type="text" size="37"></td>
      <td width="100">土地证号：</td>
      <!-- 土地证号(土地证号表--》》楼盘表) -->
      <td><input name="lnname" type="text" size="37"></td>
    </tr>
    <tr class=toplist>
      <td>产权人：</td>
      <!-- 客户名称（客户表==》所有权表==》房屋表） -->
      <td><input name="clientname" type="text" size="37"></td>
      <td>房屋坐落：</td>
      <!-- 房屋坐落（楼盘表） -->
      <td><input name="location" type="text" size="37">      </td>
    </tr>

    <tr class=toplist>
      <td>产权证号：</td>
      <td><input name="textfield4" type="text" size="37"></td>
      <td>原产权人：</td>
      <!-- 客户名称（客户表==》所有权表==》房屋表） -->
      <td><input name="oldclientname" type="text" size="37"></td>
    </tr>
    <tr class=toplist>
      <td>产权人身份证明号：</td>
      <!-- 身份证号（客户表==》所有权表==》房屋表） -->
      <td><input name="idcard" type="text" size="37"></td>
      <td>原产权证号：</td>
      <td><input name="textfield32" type="text" size="37"></td>
    </tr>
    <tr class=toplist>
      <td>建筑区划</td>
      <!-- 建筑区划（建筑区划表==》楼盘表） -->
      <td>
          <select id="p"></select>
          <select id="c"></select>
          <select id="z"></select>
      </td>
      <td>房屋结构：</td>
      <!-- 房屋结构（房屋结构表==》楼盘表） -->
      <td><input name="bsname" type="text" size="37"></td>
    </tr>
    <tr class=toplist>
      	<td>申请时间：</td>
      	<!-- 业务办理时间（首先筛选出业务状态为已审批的所有业务，然后跟这些业务的时间进行比较） -->
     	<td>
	      	<input class="date" name="begintime1" type="text" size="11" placeholder="输入时间">
	      	  至
	        <input class="date" name="begintime2" type="text" size="11" placeholder="输入时间">
     	</td>
     	<td>填发时间：</td>
     	<!-- 估计也是从业务表中查询，首先筛选出已发证的所有业务记录，然后进行时间的比较 -->
      	<td width="245">
	      	<input class="date" name="textfield5222" type="text" size="11" placeholder="输入时间">
			至
	  		<input class="date" name="textfield52222" type="text" size="11" placeholder="输入时间">
  	  	</td>
    </tr>
    <tr height="65" align="center" class=list>
      <td height="18" colspan="4" valign="top" class="toplist_text">&nbsp;</td>
    </tr>
    <tr height="65" align="center" class=list>
      <td colspan="4" valign="top" class="toplist_text">
      <button name="query" type="submit" id="query">查询</button></td>
    </tr>
  </table>
</form>
</body>
</html>