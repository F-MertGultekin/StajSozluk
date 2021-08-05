package com.example.StajSozluk.repository;


import com.example.StajSozluk.Model.Friends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface IFriendsRepository{

    Friends findById(int id);
    List<Friends> findAll();
    void deleteById(int id);

}

