package com.Hotel_Booking.Reposistory;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hotel_Booking.entity.booking;
@Transactional
public interface bookingRepository extends JpaRepository<booking,Integer>{
public List<booking> findAllByuserId(int userId);
@Transactional
public void deleteByRoomId(int roomId);

}
