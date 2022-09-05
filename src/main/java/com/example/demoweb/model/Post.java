package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private final String text;
    private final Date creationDate;
    private int likes;
    
    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
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
}
