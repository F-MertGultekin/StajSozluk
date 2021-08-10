package com.example.StajSozluk.controller;


import com.example.StajSozluk.Model.Topic;
import com.example.StajSozluk.dto.TopicDto;
import com.example.StajSozluk.services.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class TopicController
{
    @Autowired
    private ITopicService topicService;

    @PostMapping("/topic/addTopic")
    public void addTopic(@RequestBody TopicDto topicDto)
    {
        topicService.addTopic(topicDto);
    }
    @DeleteMapping("/topic/{id}/deleteTopic")
    public void deleteTopic(@PathVariable int id){
        topicService.deleteTopic(id);
    }
    @PutMapping("/topic/updateTopic")
    public void updateTopic(@RequestBody TopicDto topicDto)
    {

        topicService.updateTopic(topicDto);
    }

    @GetMapping("/topic/getAllTopics")
    public List<Topic> getAllTopics()
    {

        return topicService.getAllTopics();
    }
    @GetMapping("/topic/{id}/getTopic")
    public Topic getTopic(@PathVariable int id)
    {

        return topicService.getTopic(id);
    }


}
