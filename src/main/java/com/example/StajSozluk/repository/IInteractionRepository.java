package com.example.StajSozluk.repository;


import com.example.StajSozluk.Model.Friends;
import com.example.StajSozluk.Model.Interaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface IInteractionRepository extends JpaRepository<Interaction, Integer> {

    Interaction findById(int id);
    List<Interaction> findAll();
    void deleteById(int id);
    List<Interaction> findAllByEntryId(int entryId);
    List<Interaction> findAllByUserId(int userId);
}
