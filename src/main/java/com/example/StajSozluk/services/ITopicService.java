package com.example.StajSozluk.services;

import com.example.StajSozluk.Model.Topic;
import com.example.StajSozluk.dto.TopicDto;

import java.util.List;

public interface ITopicService
{
    void addTopic(TopicDto topicDto);
    void deleteTopic(int id);
    void updateTopic(TopicDto topicDto);
    List<Topic> getAllTopics();
    Topic getTopic(int id);
}
