package com.example.StajSozluk.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;

@Entity
public class Topic
{
    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)
    private int id;

    @Column(name="title",length=100, nullable=false, unique=false)
    private String title;

    @OneToMany(mappedBy = "topic")
    @JsonIgnore
    private List<Entry> entries;

    public Topic(){

    }
    public Topic(String title)
    {
        this.title=title;

    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}
