package com.example.StajSozluk.Model;
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
    private List<Entry> entries;



    public Topic(){

    }
    public Topic(String title)
    {
        this.title=title;

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
}
