package com.Hotel_Booking.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="Admin")
public class Admin {
    @Id
    private int id;
    @Column(name="userName" ,nullable = false)
    private String userName;
    @Column(name="password", nullable = false)
    private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
