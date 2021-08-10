package com.example.StajSozluk.controller;

import com.example.StajSozluk.Model.Entry;
import com.example.StajSozluk.dto.EntryDto;
import com.example.StajSozluk.services.IEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EntryController
{
    @Autowired
    private IEntryService entryService;


    @PostMapping("/topic/entry/addEntry")
    public void addEntry(@RequestBody EntryDto entryDto)
    {
        exceptionCheck(entryDto);
        entryService.addEntry(entryDto);
    }

    @DeleteMapping("/topic/entry/{entryId}/deleteEntry")
    public void deleteEntry(@PathVariable int entryId)
    {
        entryService.deleteEntry(entryService.getEntry(entryId));
    }

    @PutMapping("/topic/entry/updateEntry")
    public void updateEntry(@RequestBody EntryDto entryDto)
    {
        exceptionCheck(entryDto);
        entryService.updateEntry(entryDto);
    }

    @GetMapping("/topic/{topicId}/entry/getAllEntries")
    public List<Entry> getAllEntries(@PathVariable int topicId)
    {
        return entryService.getAllEntries(topicId);
    }

    @GetMapping("/topic/entry/{entryId}/getEntry")
    public Entry getEntry( @PathVariable int entryId)
    {
        return entryService.getEntry(entryId);
    }



    public void exceptionCheck(EntryDto entryDto)
    {
        if(entryDto.getId()==0)
        {
            throw new NullPointerException("entryId cannot be null");
        }
        /*if(entryDto.getEntryType()!=10||entryDto.getEntryType()!=20||entryDto.getEntryType()!=30)
        {
            throw  new IndexOutOfBoundsException("EntryType can be set only 0 or 1 or 2");

        }*/
        if(entryDto.getPath()==null)
        {
            throw new NullPointerException("path cannot be null");
        }
        if(entryDto.getUserId()==0)
        {
            throw new NullPointerException("userId cannot be null");
        }
        if(entryDto.getTopicId()==0)
        {
            throw new NullPointerException("topicId cannot be null");
        }
    }
}
