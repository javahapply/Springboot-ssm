<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
<form action="/fc/register" method="post">
ID:<input type="text" name="userid"><br>
用户名：<input type="text" name="loginname"><br>
密码：<input type="text" name="loginpwd"><br>
姓名：<input type="text" name="realname"><br>
性别：<input type="text" name="sax"><br>
年龄：<input type="text" name="age"><br>
<input type="submit" value="注册">
</form>
  </body>
</html>