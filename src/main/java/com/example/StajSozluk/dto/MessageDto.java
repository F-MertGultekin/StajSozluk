package com.example.StajSozluk.dto;

public class MessageDto {
    private int id;
    private int receiverId;
    private String messageContent;
    private UserDto user;

    //User dto yerine user id olacak
    public MessageDto(int id,int receiverId, String messageContent, UserDto user) {
        this.receiverId = receiverId;
        this.messageContent = messageContent;
        this.user = user;
        this.id=id;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
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
