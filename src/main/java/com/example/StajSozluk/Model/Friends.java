package com.example.StajSozluk.Model;
import javax.persistence.*;

@Entity
public class Friends
{
    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)
    private int id;


    @Column(name="friendUserId",nullable=false, unique=false)
    private int friendUserId;

    @ManyToOne(optional = true)
    @JoinColumn(name = "myUserId")
    private User user;



    public Friends()
    {

    }
    public Friends(int friendUserId) {

        this.friendUserId=friendUserId;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFriendUserId() {
        return friendUserId;
    }

    public void setFriendUserId(int friendUserId) {
        this.friendUserId = friendUserId;
    }
}
