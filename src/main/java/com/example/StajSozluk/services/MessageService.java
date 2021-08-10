package com.example.StajSozluk.services;

import com.example.StajSozluk.Model.Friendship;
import com.example.StajSozluk.Model.Message;
import com.example.StajSozluk.Model.User;
import com.example.StajSozluk.dto.MessageDto;
import com.example.StajSozluk.repository.IMessageRepository;
import com.example.StajSozluk.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService implements IMessageService
{
    @Autowired
    private IMessageRepository messageRepository;

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void sendMessage(MessageDto messageDto)
    {
        User senderUser = userRepository.findById(messageDto.getUserId());
        Message newMessage = new Message(messageDto.getReceiverId(),messageDto.getMessageContent(),senderUser);
        messageRepository.save(newMessage);
    }

    @Override
    public void deleteMessage(int messageId)
    {
        messageRepository.deleteById(messageId);

    }
    //Hatalı hiçbirşey dönmüyor
    @Override
    public List<Message> getAllMessages(int senderId, int receiverId)
    {
        User senderUser= userRepository.findById(receiverId);
        return messageRepository.findAllByReceiverIdAndSenderUser(receiverId,senderUser);
    }

    @Override
    public Message getMessage(int id) {
        return messageRepository.findById(id);
    }
}
