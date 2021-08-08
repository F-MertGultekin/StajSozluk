package com.example.StajSozluk.controller;

import com.example.StajSozluk.EnumFile.EntryType;
import com.example.StajSozluk.Model.Entry;
import com.example.StajSozluk.Model.User;
import com.example.StajSozluk.dto.EntryDto;
import com.example.StajSozluk.dto.UserDto;
import com.example.StajSozluk.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private IUserService userService;

    @PostMapping("/user")
    public void addUser(@RequestBody UserDto userDto)
    {
        User user = new User(userDto.getMail(),userDto.getPassword(),userDto.getNickname());
        userService.addUser(user);
    }
    @DeleteMapping("/user/{userId}")
    public void deleteUser(@PathVariable int userId)
    {
        userService.deleteUser(userId);
    }
    @PutMapping("/user/{userId}")
    public void updateUser(@RequestBody UserDto userDto, @PathVariable int userId)
    {
        User user= userService.getUser(userId);
        user.setMail(userDto.getMail());
        user.setPassword(userDto.getPassword());
        user.setNickname(userDto.getNickname());
        userService.updateUser(user);
    }

    @GetMapping("/user")
    public List<User> getAllUsers(@PathVariable int userId)
    {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable int userId)
    {

        return userService.getUser(userId);
    }

}
