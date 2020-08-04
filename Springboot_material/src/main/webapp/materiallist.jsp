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
  <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
  <script type="text/javascript">
  	function tiaozhuan(){
  		var shop=document.getElementById("shoping").value;
  		var factorying=document.getElementById("accid").value;
  		var startmenoy=document.getElementById("startmenoy").value;
  		var endmenoy=document.getElementById("endmenoy").value;
  		location.href="/cc/queryMaterial?shoping="+shop+"&factorying="+factorying+"&startmenoy="+startmenoy+"&endmenoy="+endmenoy	
  		
  	}
  
  </script>
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
  <form action="/cc/pilandelete">
<table>
	<tr>
		<td colspan="9">图书馆</td>
	</tr>
	<tr>
		<td><input type="checkbox"></td>
		<td>用户名</td>
		<td>物资编号</td>
		<td>物资名称</td>
		<td>物资数量</td>
		<td>物资单价</td>
		<td>生产产商</td>
		<td>修改</td>
		<td>删除</td>
	</tr>
	<c:forEach items="${pageInfo.list}" var="example">
	<tr>
	<td><input type="checkbox"  name="box" value="${example.matid}"></td>
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
物资名称：<input type="text" id="shoping"  name="shoping" ><input type="button" onclick="tiaozhuan()" value="搜索"><br>
生产厂商：<!-- <input type="text" id="factorying"  name="factorying" > -->
<select id="accid" name="matfactory" onchange="showbalance(this.value);">
		<option value="">---请选择生产厂商---</option>
			
			
			</select>

<input type="button" onclick="tiaozhuan()" value="搜索"><br>
价格：<input type="text" id="startmenoy" placeholder="最低价格"  name="startmenoy"><input type="text" id="endmenoy" placeholder="最高价格"  name="endmenoy"><input type="button" onclick="tiaozhuan()" value="搜索">


<input type="submit" value="批量删除">
</form>
		 <p>当前 ${pageInfo.pageNum }页,总${pageInfo.pages}
				页,总 ${pageInfo.total} 条记录
       <a href="/cc/queryMaterial?pageNo=1">第一页</a>
        <c:if test="${pageInfo.hasPreviousPage }">
			<a href="/cc/queryMaterial?pageNo=${pageInfo.pageNum-1}">上一页</a>
		</c:if>
      
        <c:if test="${pageInfo.hasNextPage }">
			<a href="/cc/queryMaterial?pageNo=${pageInfo.pageNum+1}">下一页</a>
		</c:if>
        
        <a href="/cc/queryMaterial?pageNo=${pageInfo.pages}">最后页</a>

  </body>
</html>