package com.Hotel_Booking.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.transaction.Transactional;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Hotel_Booking.Service.bookingService;
import com.Hotel_Booking.Service.roomService;
import com.Hotel_Booking.entity.booking;
import com.Hotel_Booking.payload.bookingDto;
//bookingSer.bookingDetails(book);

@Controller
public class bookingController {
	@Autowired
	private roomService roomSer;
	@Autowired
	private bookingService bookingSer;
	 private int generateRandomSixDigitNumber() {
	        // Generating a random number between 100000 and 999999
	        return (int) (Math.random() * 900000) + 100000;
	    }
	@RequestMapping("/bookingDetails")
public String Booking(@RequestParam("roomId") int roomId ,Model model ,@RequestParam("userId") int userId
	,@RequestParam("maxCapacity")String maxCapacity,@RequestParam("roomType")String roomType) {
		model.addAttribute("roomId",roomId);
		model.addAttribute("userId",userId);
		model.addAttribute("maxCapacity",maxCapacity);
		model.addAttribute("roomType",roomType);
		return "bookingDetails";
}
	@Transactional
	@RequestMapping("/booking")
	public String bookingDetails(@RequestParam("checkInDate")@DateTimeFormat(pattern = "yyyy-MM-dd") Date checkIn,@RequestParam("checkOutDate")@DateTimeFormat(pattern = "yyyy-MM-dd") Date checkOut, @RequestParam("roomId") int roomId,
	@ModelAttribute booking book,Model model,@RequestParam("userId")int userId,@RequestParam("noOfGuests")int noOfGuests) {
		int bookingId = generateRandomSixDigitNumber();
		 if (checkIn.before(checkOut)) {
			 model.addAttribute("Details",book);
			 model.addAttribute("userId",userId);
			 
				model.addAttribute("bookingId",bookingId);
			
			 if(noOfGuests==1) {
				 model.addAttribute("amt",599);
			 }
			 else if(noOfGuests==2) {
				 model.addAttribute("amt",999);
			 }
			 else if(noOfGuests==3) {
				 model.addAttribute("amt",1499);
			 }
			 else if(noOfGuests==4) {
				 model.addAttribute("amt",1899);
			 }
				return "confirmBooking";    
		 }
		 else {
			 model.addAttribute("alert","please enter valid date");
			model.addAttribute("roomId",roomId);
			model.addAttribute("userId",userId);
			model.addAttribute("bookingId",bookingId);
		 }
		 return "bookingDetails";
		
		 }
	@Transactional
	@RequestMapping("/confirmedRoom")
	public String confirmedBookings(@RequestParam("age")int age,@RequestParam("roomId")int roomid,
			@RequestParam("userId")int userid,@RequestParam("checkInDate")String checkInString,
			@RequestParam("checkOutDate") String checkOutString,@RequestParam("guestName")String guestname,
			@RequestParam("phone")String phone,@RequestParam("gender")String Gender,@RequestParam("noOfGuests")int noOfGuests
			,@RequestParam("payableAmount")int payableAmount,@RequestParam("maxCapacity")int maxCapacity,@RequestParam("roomType")String roomType
			,@RequestParam("bookingId")int bookingId,Model model) {
		roomSer.deleteRoom(roomid);
		bookingSer.bookingDetails(age, roomid, userid, checkInString, checkOutString, guestname, Gender,phone,noOfGuests,payableAmount,maxCapacity,roomType,bookingId);
		model.addAttribute("bookingId",bookingId);
		return "confirmedRoom";

		}

}
