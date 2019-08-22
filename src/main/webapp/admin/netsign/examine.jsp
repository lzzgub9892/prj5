<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	网签审批
	${netid} 
	
 function GetRequest() {
             var url = location.search; //获取url中"?"符后的字串
             var theRequest = new Object();
             if (url.indexOf("?") != -1) {
                 var str = url.substr(1);
                 strs = str.split("&");
                 for(var i = 0; i < strs.length; i ++) {
                     theRequest[strs[i].split("=")[0]]=unescape(strs[i].split("=")[1]);
                 }
             }
             return theRequest;
         }
console.log(GetRequest().goods_id);

</body>
</html>