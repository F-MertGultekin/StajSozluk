package com.example.StajSozluk.services;

import com.example.StajSozluk.Model.Topic;
import com.example.StajSozluk.dto.TopicDto;
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
    public void addTopic(TopicDto topicDto)
    {
        Topic topic = new Topic(topicDto.getTitle());
        topicRepository.save(topic);
    }
    @Override
    public void deleteTopic(int id){
        topicRepository.deleteById(id);
    }
    @Override
    public void updateTopic(TopicDto topicDto)
    {
        Topic topic=topicRepository.findById(topicDto.getId());
        topic.setTitle(topicDto.getTitle());
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
