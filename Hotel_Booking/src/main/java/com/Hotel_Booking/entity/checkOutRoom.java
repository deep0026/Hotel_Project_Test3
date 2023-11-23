package com.Hotel_Booking.entity;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "checkOutRoom")
public class checkOutRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

     private int roomId;
     private int userId;

    public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "check_in_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date checkInDate;

    @Column(name = "check_out_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date checkOutDate;

    @Column(name = "guest_name")
    private String guestName;
    @Column(name="age")
    private int age;
    @Column(name="phone")
    private String phone;
    @Column(name="gender")
    private String gender;
    @Column(name="noOfGuests")
    private int noOfGuests;
    @Column(name="payableAmount")
    private int payableAmount;
    @Column(name="maxCapacity")
    private int maxCapacity;
    private int bookingId;

    @Column(name = "checkInTime")
    private Timestamp timestamp;
    public Timestamp getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(Timestamp checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	@Column(name="checkOutTime")
    private Timestamp checkOutTime;
    public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	@Column(name="roomType")
    private String roomType;
    
	

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getPayableAmount() {
		return payableAmount;
	}

	public void setPayableAmount(int payableAmount) {
		this.payableAmount = payableAmount;
	}

	public int getNoOfGuests() {
		return noOfGuests;
	}

	public void setNoOfGuests(int noOfGuests) {
		this.noOfGuests = noOfGuests;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
