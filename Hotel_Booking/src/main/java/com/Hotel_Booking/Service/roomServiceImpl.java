package com.Hotel_Booking.Service;

import java.util.List; 
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel_Booking.Reposistory.bookingRepository;
import com.Hotel_Booking.Reposistory.roomRepository;
import com.Hotel_Booking.entity.Room;
import com.Hotel_Booking.entity.booking;

@Service
public class roomServiceImpl implements roomService{

	@Autowired
     private roomRepository roomRepo;
	@Autowired
	private bookingRepository bookingRepo;
	@Transactional
	@Override
	public List<Room> rooms() {
				List<Room> rooms = roomRepo.findAll();
				
		return rooms;
		
	}
	@Transactional
	@Override
	public void deleteRoom(int roomId) {
		roomRepo.deleteByRoomId(roomId);
	}
	@Override
	public List<booking> myBookings(int userId) {
	  List<booking> findAllByuserId = bookingRepo.findAllByuserId(userId);
		return findAllByuserId;
	}
	@Override
	public void bookingCancellation(int roomId) {
		bookingRepo.deleteByRoomId(roomId);
		
	}
	@Transactional
	@Override
	public void addRoomBack(int roomId, int maxCapacity, String roomType) {
		Room room=new Room();
		room.setRoomId(roomId);
		room.setMaxCapacity(maxCapacity);
		room.setRoomType(roomType);
		roomRepo.save(room);
		
	}

}
