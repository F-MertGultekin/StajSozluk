package com.example.StajSozluk.dto;


public class UserDto
{
    private int id;
    private String mail;
    private String password;
    private String nickname;

    public UserDto(int id,String mail, String password, String nickname) {
        this.id=id;
        this.mail = mail;
        this.password = password;
        this.nickname = nickname;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
