package com.example.StajSozluk.controller;


import com.example.StajSozluk.Model.Topic;
import com.example.StajSozluk.services.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController
{
    @Autowired
    private ITopicService topicService;

    @PostMapping("/topic")
    public void addTopic(@RequestBody Topic newTopic)
    {
        topicService.addTopic(newTopic);
    }
    @DeleteMapping("/topic/{id}")
    public void deleteTopic(@PathVariable int id){
        topicService.deleteTopic(id);
    }
    @PutMapping("/topic/{id}")
    public void updateTopic(@RequestBody Topic updatedTopic, @PathVariable int id)
    {
        topicService.updateTopic(updatedTopic);
    }

    @GetMapping("topic")
    public List<Topic> getAllTopics()
    {
        return topicService.getAllTopics();
    }
    @GetMapping("topic/{id}")
    public Topic getTopic(@PathVariable int id)
    {
        return topicService.getTopic(id);
    }


}
