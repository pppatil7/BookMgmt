package com.practice.services;

import com.practice.dto.UserDto;

public interface UserService {


    UserDto addUser(UserDto userDto);

    UserDto getUserByUserId(Integer userId);


}
