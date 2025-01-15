package com.librarymanagementsystem;

public abstract class LibraryItem {
    private String title;
    private String author;
    private String serialNumber;
    protected boolean isBorrowed;
    public abstract void borrowedItem(User user);

    public LibraryItem(String title, String serialNumber, String author) {
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
