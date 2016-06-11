<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<hr style="margin-top: 30px;" />
		<div
			style="border: 2px; border-color: black; border-style: groove; margin-top: 10px; padding: 10px; width: 400px;">
			<form action="../SigninAction" method="post">
				<font size="4">
					<table>
						<tr>
							<td>Email:</td>
							<td><input type="text" name="email" /></td>
						</tr>
						<tr>
							<td>Password:</td>
							<td><input type="password" name="password" /></td>
						</tr>
						<tr>
							<td colspan="2" align="right"><a href="../signup/index.jsp">Signup</a>&nbsp;&nbsp;
								<input type="submit" value="Sign-In" /></td>
						</tr>
					</table>
				</font>
			</form>
		</div>

	</center>
</body>
</html>
