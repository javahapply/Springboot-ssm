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
  <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
  <script type="text/javascript">
  
  function showbalance() {
	 
	  var text=$("#form1").serialize();
	  $.post("fc/checkuser"+"?"+text,
		 
		function(msg){
		  if(msg=="true"){
			  
			 location.href="/fc/tiaoindex";
			  
		  }else{
			  alert("账号或者密码错误")
		  }
		  
	  }
		
		
		);
	}
  

  
  </script>
  <body>
<form action="" id="form1" method="post">
用户名：<input type="text" name="loginname" id="loginname"><br>
密码：<input type="password" name="loginpwd" id="loginpwd"><br>
<input type="button" value="登录" onclick="showbalance()"><br>
</form>
<a href="zhuce.jsp"><button>注册</button></a>
  </body>
</html>