package com.example.StajSozluk.services;

import com.example.StajSozluk.Model.Entry;
import com.example.StajSozluk.Model.User;

import java.util.List;

public interface IUserService {

    void addUser(User user);
    void deleteUser(int user);
    void updateUser(User user);
    List<User> getAllUsers();
    public User getUser(int id);
}
