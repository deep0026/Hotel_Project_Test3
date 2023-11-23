package com.Hotel_Booking.Service;

import javax.transaction.Transactional;

import com.Hotel_Booking.entity.booking;
import com.Hotel_Booking.payload.bookingDto;

public interface bookingService {
	@Transactional
public void bookingDetails(int age,int roomId,int userId,String checkInString,String checkOutString,String guestName
	     ,String gender,String phone,int noOfGuests,int payableAmount,int maxCapacity,String roomType,int bookingId);

public void deleteBooksAftercheckIn(int roomId);
}

