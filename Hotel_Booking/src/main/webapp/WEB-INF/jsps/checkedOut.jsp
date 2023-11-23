<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<table border="1">
<c:forEach var="Details" items="${check}">
<tr><td style="font-size: 24px;">
Booking Id:${Details.bookingId}<br>
Guest Name:${Details.guestName}<br>
Age:${Details.age}<br>
Check In Date:${Details.checkInDate}<br>
Check Out Date:${Details.checkOutDate}<br>
Room No:${Details.roomId}<br>
User Id:${Details.userId}<br>
Phone No:${Details.phone}<br>
Gender:${Details.gender}<br>
No of Guests:${Details.noOfGuests}<br>
Max Capacity:${Details.maxCapacity}<br>
Room Type:${Details.roomType}<br>
CheckIN Time:${Details.timestamp}<br>
</td></tr>
<tr>
<td style="font-size: 28px;">
Paid Amount:${Details.payableAmount}
</td>
</tr>
<tr>
<td>
<a href="checkOut?roomId=${Details.roomId}&guestName=${Details.guestName}&maxCapacity=${Details.maxCapacity}&noOfGuests=${Details.noOfGuests}&age=${Details.age}
&checkInDate=${Details.checkInDate}&checkOutDate=${Details.checkOutDate}&phone=${Details.phone}&gender=${Details.gender}&bookingId=${Details.bookingId}&payableAmount=${Details.payableAmount}&userId=${Details.userId}
&timestamp=${Details.timestamp}&roomType=${Details.roomType}">Check Out</a>
</td>
</tr>
</c:forEach>
</table>

</form>

</body>
</html>