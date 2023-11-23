package com.Hotel_Booking.payload;


import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

//import com.Hotel_Booking.entity.Room;

import java.util.Date;

public class bookingDto {
    
	 private int roomId;

	    
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date checkInDate;

	  
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date checkOutDate;

	    private String guestName;
	    private int age;
	    private String phone;
	    private String gender;
		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		public Date getCheckInDate() {
			return checkInDate;
		}

		public void setCheckInDate(Date checkInDate) {
			this.checkInDate = checkInDate;
		}

		public Date getCheckOutDate() {
			return checkOutDate;
		}

		public void setCheckOutDate(Date checkOutDate) {
			this.checkOutDate = checkOutDate;
		}

		public String getGuestName() {
			return guestName;
		}

		public void setGuestName(String guestName) {
			this.guestName = guestName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getRoomId() {
			return roomId;
		}

		public void setRoomId(int roomId) {
			this.roomId = roomId;
		}

	}
