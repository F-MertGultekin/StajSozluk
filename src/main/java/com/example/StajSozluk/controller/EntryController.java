package com.example.StajSozluk.controller;

import com.example.StajSozluk.Model.Entry;
import com.example.StajSozluk.dto.EntryDto;
import com.example.StajSozluk.services.IEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/entry")
public class EntryController
{
    @Autowired
    private IEntryService entryService;


    @PostMapping("/addEntry")
    public void addEntry(@RequestBody EntryDto entryDto)
    {
        exceptionCheck(entryDto);
        entryService.addEntry(entryDto);
    }

    @DeleteMapping("/{entryId}/deleteEntry")
    public void deleteEntry(@PathVariable int entryId)
    {
        entryService.deleteEntry(entryService.getEntry(entryId));
    }

    @PutMapping("/updateEntry")
    public void updateEntry(@RequestBody EntryDto entryDto)
    {
        exceptionCheck(entryDto);
        entryService.updateEntry(entryDto);
    }

    @GetMapping("/{topicId}/getAllEntries")
    public List<Entry> getAllEntries(@PathVariable int topicId)
    {
        return entryService.getAllEntries(topicId);
    }

    @GetMapping("/{entryId}/getEntry")
    public Entry getEntry( @PathVariable int entryId)
    {
        return entryService.getEntry(entryId);
    }



    public void exceptionCheck(EntryDto entryDto)
    {
        //exist mi diye kontrol et 0 dan ziyade
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
