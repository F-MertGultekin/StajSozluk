package com.example.StajSozluk.services;


import com.example.StajSozluk.Model.User;
import com.example.StajSozluk.dto.UserDto;

import java.util.List;

public interface IUserService {

    void addUser(UserDto userDto);
    void deleteUser(int user);
    void updateUser(UserDto userDto);
    List<User> getAllUsers();
    User getUser(int id);
}
