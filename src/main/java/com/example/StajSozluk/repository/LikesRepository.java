package com.example.StajSozluk.repository;


import com.example.StajSozluk.Model.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface LikesRepository extends JpaRepository<Likes, Integer> {

    Likes findById(int id);
    List<Likes> findAll();
    void deleteById(int id);

}
