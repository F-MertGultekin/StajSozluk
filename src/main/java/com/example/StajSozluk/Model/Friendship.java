package com.example.StajSozluk.Model;
import javax.persistence.*;

@Entity
public class Friendship
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



    public Friendship()
    {

    }

    public Friendship(int friendUserId,User user) {

        this.friendUserId=friendUserId;
        this.user=user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
