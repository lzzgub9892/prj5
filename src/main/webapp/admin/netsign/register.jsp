<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
</style>
</head>
<body>
<form method="post" action="register" >
<table border="0" width="100%" cellspacing="0" cellpadding="0">
  <caption><h3>网签登记</h3></caption>
  <tr>
    <td>网签登记必要文件：</td>
    <td colspan="3"><p>
      <label>
      <input name="checkbox" type="checkbox" value="checkbox" checked>
      </label>
      （一）网签申请书； <br>
      <label>
      <input name="checkbox2" type="checkbox" value="checkbox" checked>
      </label>
      （二）购房人身份证明；<u> </u><br>
      <label>
      <input name="checkbox3" type="checkbox" value="checkbox" checked>
      </label>
      （三）售房人身份证明； <br>
      <label>
      <input name="checkbox4" type="checkbox" value="checkbox" checked>
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
      <input name="shouli" type="submit" id="shouli" value="受理">
      &nbsp;&nbsp;<input type="reset" name="Submit" value="取消">
    </label></td>
    </tr>
</table>
</form>
</body>
</html>