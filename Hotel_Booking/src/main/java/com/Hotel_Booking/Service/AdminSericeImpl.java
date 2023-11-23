package com.Hotel_Booking.Service;

//import com.Hotel_Booking.entity.checkIn;

import java.sql.Timestamp;
//import java.security.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel_Booking.Reposistory.AdminReposistory;
import com.Hotel_Booking.Reposistory.bookingRepository;
import com.Hotel_Booking.entity.Admin;
import com.Hotel_Booking.entity.booking;
@Service
public class AdminSericeImpl implements AdminService{
	@Autowired
	private bookingRepository bookingRepo;
	@Autowired
 private AdminReposistory adminRepo;
	
	@Override
	public Admin AdminVerifyDetails(String name, String password) {
		Admin AdminVerfied = adminRepo.findByUserNameAndPassword(name, password);
		return AdminVerfied;
	}
	@Override
	public List<booking> checkIn() {
		List<booking> findAll = bookingRepo.findAll();
		return findAll;
	}
	

}
