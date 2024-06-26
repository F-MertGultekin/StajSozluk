package com.example.StajSozluk.repository;

import com.example.StajSozluk.Model.Topic;
import com.example.StajSozluk.dto.TopicDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ITopicRepository extends JpaRepository<Topic, Integer> {

    Topic findById(int id);
    List<Topic> findAll();
    void deleteById(int id);


}
