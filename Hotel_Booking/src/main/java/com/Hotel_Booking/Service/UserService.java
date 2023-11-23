package com.Hotel_Booking.Service;

import com.Hotel_Booking.entity.User;

public interface UserService {
void register(User user);
User exist(String email);
User loginVerify(String email, String password);
}
