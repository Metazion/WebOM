<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<link href="../css/logo.css" rel="stylesheet" type="text/css">
	
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Login</title>	
	</head>
	
	<body>
		<table width="524" height="83" border="0" align="center">
			<tr>
				<th width="275" valign="top" scope="col"><h3 class="logo">游戏运维系统</h3></th>
			</tr>
		</table>

		<table width="333" border="0" align="center">
		<form:form modelAttribute="user" method="post">  
			<tr>
				<td width="120"><div align="center">用户名：</div></td>
				<td width="200"><form:input path="username"/></td>
			</tr>
			<tr>
				<td><div align="center">密码：</div></td>
				<td><form:password path="password"/></td>
			</tr>
			<tr>
				<td height="60" colspan="2">
					<div align="center">
						<input type="submit" value="登录" style="height:25px; width:100px;" />
					</div>
				</td>
			</tr>
		</form:form>
		</table>
	</body>
</html>