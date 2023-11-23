package com.Hotel_Booking.Service;

import java.util.List;

import javax.transaction.Transactional;

import com.Hotel_Booking.entity.Room;
import com.Hotel_Booking.entity.booking;

public interface roomService {
public List<Room> rooms();
public void deleteRoom(int roomId);
public List<booking> myBookings(int userId);
public void bookingCancellation(int roomId);
@Transactional
public void addRoomBack(int roomId,int maxCapacity,String roomType);
}
