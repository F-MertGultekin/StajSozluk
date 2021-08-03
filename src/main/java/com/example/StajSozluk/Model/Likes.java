package com.example.StajSozluk.Model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Likes {



    public enum likeType
    {
        like,
        dontlike

    }
    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)
    private int id;




    @Column(name="favourite",nullable=true, unique=false)
    private boolean favourite;


    @Column(name="likeType",nullable=true, unique=false)
    @Enumerated(EnumType.STRING)
    private likeType likeType;


    @ManyToOne(optional = true)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(optional = true)
    @JoinColumn(name = "entryId")
    private Entry entry;






    public Likes()
    {

    }
    public Likes(boolean favourite, Likes.likeType likeType) {


        this.favourite=favourite;
        this.likeType=likeType;

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

    public Likes.likeType getLikeType() {
        return likeType;
    }

    public void setLikeType(Likes.likeType likeType) {
        this.likeType = likeType;
    }
}
