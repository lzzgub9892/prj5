<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form name="query" id="form1" method="post" action="/admin/getMidservice">
	<table class="table">
	<tr>
		<td colspan="7">
			按业务查询：
			业务类型：
			<select name="servicetypeid" id="servicetypeid" onfocus="selectFocus1()" onblur="removeattr1()">
				<c:forEach items="${servicetypes}" var="types">
					<option value="${types.servicetypeid }">${types.servicetype }${types.servicetypeid }</option>
				</c:forEach>
			</select>
			业务状态：
			<select name="servicestatusid" id="servicestatusid" onfocus="selectFocus2()" onblur="removeattr2()">
				<c:forEach items="${servicestatus }" var="status">
					<option value="${status.servicestatusid }">${status.servicestatus }</option>
				</c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<td colspan="7">
			按客户查询：
			客户姓名：
			<input type="text" name="proposer"/>
			身份证件号码：
			<input type="text" name="idcard"/>
		</td>
	</tr>
	<tr>
		<td colspan="7">
			按时间查询：
			受理时间：
			<input class="date" type="text" placeholder="请输入起始时间" size=11 name="time1" value="<fmt:formatDate value="${d1}" pattern="yyyy-MM-dd"/>"/>
			至
			<input class="date" type="text" placeholder="请输入结束时间" size=11 name="time2" value="<fmt:formatDate value="${d2}" pattern="yyyy-MM-dd"/>"/>
			<button type="submit">query</button>
		</td>
	</tr>
	
	  <tr align="center">
	  	<td width="10%">业务id</td>
	    <td width="20%">业务类型</td>
	    <td width="10%">业务状态</td>
	    <td width="10%">申请人</td>
	    <td width="20%">身份证件号码</td>
	    <td width="15%">受理时间</td>
	    <td width="15%">受理人</td>
	  </tr>
	  <c:forEach items="${midservices }" var="midservice">
		  <tr onclick="to('servicetype=${servicetypes[midservice.servicetypeid-1].servicetype }&&proposer=${midservice.proposer }&&idcard=${midservice.idcard }')" align="center">
		    <td>${midservice.serviceid }</td>
		    <td>${servicetypes[midservice.servicetypeid-1].servicetype }</td>
		    <td>&lt;${servicestatus[midservice.servicestatusid-1].servicestatus }&gt;</td>
		    <td>${midservice.proposer }</td>
		    <td>${midservice.idcard }</td>
		    <td><fmt:formatDate value="${midservice.processtime }" pattern="yyyy-MM-dd hh:mm:ss"/></td>
		    <td>${midservice.uid}</td>
		  </tr>
	  </c:forEach>
	  <tr align="center">
	    <td align="center"><a href="javascript:go(1)">首页</a></td>
	    <td align="center"><a href="javascript:go(${pb.pageNow>1?pb.pageNow-1:pb.pageNow })">上一页</a></td>
	    <td align="center"><a href="javascript:go(${pb.pageNow==pb.pageCount?pb.pageCount:pb.pageNow+1 })">下一页</a></td>
	    <td align="center"><a href="javascript:go(${pb.pageCount })">末页</a></td>
	    <td align="center">
	    	<select name="pageNow" id="pageNow" onchange="selected()" onfocus="selectFocus()" onblur="removeattr()">
	    		<c:forEach begin="1" end="${pb.pageCount }" var="i">
	    			<option value="${i }" 
	    				<c:if test="${i==pb.pageNow }">selected</c:if>
	    			>第${i }页</option>
	    		</c:forEach>
	    	</select>
	    	<%-- 第<input name="pageNow" id="pageNow" value="${pb.pageNow }" size=1/>页<button type="commit">go</button> --%>
	    </td>
	    <td align="center">一页<input name="limit" value="${pb.limit }" onblur="selected()" size=1/>条数据</td>
	    <td align="center">共${pb.count }条</td>
	  </tr>
	</table>
</form>
</body>
</html>
<script>
	function to(param){
		var ele=$("#form1");
		ele.prop("action","?"+param);
		alert(ele.attr("action"));
		ele.submit();
	}
	function go(pageNow){
		document.getElementById("pageNow").value=pageNow;
		document.forms[0].submit();
	}
	function selected(){
		var sel=document.getElementById("pageNow");
		var index=sel.selectedIndex;
		var value=sel.options[index].value;
		sel.options[index].selected=true;
		go(value);
	}
	/*==================================================================*/
	function selectFocus(){
		document.getElementById("pageNow").setAttribute("size","5");
	}
	function removeattr(){
		document.getElementById("pageNow").removeAttribute("size");
	}
	function selectFocus1(){
		document.getElementById("servicetypeid").setAttribute("size","5");
	}
	function removeattr1(){
		document.getElementById("servicetypeid").removeAttribute("size");
	}
	function selectFocus2(){
		document.getElementById("servicestatusid").setAttribute("size","5");
	}
	function removeattr2(){
		document.getElementById("servicestatusid").removeAttribute("size");
	}
	/*==================================================================*/
	$(".date").focus(function(){
		$(this).prop('type','date');
	});
	$(".date").blur(function(){
		$(this).prop('type','text');
	});
</script>