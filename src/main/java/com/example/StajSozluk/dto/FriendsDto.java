package com.example.StajSozluk.dto;


public class FriendsDto
{
    private int id;
    private int friendUserId;
    private int myUserId;


    public FriendsDto(int id,int friendUserId, int myUserId) {
        this.id=id;
        this.friendUserId = friendUserId;
        this.myUserId = myUserId;

    }

    public int getFriendUserId() {
        return friendUserId;
    }

    public void setFriendUserId(int friendUserId) {
        this.friendUserId = friendUserId;
    }

    public int getUser() {
        return myUserId;
    }

    public void setUser(int user) {
        this.myUserId = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
