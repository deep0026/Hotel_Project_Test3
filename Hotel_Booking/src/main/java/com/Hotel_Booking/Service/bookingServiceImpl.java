package com.Hotel_Booking.Service;

import java.text.SimpleDateFormat;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.Hotel_Booking.Reposistory.bookingRepository;
import com.Hotel_Booking.Reposistory.roomRepository;
import com.Hotel_Booking.entity.booking;
//import com.Hotel_Booking.payload.bookingDto;
import com.Hotel_Booking.payload.bookingDto;

@Service
public class bookingServiceImpl implements bookingService{
	@Autowired
private bookingRepository bookingRepo;
	@Transactional
	@Override
	public void bookingDetails(int age,int roomId,int userId,String checkInString,String checkOutString,String guestName
		     ,String gender,String phone,int noOfGuests,int payableAmount,int maxCapacity,String roomType,int bookingId) {
		booking b=new booking();
		try {
			
			b.setAge(age);
			b.setGender(gender);
			b.setGuestName(guestName);
			b.setPhone(phone);
			b.setRoomId(roomId);
			b.setUserId(userId);
			b.setNoOfGuests(noOfGuests);
		    b.setPayableAmount(payableAmount);
		    b.setMaxCapacity(maxCapacity);
		    b.setRoomType(roomType);
		    b.setBookingId(bookingId);
		 SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
		    b.setCheckInDate(dateFormat.parse(checkInString));
	        b.setCheckOutDate(dateFormat.parse(checkOutString)); 
	       
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		bookingRepo.save(b);
		
	}
	@Override
	public void deleteBooksAftercheckIn(int roomId) {
		bookingRepo.deleteByRoomId(roomId);
		
	}

}
