package com.example.StajSozluk.services;

import com.example.StajSozluk.Model.Message;
import com.example.StajSozluk.dto.MessageDto;

import java.util.List;

public interface IMessageService
{
    void sendMessage(MessageDto messageDto);
    void deleteMessage(int messageId);
    List<Message> getAllMessages(int senderId, int receiverId);
    Message getMessage(int id);
}
