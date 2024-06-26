package com.example.StajSozluk.services;


import com.example.StajSozluk.Model.Friendship;
import com.example.StajSozluk.Model.User;
import com.example.StajSozluk.dto.FriendshipDto;
import com.example.StajSozluk.repository.IFriendshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class FriendshipService implements IFriendshipService
{


    @Autowired
    private IFriendshipRepository friendshipRepository;

    @Autowired
    private IUserService userService;

    @Override
    public void addFriendship(FriendshipDto friendshipDto)
    {
        User myUser = userService.getUser(friendshipDto.getMyUserId());
        Friendship friendship1= new Friendship(friendshipDto.getFriendUserId(),myUser);

        User myFriendUser = userService.getUser(friendshipDto.getFriendUserId());
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
        User myUser = userService.getUser(myUserId);
        List<Friendship> getAllFriends=new ArrayList<>();
        friendshipRepository.findAllByUser(myUser)
                .forEach(getAllFriends::add);
        return getAllFriends;

    }
}
