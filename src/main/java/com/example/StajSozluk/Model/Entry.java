package com.example.StajSozluk.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Entry")
public class Entry {

    public enum type
    {
        audio,
        text,
        video
    }
    // Primary ID which increments
    // automatically when new entry
    // is added into the database
    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)
    private int id;



    @Column(name="path",length=100, nullable=false, unique=false)
    private String path;

    @Column(name="entryType",nullable=false, unique=false)
    @Enumerated(EnumType.STRING)
    private type entryType;

    @ManyToOne(optional = true)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "topicId")
    private Topic topic;

    @OneToMany(mappedBy = "entry")
    private List<Likes> likes;




    public Entry(){

    }
    public Entry(String path, type entryType)
    {

        this.path=path;
        this.entryType=entryType;
    }

    public String getPath() {
        return path;
    }

    public type getEntryType() {
        return entryType;
    }

}
