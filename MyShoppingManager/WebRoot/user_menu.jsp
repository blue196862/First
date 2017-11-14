<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  </head>
  
  <body>
    <div>
    	功能列表
    	<ul>
    		<li><a href="bill_menu.jsp">订单管理</a></li>
    		<li><a href="provider_menu.jsp">供应商管理</a></li>
    		<li><a href="user_menu.jsp">用户管理</a></li>
    		<li><a href="">密码修改</a></li>
    		<li><a href="">退出系统</a></li>
    	</ul>
    </div>
    <div>
    	<table>
    		<tr>
    			<td>用户编码</td>
    			<td>用户名称</td>
    			<td>性别</td>
    			<td>年龄</td>
    			<td>电话</td>
    			<td>用户角色</td>
    			<td>操作<a href="adduser.jsp">添加用户</a></td>
    		</tr>
    		<c:forEach items="${list }" var="l">
    		<tr>
    			<td>${l.userCode }</td>
    			<td>${l.userName }</td>
    			<td>
    				<c:if test="${l.gender==1 }">
    					女
    				</c:if>
    				<c:if test="${l.gender==2 }">
    					男
    				</c:if>
    			</td>
    			<td>${l.birthday }</td>
    			<td>${l.phone }</td>
    			<td>${l.getSr().getRoleName() }</td>
    			<td><a>查看</a><a>修改</a><a href="delUser?id=${l.id }">删除</a></td>
    		</tr>
    		</c:forEach>
    	</table>
    </div>
  </body>
</html>
