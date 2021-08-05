package com.example.StajSozluk.Model;

import com.example.StajSozluk.EnumFile.EntryType;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Entry")
public class Entry {


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
    private EntryType entryType;

    @ManyToOne(optional = true)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "topicId")
    private Topic topic;

    @OneToMany(mappedBy = "entry")
    private List<UserInteraction> likes;




    public Entry(){

    }
    public Entry(String path, EntryType entryType)
    {

        this.path=path;
        this.entryType=entryType;
    }

    public String getPath() {
        return path;
    }

    public EntryType getEntryType() {
        return entryType;
    }

}
