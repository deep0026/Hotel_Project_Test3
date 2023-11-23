package com.Hotel_Booking.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel_Booking.Reposistory.checkInRoomRepository;
import com.Hotel_Booking.Reposistory.checkOutRoomRepository;
import com.Hotel_Booking.Reposistory.roomRepository;
import com.Hotel_Booking.entity.Room;
import com.Hotel_Booking.entity.checkInRoom;
import com.Hotel_Booking.entity.checkOutRoom;

@Service
public class checkOutRoomServiceImpl implements CheckOutRoomService{
	
	@Autowired
	private checkInRoomRepository checkInRepo;
	@Autowired
	private checkOutRoomRepository checkOutRepo;
	@Autowired
	private roomRepository repo;


	@Override
	public List<checkInRoom> checkInDetails() {
		List<checkInRoom> findAllForCheckIn = checkInRepo.findAll();
		return findAllForCheckIn;
	}

	@Override
	public void checkOutSave(checkOutRoom checkOutRoom, int roomId) {
		Room r=new Room();
		r.setRoomId(roomId);
		r.setRoomType(checkOutRoom.getRoomType());
		r.setMaxCapacity(checkOutRoom.getMaxCapacity());
		repo.save(r);
		
		 Timestamp timestamp = new Timestamp(new Date().getTime());
		 checkOutRoom.setCheckOutTime(timestamp);
		 checkInRepo.deleteByRoomId(roomId);
		 checkOutRepo.save(checkOutRoom);
		
	}

}
