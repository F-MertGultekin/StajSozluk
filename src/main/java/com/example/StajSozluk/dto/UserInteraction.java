package com.example.StajSozluk.dto;

import com.example.StajSozluk.EnumFile.UserInteractionType;




public class UserInteraction {

    private int id;
    private boolean favourite;
    private UserInteractionType UserInteractionType;
    private UserDto user;
    private EntryDto entry;
    //dto yerine idler gelcek
    public UserInteraction(int id,boolean favourite, com.example.StajSozluk.EnumFile.UserInteractionType userInteractionType, UserDto user, EntryDto entry) {
        this.favourite = favourite;
        UserInteractionType = userInteractionType;
        this.user = user;
        this.entry = entry;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public com.example.StajSozluk.EnumFile.UserInteractionType getUserInteractionType() {
        return UserInteractionType;
    }

    public void setUserInteractionType(com.example.StajSozluk.EnumFile.UserInteractionType userInteractionType) {
        UserInteractionType = userInteractionType;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public EntryDto getEntry() {
        return entry;
    }

    public void setEntry(EntryDto entry) {
        this.entry = entry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
