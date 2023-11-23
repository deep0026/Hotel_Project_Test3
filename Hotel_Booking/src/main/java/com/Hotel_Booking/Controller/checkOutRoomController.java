package com.Hotel_Booking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Hotel_Booking.Service.CheckOutRoomService;
import com.Hotel_Booking.entity.checkInRoom;
import com.Hotel_Booking.entity.checkOutRoom;

@Controller 
public class checkOutRoomController {
@Autowired 
private CheckOutRoomService checkOutSer;
@RequestMapping("/checkOutDetails")
private String CheckOut(Model model) {
	List<checkInRoom> checkInDetails = checkOutSer.checkInDetails();
	model.addAttribute("check",checkInDetails);
	return "checkedOut";
}
@RequestMapping("/checkOut")
private String CheckedOut(@ModelAttribute checkOutRoom checkOutRoom,@RequestParam("roomId")int roomId) {
	checkOutSer.checkOutSave(checkOutRoom, roomId);
	return "SuccessfullyCheckedOut";
}
}
