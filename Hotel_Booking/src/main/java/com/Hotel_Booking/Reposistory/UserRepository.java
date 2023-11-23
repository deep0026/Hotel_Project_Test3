package com.Hotel_Booking.Reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Hotel_Booking.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
 public User findByemail(String name);
 public User findByEmailAndPassword(String email,String password);
}
