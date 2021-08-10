package com.example.StajSozluk.Model;

import com.example.StajSozluk.EnumFile.InteractionType;


import javax.persistence.*;

@Entity
public class Interaction {

    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)
    private int id;


    @Column(name="favourite",nullable=true, unique=false)
    private boolean favourite;


    @Column(name="UserInteractionType",nullable=true, unique=false)
    @Enumerated(EnumType.STRING)
    private InteractionType interactionType;

/*

JSONIGNORE gerekebilir entryde kullandığımız gibi Hem user için hem entry için gerekebilir.

 */
    @ManyToOne(optional = true)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(optional = true)
    @JoinColumn(name = "entryId")
    private Entry entry;


    public Interaction()
    {

    }
    public Interaction(boolean favourite, InteractionType interactionType, User user, Entry entry) {

        this.favourite=favourite;
        this.interactionType=interactionType;
        this.user=user;
        this.entry=entry;

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

    public InteractionType getInteractionType() {
        return interactionType;
    }

    public void setInteractionType(InteractionType interactionType) {
        this.interactionType = interactionType;
    }





    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }
}
