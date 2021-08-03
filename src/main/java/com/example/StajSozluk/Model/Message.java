package com.example.StajSozluk.Model;
import javax.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)
    private int id;

    @Column(name="receiverId",nullable=false, unique=false)
    private int receiverId;


    @Column(name="messageContent",length=1000, nullable=false, unique=false)
    private String messageContent;

    @ManyToOne(optional = true)
    @JoinColumn(name = "senderId")
    private User user;


    public Message()
    {

    }
    public Message(int receiverId, String messageContent) {

        this.receiverId=receiverId;
        this.messageContent=messageContent;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
}
