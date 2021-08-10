package com.example.StajSozluk.controller;


import com.example.StajSozluk.Model.User;
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

    @PostMapping("/user/addUser")
    public void addUser(@RequestBody UserDto userDto)
    {

        userService.addUser(userDto);
    }
    @DeleteMapping("/user/{userId}/deleteUser")
    public void deleteUser(@PathVariable int userId)
    {
        userService.deleteUser(userId);
    }
    @PutMapping("/user/updateUser")
    public void updateUser(@RequestBody UserDto userDto)
    {

        userService.updateUser(userDto);
    }

    @GetMapping("/user/getAllUsers")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{userId}/getUser")
    public User getUser(@PathVariable int userId)
    {

        return userService.getUser(userId);
    }

}
