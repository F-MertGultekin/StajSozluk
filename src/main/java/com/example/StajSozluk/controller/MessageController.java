package com.example.StajSozluk.controller;


import com.example.StajSozluk.Model.Message;

import com.example.StajSozluk.dto.MessageDto;
import com.example.StajSozluk.services.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MessageController
{
    @Autowired
    private IMessageService messageService;

    @PostMapping("/message/sendMessage")
    public void sendMessage(@RequestBody MessageDto messageDto)
    {
        messageService.sendMessage(messageDto);

    }
    @DeleteMapping("/message/{messageId}/deleteMessage")
    public void deleteMessage(@PathVariable int messageId)
    {
        messageService.deleteMessage(messageId);

    }
    @GetMapping("/message/getAllMessages/{senderId}/{receiverId}")
    public List<Message> getAllMessages(@PathVariable int senderId, @PathVariable int receiverId)
    {
        return messageService.getAllMessages(senderId,receiverId);
    }


    @GetMapping("/message/{messageId}/getMessage")
    public Message getMessage(@PathVariable int messageId)
    {
        return messageService.getMessage(messageId);
    }



}
