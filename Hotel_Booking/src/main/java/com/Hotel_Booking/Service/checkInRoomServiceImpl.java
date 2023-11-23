package com.Hotel_Booking.Service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel_Booking.Reposistory.checkInRoomRepository;
import com.Hotel_Booking.entity.checkInRoom;
@Service
public class checkInRoomServiceImpl implements checkInRoomService{

	@Autowired
	private checkInRoomRepository checkInRepo;
	@Override
	public void checkInRooms(checkInRoom checkInRoom) {
		 Timestamp timestamp = new Timestamp(new Date().getTime());
		 checkInRoom.setTimestamp(timestamp);
		 checkInRepo.save(checkInRoom);
		 
		
	}

}
