<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<link href="../css/left.css" rel="stylesheet" type="text/css">
	
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Left</title>
	</head>

	<body class="bg">
		<table width="200" border="0" align="center">
			<tr>
				<td>账户信息</td>
			</tr>
			<tr>
				<td width="200" align="left">
					<table width="200" border="0" align="center" class="menu">
						<tr height="30" >
							<td align="center" valign="middle"><a href="../account/userQuery" target="mainFrame">账户查询</a></td>
						</tr>
						<tr height="30" >
							<td align="center" valign="middle"><a href="../account/userModify" target="mainFrame">账户修改</a></td>
						</tr>
						<tr height="30" >
							<td align="center" valign="middle"><a href="../account/userDelete" target="mainFrame">账户删除</a></td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>游戏信息</td>
			</tr>
			<tr>
				<td width="200" align="left">
					<table width="200" border="0" align="center" class="menu">
						<tr height="30" >
							<td align="center" valign="middle"><a href="../game/playerQuery" target="mainFrame">玩家查询</a></td>
						</tr>
						<tr height="30" >
							<td align="center" valign="middle"><a href="../game/mailQuery" target="mainFrame">邮件查询</a></td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>日志信息</td>
			</tr>
			<tr>
				<td width="200" align="left">
					<table width="200" border="0" align="center" class="menu">
						<tr height="30" >
							<td align="center" valign="middle"><a href="../journal/inoutQuery" target="mainFrame">登录日志</a></td>
						</tr>
						<tr height="30" >
							<td align="center" valign="middle"><a href="../journal/resourceQuery" target="mainFrame">资源日志</a></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>