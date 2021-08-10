package com.example.StajSozluk.repository;


import com.example.StajSozluk.Model.Friendship;
import com.example.StajSozluk.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface IFriendshipRepository extends JpaRepository<Friendship, Integer>{

    Friendship findById(int id);
    Friendship findFriendshipByFriendUserId(int myFriendUserId);
    List<Friendship> findAllByUser(User user);
    void deleteById(int id);

}

