<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  <style>
			*{
				padding: 0px;
				margin: 0px;
			}
			table{
				color: red;
				text-align: center;
				border: 1px solid red;
			}
			tr,td{
				
				border: 1px solid red;
			}
		</style>
  <body>
<table>
	<tr>
		<td colspan="8">图书馆</td>
	</tr>
	<tr>
		<td>用户名</td>
		<td>物资编号</td>
		<td>物资名称</td>
		<td>物资数量</td>
		<td>物资单价</td>
		<td>生产产商</td>
		<td>修改</td>
		<td>删除</td>
	</tr>
	<c:forEach items="${list}" var="example">
	<tr>
	<td>${example.matuser}</td>
	<td>${example.matid}</td>
	<td>${example.matname}</td>
	<td>${example.matsum}</td>
	<td>${example.matprice}</td>
	<td>${example.matfactory}</td>
	<td><a href="cc/querybyidMaterial?id=${example.matid}">修改</a></td>
	<td><a href="cc/deleteMaterial?id=${example.matid}">删除</a></td>
	</tr>
	</c:forEach>
	
</table>
  </body>
</html>