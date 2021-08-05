package com.example.StajSozluk.repository;

import com.example.StajSozluk.Model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface IEntryRepository  {

    Entry findById(int id);
    List<Entry> findAll();
    void deleteById(int id);

}
