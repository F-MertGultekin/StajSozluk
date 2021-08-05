package com.example.StajSozluk.repository;


import com.example.StajSozluk.Model.UserInteraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ILikesRepository {

    UserInteraction findById(int id);
    List<UserInteraction> findAll();
    void deleteById(int id);

}
