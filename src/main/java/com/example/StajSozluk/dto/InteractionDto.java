package com.example.StajSozluk.dto;



public class InteractionDto {

    private int id;
    private boolean favourite;
    private int interactionType;
    private int userId;
    private int entryId;

    public InteractionDto(int id,boolean favourite, int interactionType, int userId, int entryId)
    {
        this.id=id;
        this.favourite = favourite;
        this.interactionType = interactionType;
        this.userId = userId;
        this.entryId = entryId;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public int getInteractionType() {
        return interactionType;
    }

    public void setInteractionType(int interactionType) {
        interactionType = interactionType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
