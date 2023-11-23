package com.Hotel_Booking.Controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Hotel_Booking.Service.AdminService;
import com.Hotel_Booking.entity.Admin;
import com.Hotel_Booking.entity.booking;
//import com.Hotel_Booking.entity.checkIn;

@Controller
public class AdminController {
	@Autowired
	private AdminService Adminser;
	@RequestMapping("/Admin")
	public String Admin() {
	   return "AdminLogin";
	}
	@RequestMapping("/AdminVerify")
public String AdminVerify(@RequestParam String username,@RequestParam String password,Model model) {
	Admin adminVerify = Adminser.AdminVerifyDetails(username,password);
	
	System.out.println(adminVerify);
	if(adminVerify!=null) {
		return "AdminPage";
	}
	return "AdminLogin";
}
	@RequestMapping("/checkIn")
	public String checkIndetails(Model model) {
		List<booking> checkIn = Adminser.checkIn();
		model.addAttribute("checkIn",checkIn);
		return "checkIn";
	}
	
	
}
