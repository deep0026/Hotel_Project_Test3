<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1>LOGIN</H1>
<form action="loginVerify" method="post">
<table>
<tr><td>
USERNAME:<input type="text" name="email" placeholder="email" required>
</td></tr>
<tr><td>
PASSWORD:<input type="password" name="password" placeholder="password" required>
</td></tr>
<tr><td>
<input type="submit" value="login">
</td></tr>
</table>
<a href="SignUp">SignUp</a>

</form>
${msg}
</body>
</html>