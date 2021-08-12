package com.example.StajSozluk.services;

import com.example.StajSozluk.Model.Message;
import com.example.StajSozluk.Model.User;
import com.example.StajSozluk.dto.MessageDto;
import com.example.StajSozluk.repository.IMessageRepository;
import com.example.StajSozluk.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class MessageService implements IMessageService
{
    @Autowired
    private IMessageRepository messageRepository;

    @Autowired
    private IUserService userService;

    @Override
    public void sendMessage(MessageDto messageDto)
    {
        User senderUser = userService.getUser(messageDto.getUserId());
        Message newMessage = new Message(messageDto.getReceiverId(),messageDto.getMessageContent(),senderUser);
        messageRepository.save(newMessage);
    }

    @Override
    public void deleteMessage(int messageId)
    {
        messageRepository.deleteById(messageId);

    }

    @Override
    public List<Message> getAllMessages(int senderId, int receiverId)
    {
        List<Message> AllMessages = messageRepository.findAll();
        List<Message> getDialogue = new ArrayList<>();
        for (Message message : AllMessages)
        {
            if (message.getUser().getId()==senderId || message.getReceiverId()==receiverId)
            {
                getDialogue.add(message);
            }
            if (message.getUser().getId()==receiverId || message.getReceiverId()==senderId)
            {
                getDialogue.add(message);
            }
        }

        return getDialogue;
    }

    @Override
    public Message getMessage(int id) {
        return messageRepository.findById(id);
    }
}
