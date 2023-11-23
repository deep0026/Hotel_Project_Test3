package com.Hotel_Booking.Service;

import java.util.List;

//import com.Hotel_Booking.entity.checkIn;

import com.Hotel_Booking.entity.Admin;
import com.Hotel_Booking.entity.booking;

public interface AdminService {

	public Admin AdminVerifyDetails(String name, String password);
	public List<booking> checkIn();
}
