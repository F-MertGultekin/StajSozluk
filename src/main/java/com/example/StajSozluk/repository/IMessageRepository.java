package com.example.StajSozluk.repository;

import com.example.StajSozluk.Model.Entry;
import com.example.StajSozluk.Model.Message;
import com.example.StajSozluk.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface IMessageRepository extends JpaRepository<Message, Integer>{

    Message findById(int id);
    List<Message> findAll();
    void deleteById(int id);
    List<Message> findAllByReceiverIdAndSenderUser(int receiverId, User senderUser);

}
