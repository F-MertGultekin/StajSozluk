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

    @PostMapping("/topic")
    public void addTopic(@RequestBody TopicDto topicDto)
    {
        Topic topic = new Topic(topicDto.getTitle());
        //topic.setId(topicDto.getId());
        topicService.addTopic(topic);
    }
    @DeleteMapping("/topic/{id}")
    public void deleteTopic(@PathVariable int id){
        topicService.deleteTopic(id);
    }
    @PutMapping("/topic/{id}")
    public void updateTopic(@RequestBody TopicDto topicDto, @PathVariable int id)
    {
        Topic topic=topicService.getTopic(id);
        topic.setTitle(topicDto.getTitle());
        topicService.updateTopic(topic);
    }

    @GetMapping("topic")
    public List<Topic> getAllTopics()
    {

        return topicService.getAllTopics();
    }
    @GetMapping("topic/{id}")
    public Topic getTopic(@PathVariable int id)
    {
        System.out.println("controller");
        return topicService.getTopic(id);
    }


}
