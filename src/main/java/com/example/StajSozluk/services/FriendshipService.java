package com.example.StajSozluk.services;


import com.example.StajSozluk.Model.Friendship;
import com.example.StajSozluk.Model.User;
import com.example.StajSozluk.dto.FriendshipDto;
import com.example.StajSozluk.repository.IFriendshipRepository;
import com.example.StajSozluk.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FriendshipService implements IFriendshipService
{


    @Autowired
    private IFriendshipRepository friendshipRepository;

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void addFriendship(FriendshipDto friendshipDto)
    {
        User myUser = userRepository.getById(friendshipDto.getMyUserId());
        Friendship friendship1= new Friendship(friendshipDto.getFriendUserId(),myUser);

        User myFriendUser = userRepository.getById(friendshipDto.getFriendUserId());
        Friendship friendship2 = new Friendship(friendshipDto.getMyUserId(),myFriendUser);

        friendshipRepository.save(friendship1);
        friendshipRepository.save(friendship2);

    }

    @Override
    public void deleteFriendship(FriendshipDto friendsDto)
    {
        int myUserId=friendsDto.getMyUserId();
        int myFriendUserId= friendsDto.getFriendUserId();

        Friendship friendship1 = friendshipRepository.findFriendshipByFriendUserId(myUserId);
        Friendship friendship2 = friendshipRepository.findFriendshipByFriendUserId(myFriendUserId);


        friendshipRepository.delete(friendship1);
        friendshipRepository.delete(friendship2);

    }

    @Override
    public List<Friendship> getAllFriends(int myUserId)
    {
        User myUser = userRepository.findById(myUserId);
        List<Friendship> getAllFriends=new ArrayList<>();
        friendshipRepository.findAllByUser(myUser)
                .forEach(getAllFriends::add);
        return getAllFriends;

    }
}
