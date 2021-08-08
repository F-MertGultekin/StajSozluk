package com.example.StajSozluk.services;

import com.example.StajSozluk.Model.Entry;
import com.example.StajSozluk.Model.Topic;

import java.util.List;

public interface IEntryService {

        void addEntry(Entry entry);
        void deleteEntry(Entry entry);
        void updateEntry(Entry entry);
        List<Entry> getAllEntries(int topicId);
        public Entry getEntry(int id);

}
