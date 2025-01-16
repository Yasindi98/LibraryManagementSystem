package com.librarymanagementsystem;

import java.io.Serializable;

public abstract class LibraryItem implements Serializable {
    private String title;
    private String author;
    private String serialNumber;
    protected boolean isBorrowed;
    public abstract void borrowedItem(User user);

    public LibraryItem(String title, String serialNumber, String author) { //Create constructors
        this.title = title;
        this.serialNumber = serialNumber;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}
