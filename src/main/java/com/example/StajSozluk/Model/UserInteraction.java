package com.example.StajSozluk.Model;

import com.example.StajSozluk.EnumFile.UserInteractionType;
import javax.persistence.*;
import com.example.StajSozluk.EnumFile.*;

@Entity
public class UserInteraction {

    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)
    private int id;




    @Column(name="favourite",nullable=true, unique=false)
    private boolean favourite;


    @Column(name="UserInteractionType",nullable=true, unique=false)
    @Enumerated(EnumType.STRING)
    private UserInteractionType UserInteractionType;


    @ManyToOne(optional = true)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(optional = true)
    @JoinColumn(name = "entryId")
    private Entry entry;


    public UserInteraction()
    {

    }
    public UserInteraction(boolean favourite, UserInteractionType UserInteractionType) {

        this.favourite=favourite;
        this.UserInteractionType=UserInteractionType;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public UserInteractionType getLikeType() {
        return UserInteractionType;
    }

    public void setLikeType(UserInteractionType likeType) {
        this.UserInteractionType = likeType;
    }


}
