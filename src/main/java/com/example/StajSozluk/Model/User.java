package com.example.StajSozluk.Model;
import javax.persistence.*;
import java.util.List;

@Entity
public class User
{
    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)
    private int id;


    @Column(name="mail",length=100, nullable=false, unique=true)
    private String mail;

    @Column(name="password",length=100, nullable=false, unique=false)
    private String password;

    @Column(name="nickname",length=100, nullable=false, unique=true)
    private String nickname;


    @OneToMany(mappedBy = "user")
    private List<Entry> entries;

    @OneToMany(mappedBy = "user")
    private List<Likes> likes;

    @OneToMany(mappedBy = "user")
    private List<Friends> friendsList;

    @OneToMany(mappedBy = "user")
    private List<Message> messageList;


    public User(){

    }
    public User(String mail,String password,String nickname)
    {
        this.mail=mail;
        this.password=password;
        this.nickname=nickname;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
