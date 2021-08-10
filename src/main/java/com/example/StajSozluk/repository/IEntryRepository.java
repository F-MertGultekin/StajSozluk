package com.example.StajSozluk.repository;

import com.example.StajSozluk.Model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface IEntryRepository extends JpaRepository<Entry, Integer> {

    Entry findById(int id);
    List<Entry> findAll();
    List<Entry> findByTopicId(int id);
}
