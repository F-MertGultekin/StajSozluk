package com.example.StajSozluk.dto;


public class FriendsDto
{
    private int id;
    private int friendUserId;
    private UserDto user;

    //User dto yerine user id olacak
    public FriendsDto(int id,int friendUserId, UserDto user) {
        this.friendUserId = friendUserId;
        this.user = user;
        this.id=id;
    }

    public int getFriendUserId() {
        return friendUserId;
    }

    public void setFriendUserId(int friendUserId) {
        this.friendUserId = friendUserId;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
