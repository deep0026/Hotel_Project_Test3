<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<script>
function checkPassword(event) {
    event.preventDefault(); // Prevents the default form submission

    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;

    if (password === confirmPassword) {
        // Passwords match, submit the form
        document.forms[0].submit();
    } else {
        alert("Password does not match!");
    }
}
</script>

<h1>REGISTER</h1>

<form action="register" method="post" onsubmit="checkPassword(event)">
<table>
<tr><td>
FIRSTNAME:<INPUT TYPE="TEXT" NAME="firstName" placeholder="First Name" required>
</td></tr>
<tr><td>
LASTNAME:<input type="text" name="lastName" placeholder="last Name" required>
</td></tr>
<tr><td>
EMAIL:&nbsp;&nbsp;&nbsp;<input type="email" name="email" placeholder="Email"required>
</td></tr>
<tr><td>
PASSWORD:&nbsp;<input type="password" id="password" name="password" placeholder="Password" required>
</td></tr>
<tr><td>
CPASSWORD:<input type="password" id="confirmPassword" placeholder="Confirm password" required>
</td></tr>
<tr><td>
PHONE:&nbsp;&nbsp;&nbsp;<input type="text" name="phone" placeholder="Phone"required> 
</td></tr>
<tr><td>
AGE:&nbsp;&nbsp;&nbsp;<input type="text" name="age" placeholder="Age" required>
</td></tr>
<tr><td>
CITY:&nbsp;&nbsp;&nbsp;<input type="text" name="city" placeholder="City" required>
</td></tr>
<tr><td>
<input type="submit" value="Register">
</td></tr>
</table>
<a href="index.html">back to login</a>
</form>
${msg}
</body>
</html>