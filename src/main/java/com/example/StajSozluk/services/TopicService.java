package com.example.StajSozluk.services;

import com.example.StajSozluk.Model.Topic;
import com.example.StajSozluk.repository.ITopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class TopicService implements ITopicService
{
    @Autowired
    private ITopicRepository topicRepository;

    @Override
    public void addTopic(Topic topic)
    {

        topicRepository.save(topic);
    }
    @Override
    public void deleteTopic(int id){
        topicRepository.deleteById(id);
    }
    @Override
    public void updateTopic(Topic topic)
    {
        // It is same with addTopic function but save method add if topic is not found, update if topic is found
        topicRepository.save(topic);
    }
    @Override
    public List<Topic> getAllTopics()
    {

        return topicRepository.findAll();
    }
    @Override
    public Topic getTopic(int id)
    {
        System.out.println("service");
        return topicRepository.findById(id);
    }
}
