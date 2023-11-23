package com.Hotel_Booking.Controller;

import java.util.List;

import javax.transaction.Transactional;

import com.Hotel_Booking.entity.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Hotel_Booking.Service.roomService;
import com.Hotel_Booking.entity.Room;

@Controller
public class roomController {
	@Autowired
	private roomService roomSer;
	@RequestMapping("/showRoom")
public String rooms(Model model,@RequestParam("userId") int userId) {
	List<Room> rooms = roomSer.rooms();
	model.addAttribute("rooms",rooms);
	model.addAttribute("userId",userId);
	return "showRoom";
	
	
}
	@RequestMapping("/roomBooking")
	public String booking() {
		return "bookingDetails";
	}
@RequestMapping("/myBookings")	
public String myBooking(Model model,@RequestParam("userId")int userId) {
	List<booking> myBookings = roomSer.myBookings(userId);
	if(myBookings!=null) {
	model.addAttribute("Details",myBookings);
	}
	else {
		model.addAttribute("alert","No Active Bookings");
	}
	return "myBookings";
}
     @Transactional
     @RequestMapping("/cancelBooking")
     public String bookingCancellation(@RequestParam("roomId")int roomId,@RequestParam("maxCapacity")int maxCapacity
    		 ,@RequestParam("roomType")String roomType) {
    	 roomSer.bookingCancellation(roomId);
    	 roomSer.addRoomBack(roomId,maxCapacity,roomType);
    	 return "bookingCancellation";
     }
     @Transactional
     @RequestMapping("/cancel")
     public String bookingCancel(@RequestParam("roomId")int roomId,@RequestParam("maxCapacity")int maxCapacity
    		 ,@RequestParam("roomType")String roomType) {
    	 roomSer.bookingCancellation(roomId);
    	 roomSer.addRoomBack(roomId,maxCapacity,roomType);
    	 return "bookingCancellation";
     }
}
