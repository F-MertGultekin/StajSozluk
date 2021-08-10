package com.example.StajSozluk.services;

import com.example.StajSozluk.Model.Entry;
import com.example.StajSozluk.dto.EntryDto;

import java.util.List;

public interface IEntryService {

        void addEntry(EntryDto entryDto);
        void deleteEntry(Entry entry);
        void updateEntry(EntryDto entryDto);
        List<Entry> getAllEntries(int topicId);
        Entry getEntry(int id);

}
