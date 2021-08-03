package com.example.StajSozluk.repository;

import com.example.StajSozluk.Model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {

    Topic findById(int id);
    List<Topic> findAll();
    void deleteById(int id);

}
