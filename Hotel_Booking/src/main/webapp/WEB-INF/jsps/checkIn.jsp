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
<h1>hello welcome checkin</h1>
<form action="checkIn" method="post">
<table border="1">
<tr>
<th>Id</th>
<th>Booking Id</th>
<th>Age</th>
<th>Check In Date</th>
<th>Check Out Date</th>
<th>Guest Name</th>
<th>Room No</th>
<th>Phone No</th>
<th>Gender</th>
<th>No Of Guests</th>
<th>Payable Amount</th>
<th>Max Capacity</th>
<th>Room Type</th>
<th>Confirm</th>
<th>Cancel</th>
</tr>
<a:forEach var="checkIn" items="${checkIn}">
<tr>
<td>${checkIn.id}</td>
<td>${checkIn.bookingId}</td>
<td>${checkIn.age}</td>
<td>${checkIn.checkInDate}</td>
<td>${checkIn.checkOutDate}</td>
<td>${checkIn.guestName}</td>
<td>${checkIn.roomId}</td>
<td>${checkIn.phone}</td>
<td>${checkIn.gender}</td>
<td>${checkIn.noOfGuests}</td>
<td>${checkIn.payableAmount}</td>
<td>${checkIn.maxCapacity}</td>
<td>${checkIn.roomType}</td>

<td><a href="confirmCheckIn?roomId=${checkIn.roomId}&guestName=${checkIn.guestName}&maxCapacity=${checkIn.maxCapacity}&roomType=${checkIn.roomType}&noOfGuests=${checkIn.noOfGuests}&age=${checkIn.age}
&checkInDate=${checkIn.checkInDate}&checkOutDate=${checkIn.checkOutDate}&phone=${checkIn.phone}&gender=${checkIn.gender}&bookingId=${checkIn.bookingId}&payableAmount=${checkIn.payableAmount}&userId=${checkIn.userId}">Check In</a></td>
<td><a href="cancel?roomId=${checkIn.roomId}&maxCapacity=${checkIn.maxCapacity}&roomType=${checkIn.roomType}">Cancel Booking</a>
</td>
</tr>
</a:forEach>
</table>
</form>
</body>
</html>