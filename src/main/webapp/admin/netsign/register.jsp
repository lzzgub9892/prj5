<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	网签登记
	<form action="register" method="post">
		楼盘名称：<input type="text" name="hname"><br/>
		楼栋名称：<input type="text" name="buildingnumber"><br/>
		门牌号：<input type="text" name="roomnumber"><br/>
		购房人姓名：<input type="text" name="buyername"><br/>
		购房人身份证号：<input type="text" name="buyeridcard"><br/>
		售房人房人姓名：<input type="text" name="sellername"><br/>
		售房人身份证号：<input type="text" name="selleridcard"><br/>
		<button type="submit">网签登记</button>
	</form>

</body>
</html>