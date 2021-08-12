package com.example.StajSozluk.controller;

import com.example.StajSozluk.Model.User;
import com.example.StajSozluk.dto.UserDto;
import com.example.StajSozluk.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private IUserService userService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody UserDto userDto)
    {
        userService.addUser(userDto);
    }
    @DeleteMapping("/{userId}/deleteUser")
    public void deleteUser(@PathVariable int userId)
    {
        userService.deleteUser(userId);
    }
    @PutMapping("/updateUser")
    public void updateUser(@RequestBody UserDto userDto)
    {
        userService.updateUser(userDto);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}/getUser")
    public User getUser(@PathVariable int userId)
    {
        return userService.getUser(userId);
    }

}
