<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
  </head>
  <script type="text/javascript">
  	function validate(){
  		var userName = $("#userName").val();
  		var userPassword = $("#userPassword").val();
  		if(userName==null || userName==""){
  			$("#msg").html("<span style='color :red'>用户名不能为空!</span>");
  			$("#dl").attr({"disabled":"disabled"});
  		}else{
  			$.get('selUser','userName='+userName,function(result){
				if ($.trim(result) == "false") {
					$("#msg").html("<span style='color :red'>不存在该用户名!</span>");
					$("#dl").attr({"disabled":"disabled"});
				} else {
					$("#msg").html("<span style='color :green'>用户名输入正确!</span>");
					 $("#dl").removeAttr("disabled");
				}
			});
  		}
  		if(userPassword==null || userPassword==""){
  			$("#msgs").html("<span style='color :red'>密码不能为空!</span>");
  			$("#dl").attr({"disabled":"disabled"});
  		}else{
  			$("#msgs").html("<span></span>");
  			$("#dl").removeAttr("disabled");
  		}
  	}
  </script>
  <body>
    <form action="login" method="post">
    	用户名：<input type="text" name="userName" id="userName" onblur="validate()"/><span id="msg"></span><br/>
    	密码：<input type="password" name="userPassword" id="userPassword" onblur="validate()"/><span id="msgs"></span><br/>
    	<input type="submit" value="登录" id="dl" onclick="validate()"/>
    </form>
  </body>
</html>
