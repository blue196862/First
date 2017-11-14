<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  </head>
  
  <body>
  	<table>
    	<form action="addUser" method="post">
    		<tr>
    			<td>用户编码：</td>
    			<td><input name="userCode" type="text"/></td>
    		</tr>
    		<tr>
    			<td>用户名称：</td>
    			<td><input name="userName" type="text"/></td>
    		</tr>
    		<tr>
    			<td>用户密码：</td>
    			<td><input name="userPassword" type="text"/></td>
    		</tr>
    		<tr>
    			<td>确认密码：</td>
    			<td><input name="userTwoPassword" type="text"/></td>
    		</tr>
    		<tr>
    			<td>用户性别：</td>
    			<td><select name="gender">
    				<option value="2">男</option>
    				<option value="1">女</option>
    			</select> </td>
    		</tr>
    		<tr>
    			<td>出生日期：</td>
    			<td><input name="birthday" type="text"/></td>
    		</tr>
    		<tr>
    			<td>用户电话：</td>
    			<td><input name="phone" type="text"/></td>
    		</tr>
    		<tr>
    			<td>用户地址：</td>
    			<td><input name="address" type="text"/></td>
    		</tr>
    		<tr>
    			<td>用户角色：</td>
    			<td><select name="userRole">
    				<option value="1">系统管理员</option>
    				<option value="2">经理</option>
    				<option value="3">普通员工</option>
    			</select> </td>
    		</tr>
    		<tr>
    			<td></td>
    			<td><input type="submit" value="保存"/><input type="button" value="返回"/></td>
    		</tr>
    	</form>
    </table>
  </body>
</html>
