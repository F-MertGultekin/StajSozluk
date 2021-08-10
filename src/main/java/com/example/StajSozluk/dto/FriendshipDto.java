package com.example.StajSozluk.dto;


public class FriendshipDto
{
    private int id;
    private int myFriendUserId;
    private int myUserId;


    public FriendshipDto(int id,int friendUserId, int myUserId) {
        this.id=id;
        this.myFriendUserId = friendUserId;
        this.myUserId = myUserId;

    }

    public int getFriendUserId() {
        return myFriendUserId;
    }

    public void setFriendUserId(int friendUserId) {
        this.myFriendUserId = myFriendUserId;
    }

    public int getMyUserId() {
        return myUserId;
    }

    public void setMyUserId(int user) {
        this.myUserId = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
