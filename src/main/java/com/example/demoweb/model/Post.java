package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private final long id;
    private final String text;
    private final Date creationDate;
    private int likes;
    
    public Post(long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }
    
    public long getId() {
        return id;
    }
    
    public String getText() {
        return text;
    }
    
    public Date getCreationDate() {
        return creationDate;
    }
    
    public int getLikes() {
        return likes;
    }
    
    public void setLikes(int likes) {
        this.likes = likes;
    }
}
