package com.Hotel_Booking.Reposistory;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hotel_Booking.entity.Room;

public interface roomRepository extends JpaRepository<Room,Long>{
	@Transactional
public void deleteByRoomId(int roomId);
}
