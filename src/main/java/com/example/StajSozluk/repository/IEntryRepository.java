package com.example.StajSozluk.repository;

import com.example.StajSozluk.Model.Entry;
import com.example.StajSozluk.Model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface IEntryRepository extends JpaRepository<Entry, Integer> {

    Entry findById(int id);
    List<Entry> findAll();
    void deleteById(int id);
    List<Entry> findByTopicId(int id);
}
