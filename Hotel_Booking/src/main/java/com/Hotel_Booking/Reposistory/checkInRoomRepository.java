package com.Hotel_Booking.Reposistory;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hotel_Booking.entity.checkInRoom;

public interface checkInRoomRepository extends JpaRepository<checkInRoom,Integer>{
	@Transactional
	public void deleteByRoomId(int roomId);
}
