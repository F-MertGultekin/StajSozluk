package com.example.StajSozluk.dto;

public class EntryDto {

    private int id;
    private String path;
    private int entryType;
    private int userId;
    private int topicId;

    public EntryDto()
    {

    }

    public EntryDto(int id,String path, int entryType, int userId,int topicId)
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

    public int getEntryType() {
        return entryType;
    }

    public void setEntryType(int entryType) {
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
