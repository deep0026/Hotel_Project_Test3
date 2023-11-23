<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "a" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ROOMS</h1>
<form>
<table border="1">
<tr>
<th>id</th>
<th>Room Type</th>
<th>Max Capacity</th>
<th>Room No</th>
<th>Click Here</th>
</tr>
<a:forEach var="room" items="${rooms}">
<tr>
<td>${room.id}</td>
<td>${room.roomType}</td>
<td>${room.maxCapacity}</td>
<td>${room.roomId}</td>
<td><a href="bookingDetails?roomId=${room.roomId}&userId=${userId}&maxCapacity=${room.maxCapacity}
&roomType=${room.roomType}">BOOK NOW</a></td>
</tr>

</a:forEach>

</table>
</form>

</body>
</html>