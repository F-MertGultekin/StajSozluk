package com.example.StajSozluk.Model;

import com.example.StajSozluk.EnumFile.EntryType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Entry")
public class Entry {

    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)
    private int id;

    @Column(name="path",length=100, nullable=false, unique=false)
    private String path;

    @Column(name="entryType",nullable=false, unique=false)
    @Enumerated(EnumType.STRING)
    private EntryType entryType;


    @ManyToOne(optional = true)
    @JoinColumn(name = "userId")
    private User user;


    @ManyToOne(optional = true)
    @JoinColumn(name = "topicId")
    private Topic topic;

    @OneToMany(mappedBy = "entry")
    @JsonIgnore()
    private List<Interaction> likes;

    public Entry(){

    }
    public Entry(String path, EntryType entryType,User user, Topic topic)
    {

        this.path=path;
        this.entryType=entryType;
        this.user=user;
        this.topic=topic;

    }

    public String getPath() {
        return path;
    }

    public EntryType getEntryType() {
        return entryType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setEntryType(EntryType entryType) {
        this.entryType = entryType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public List<Interaction> getLikes() {
        return likes;
    }

    public void setLikes(List<Interaction> likes) {
        this.likes = likes;
    }
}
