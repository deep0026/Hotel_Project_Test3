<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<h1>Hi Customer</h1>
<form action="booking" method="post">
<table>
<tr><td>
<input type="hidden"value="${roomId}" name="roomId" id="roomId">
<input type="hidden" value="${maxCapacity}" name="maxCapacity">
<input type="hidden" value="${roomType}" name="roomType">
<input type="hidden" value="${userId}" name="userId">
</td></tr>
<tr><td>
CHECK IN DATE:<input type="date" name="checkInDate" placeholder="date" required>
</td> </tr>
<tr><td>
CHECK OUT DATE:<input type="date" name="checkOutDate" placeholder="date" required>
</td> </tr>
<tr><td>
GUEST NAME:<input type="text" name="guestName" placeholder="FIRST NAME" required>
</td></tr>
<tr><td>
AGE:<input type="text" name="age" placeholder="Age" required>
</td></tr>
<tr><td>
PHONE:<input type="text" name="phone" pattern="[0-9]*" maxlength=10 placeholder="phone Number" required>
</td></tr>
<tr><td>
 <label for="gender">Select your gender:</label>
  <select id="gender" name="gender">
    <option value="male">Male</option>
    <option value="female">Female</option>
    <option value="other">Other</option>
  </select>
</td></tr>
<tr><td>
 <label for="noOfGuests">No of Guests:</label>
  <select id="noOfGuests" name="noOfGuests">
    <!-- Options will be dynamically added here based on room ID -->
  </select>
  </td></tr>
<tr><td>
<input type="submit" value="BOOK">
</td></tr>
</table>
${alert}
</form>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<script>
    $(document).ready(function() {
        // Call the function when the page is loaded
        updateGuestOptions();

        $("#roomId").change(function() {
            updateGuestOptions();
        });

        function updateGuestOptions() {
            var roomId = $("#roomId").val();
            var noOfGuestsSelect = $("#noOfGuests");

            // Clear existing options
            noOfGuestsSelect.empty();

            // Add new options based on room ID
            var maxGuests = (roomId == 100 || roomId == 101 || roomId == 102) ? 2 : 4;
            for (var i = 1; i <= maxGuests; i++) {
                var option = $("<option>").val(i).text(i);
                noOfGuestsSelect.append(option);
            }
        }
    });
</script>

</body>
</html>
