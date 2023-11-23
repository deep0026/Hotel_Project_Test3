package com.Hotel_Booking.Reposistory;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hotel_Booking.entity.Admin;

public interface AdminReposistory extends JpaRepository<Admin,Integer>{
	@Transactional
public Admin findByUserNameAndPassword(String name,String password);
}
