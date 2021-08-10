package com.example.StajSozluk.dto;

public class MessageDto {
    private int id;
    private int receiverId;
    private String messageContent;
    private int senderId;

    public MessageDto(int id,int receiverId, String messageContent, int senderId) {
        this.id=id;
        this.receiverId = receiverId;
        this.messageContent = messageContent;
        this.senderId = senderId;
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

    public int getUserId() {
        return senderId;
    }

    public void setUserId(int senderId) {
        this.senderId = senderId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
