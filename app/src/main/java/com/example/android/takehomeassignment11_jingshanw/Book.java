package com.example.android.takehomeassignment11_jingshanw;

import java.io.Serializable;

/**
 * Created by Jing on 4/17/17.
 */

public class Book implements Serializable
{
    public String name;
    public String author;
    public int photoId;

    public Book(String name, String author, int photoId) {
        this.name = name;
        this.author=author;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}
