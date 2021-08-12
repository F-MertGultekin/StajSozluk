package com.example.StajSozluk.services;

import com.example.StajSozluk.EnumFile.EntryType;
import com.example.StajSozluk.Model.Entry;
import com.example.StajSozluk.Model.Topic;
import com.example.StajSozluk.Model.User;
import com.example.StajSozluk.dto.EntryDto;
import com.example.StajSozluk.repository.IEntryRepository;
import com.example.StajSozluk.repository.ITopicRepository;
import com.example.StajSozluk.repository.IUserRepository;
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

    //BURADA SERVİCEDEN ÇEKMELİSİN TOPİC VE USER İÇİN
    @Autowired
    private ITopicService topicService;

    @Autowired
    private IUserService userService;

    @Override
    public void addEntry(EntryDto entryDto)
    {
        Topic topic = topicService.getTopic(entryDto.getTopicId());
        User user = userService.getUser(entryDto.getUserId());
        Entry newEntry = new Entry(entryDto.getPath(), EntryType.values()[entryDto.getEntryType()],user,topic);
        entryRepository.save(newEntry);
    }

    @Override
    public void deleteEntry(Entry entry) {

        entryRepository.delete(entry);
    }

    @Override
    public void updateEntry(EntryDto entryDto)
    {

        Entry entry=entryRepository.findById(entryDto.getId());
        entry.setPath(entryDto.getPath());
        entry.setEntryType(EntryType.values()[entryDto.getEntryType()]);
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
    public Entry getEntry(int entryId)
    {

        return entryRepository.findById(entryId);
    }

}
