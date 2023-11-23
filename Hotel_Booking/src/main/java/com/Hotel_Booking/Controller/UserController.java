package com.Hotel_Booking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Hotel_Booking.Service.UserService;
import com.Hotel_Booking.entity.User;

@Controller
public class UserController {
	@Autowired
	private UserService ser;
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/loginVerify")
	public String loginVerify(@RequestParam String email, @RequestParam String password ,Model model) {
		User loginVerify = ser.loginVerify(email,password);
		//String firstName = loginVerify.getFirstName();
		System.out.println(loginVerify);
		if(loginVerify!=null) {
			String firstName = loginVerify.getFirstName();
		    int id = loginVerify.getId();
			model.addAttribute("name",firstName);
			model.addAttribute("userId",id);
		return "welcome";
	}
		else {
			model.addAttribute("msg","enter valid details");
		}
		return "login";
	}
	@RequestMapping("/SignUp")
	public String signUp() {
		return "SignUp";
	}
@RequestMapping("/register")
public String home(@ModelAttribute User user, @RequestParam String email,Model model) {
	 User exist = ser.exist(email);
	//String email2 = exist.getEmail();
	if(exist==null) {
	ser.register(user);
	return "successfullyRegisterted";
	}
	else {
		model.addAttribute("msg","Email Id Already Exist");
	}
	System.out.println(user);
	System.out.println(exist);
	return "SignUp";
}
}
