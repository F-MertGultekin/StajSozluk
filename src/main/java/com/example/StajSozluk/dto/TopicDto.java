package com.example.StajSozluk.dto;

public class TopicDto
{
    private int id;
    private String title;

    public TopicDto(){

    }
    public TopicDto(int id,String title) {
        this.title = title;
        this.id=id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
