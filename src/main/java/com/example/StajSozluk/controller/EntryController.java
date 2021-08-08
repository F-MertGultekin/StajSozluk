package com.example.StajSozluk.controller;


import com.example.StajSozluk.EnumFile.EntryType;
import com.example.StajSozluk.Model.Entry;
import com.example.StajSozluk.Model.Topic;
import com.example.StajSozluk.Model.User;
import com.example.StajSozluk.dto.EntryDto;
import com.example.StajSozluk.services.IEntryService;
import com.example.StajSozluk.services.ITopicService;
import com.example.StajSozluk.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EntryController
{
    @Autowired
    private IEntryService entryService;

    @Autowired
    private ITopicService topicService;

    @Autowired
    private IUserService userService;

    @PostMapping("/topic/{topicId}/entry")
    public void addEntry(@RequestBody EntryDto entryDto, @PathVariable int topicId)
    {
        Topic topic=topicService.getTopic(topicId);
        System.out.println(entryDto.getTopicId());
        System.out.println(topicId);

        User user = userService.getUser(entryDto.getUserId());
        System.out.println(entryDto.getUserId());
        Entry newEntry = new Entry(entryDto.getPath(), EntryType.valueOf(entryDto.getEntryType()),user,topic);
        //System.out.println(newEntry.getUser().getId());
        entryService.addEntry(newEntry);
    }

    @DeleteMapping("/topic/{topicId}/entry/{entryId}")
    public void deleteEntry(@PathVariable int entryId, @PathVariable int topicId)
    {
        entryService.deleteEntry(entryService.getEntry(entryId));
    }

    @PutMapping("/topic/{topicId}/entry/{entryId}")
    public void updateEntry(@RequestBody EntryDto entryDto, @PathVariable int entryId, @PathVariable int topicId)
    {

        Entry entry=entryService.getEntry(entryId);
        entry.setPath(entryDto.getPath());

        entry.setEntryType(EntryType.valueOf(entryDto.getEntryType()));
        entryService.updateEntry(entry);
    }

    @GetMapping("/topic/{topicId}/entry/")
    public List<Entry> getAllEntries(@PathVariable int topicId)
    {
        return entryService.getAllEntries(topicId);
    }

    @GetMapping("/topic/{topicId}/entry/{entryId}")
    public Entry getEntry(@PathVariable int topicId, @PathVariable int entryId)
    {
        return entryService.getEntry(entryId);
    }
}
