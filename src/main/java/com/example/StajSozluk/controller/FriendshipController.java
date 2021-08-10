package com.example.StajSozluk.controller;


import com.example.StajSozluk.Model.Friendship;
import com.example.StajSozluk.dto.FriendshipDto;
import com.example.StajSozluk.services.IFriendshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FriendshipController
{
    @Autowired
    private IFriendshipService friendshipService;

    @PostMapping("/friendship/addfriendship")
    public void addFriendship(@RequestBody FriendshipDto friendshipDto)
    {
        friendshipService.addFriendship(friendshipDto);

    }
    @DeleteMapping("/friendship/deletefriendship")
    public void deleteFriendship(@RequestBody FriendshipDto friendshipDto)
    {
        friendshipService.deleteFriendship(friendshipDto);
    }
    @GetMapping("/friendship/{myUserId}/getAllFriends")
    public List<Friendship> getAllFriends(@PathVariable int myUserId)
    {
        return friendshipService.getAllFriends(myUserId);

    }

}
