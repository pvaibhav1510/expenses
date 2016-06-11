<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div
		style="width: 1200px; height: 800px; border: 2px solid; margin: 10px 30px 30px 30px;">
		<center style="margin-top: 100px;">
			<hr style="margin-top: 30px;" />
			<div
				style="border: 2px; border-color: black; border-style: groove; margin-top: 10px; padding: 10px; width: 400px;">
				<form action="../SigninAction" method="post">
					<font size="4">
						<table>
							<tr>
								<td style="padding: 6px;">Name:</td>
								<td style="padding: 6px;"><input type="text" name="name" /></td>
							</tr>
							<tr>
								<td style="padding: 6px;">Email:</td>
								<td style="padding: 6px;"><input type="text" name="email" /></td>
							</tr>
							<tr>
								<td style="padding: 6px;">Password:</td>
								<td style="padding: 6px;"><input type="password"
									name="password1" /></td>
							</tr>
							<tr>
								<td style="padding: 6px;">Re-type Password:</td>
								<td style="padding: 6px;"><input type="password"
									name="password2" /></td>
							</tr>
							<tr>
								<td style="padding: 6px;">Mobile No:</td>
								<td style="padding: 6px;"><input type="text" name="mobile" />
									<input type="checkbox" value="false" name="show_password" /></td>
							</tr>
							<tr>
								<td colspan="2" style="padding: 6px;" align="right"><input
									type="submit" value="Signup" /> &nbsp; &nbsp; <a
									href="../login/index.jsp">Cancel</a></td>
							</tr>
						</table>
					</font>
				</form>
			</div>
		</center>

	</div>
</body>
</html>
