package com.example.StajSozluk.services;


import com.example.StajSozluk.Model.Friendship;
import com.example.StajSozluk.dto.FriendshipDto;
import java.util.List;

public interface IFriendshipService
{
    void addFriendship(FriendshipDto friendsDto);
    void deleteFriendship(FriendshipDto friendsDto);
    List<Friendship> getAllFriends(int myUserId);

}
