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
<h1>Preview</h1>
<form>
<table border="1">
<tr><td style="font-size: 24px;">
Guest Name:<c:out value="${Details.guestName}" /><br>
Age:<c:out value="${Details.age}"/><br>
Check In Date:<c:out value="${Details.checkInDate}" /><br>
Check Out Date:<c:out value="${Details.checkOutDate}" /><br>
Room No:<c:out value="${Details.roomId}" /><br>
User Id:<c:out value="${Details.userId}" /><br>
Phone No:<c:out value="${Details.phone}" /><br>
Gender:<c:out value="${Details.gender}" /><br>
No of Guests:<c:out value="${Details.noOfGuests}" /><br>
Max Capacity:<c:out value="${Details.maxCapacity}" /><br>
Room Type:<c:out value="${Details.roomType}" /><br>
<input type="hidden" value="${bookingId}">
</td></tr>
<tr>
<td style="font-size: 28px;">
Payable Amount:<c:out value="${amt}"/>
</td>
</tr>
</table>

<a href="confirmedRoom?age=${Details.age}&checkInDate=${Details.checkInDate}&checkOutDate=${Details.checkOutDate}
&guestName=${Details.guestName}&roomId=${Details.roomId}&userId=${Details.userId}&phone=${Details.phone}
&gender=${Details.gender}&noOfGuests=${Details.noOfGuests}&payableAmount=${amt}&maxCapacity=${Details.maxCapacity}
&roomType=${Details.roomType}&bookingId=${bookingId}" style="font-size: 28px;">Pay At Hotel</a>
</form>
</body>
</html>