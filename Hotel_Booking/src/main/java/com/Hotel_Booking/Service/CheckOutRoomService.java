package com.Hotel_Booking.Service;

import java.util.List;

import com.Hotel_Booking.entity.checkInRoom;
import com.Hotel_Booking.entity.checkOutRoom;

public interface CheckOutRoomService {
public List<checkInRoom> checkInDetails();
public void checkOutSave(checkOutRoom checkOutRoom,int roomId);
}
