package com.Hotel_Booking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Hotel_Booking.Service.bookingService;
import com.Hotel_Booking.Service.checkInRoomService;
import com.Hotel_Booking.entity.checkInRoom;

@Controller
public class checkInRoomController {
	@Autowired
	private checkInRoomService checkInSer;
	@Autowired
	public bookingService service;
@RequestMapping("/confirmCheckIn")
public String confirmedCheckIn(@ModelAttribute checkInRoom checkInRoom,@RequestParam("roomId")int roomId) {
	checkInSer.checkInRooms(checkInRoom);
	service.deleteBooksAftercheckIn(roomId);
	return "successfullyCheckIn";
}
}
