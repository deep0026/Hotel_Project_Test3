package com.Hotel_Booking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel_Booking.Reposistory.UserRepository;
import com.Hotel_Booking.entity.User;
@Service
public class UserServiceImpl implements UserService{
 @Autowired
 private UserRepository repo;
	@Override
	public void register(User user) {
	
		repo.save(user);
	}
	@Override
	public User exist(String email) {
		 User exist = repo.findByemail(email);
		return exist;
	}
	@Override
	public User loginVerify(String email, String password) {
		User loginCheck = repo.findByEmailAndPassword(email, password);
		return loginCheck;
	}

}
