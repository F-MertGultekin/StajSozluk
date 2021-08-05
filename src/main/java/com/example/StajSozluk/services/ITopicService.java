package com.example.StajSozluk.services;

import com.example.StajSozluk.Model.Topic;

import java.util.List;

public interface ITopicService
{
    void addTopic(Topic topic);
    void deleteTopic(int id);
    void updateTopic(Topic topic);
    List<Topic> getAllTopics();
    public Topic getTopic(int id);
}
