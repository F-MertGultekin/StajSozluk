package com.example.StajSozluk.repository;

import com.example.StajSozluk.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

    User findById(int id);
    List<User> findAll();
    void deleteById(int id);

}
