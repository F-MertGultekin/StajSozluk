package com.example.StajSozluk.services;

import com.example.StajSozluk.Model.Entry;
import com.example.StajSozluk.repository.IEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class EntryService implements IEntryService
{
    @Autowired
    private IEntryRepository entryRepository;

    @Override
    public void addEntry(Entry entry)
    {

        //entry.getTopic().getEntries().add(entry);
        entryRepository.save(entry);
    }

    @Override
    public void deleteEntry(Entry entry) {
        entry.getTopic().getEntries().remove(entry);
        entryRepository.delete(entry);
    }



    //????????????????????????????????????
    @Override
    public void updateEntry(Entry entry)
    {
        entryRepository.save(entry);
    }

    @Override
    public List<Entry> getAllEntries(int topicId)
    {
        List<Entry> allEntries=new ArrayList<>();
                entryRepository.findByTopicId(topicId)
                        .forEach(allEntries::add);
        return allEntries;
    }

    @Override
    public Entry getEntry(int id) {
        return entryRepository.findById(id);
    }

}
