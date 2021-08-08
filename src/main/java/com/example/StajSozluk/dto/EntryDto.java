package com.example.StajSozluk.dto;

import com.example.StajSozluk.EnumFile.EntryType;


public class EntryDto {

    private int id;
    private String path;
    private String entryType;
    private int userId;
    private int topicId;

    public EntryDto()
    {

    }
    public EntryDto(int id,String path, String entryType, int userId,int topicId)
    {
        this.id=id;
        this.path=path;
        this.entryType=entryType;
        this.topicId=topicId;
        this.userId=userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }
}
