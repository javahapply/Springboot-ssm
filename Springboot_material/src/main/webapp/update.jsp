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
  $(function(){
		
		$.post("cc/havefactory",{},function(data){
			//console.log(data);
			$.each(data,function(i,n){
				$("#accid").append("<option  value='"+n.matfactory+"'>"+n.matfactory+"</option>");
			});
		},"json");
		
		
	});
  
  </script>
  <body>
<h3>修改页面</h3>
<form action="/cc/updateMaterial">
<input type="hidden" value="${list.matid}" name="matid">
物资名称：<input type="text" value="${list.matname}" name="matname"><br>
价格：<input type="text" value="${list.matprice}" name="matprice"><br>
数量<input type="text" value="${list.matsum}" name="matsum"><br>
生产厂商：	<select id="accid" name="matfactory" onchange="showbalance(this.value);">
		<option  value="${list.matfactory}">${list.matfactory}</option>
			
			
			</select>
<input type="submit" value="修改">

</form>



  </body>
</html>