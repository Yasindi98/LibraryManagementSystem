package com.librarymanagementsystem;

public class Book extends LibraryItem{
    public Book(String title, String serialNumber, String author) {
        super(title, serialNumber, author);
    }

    @Override
    public void borrowedItem(User user) {
        if(!isBorrowed()) {
            isBorrowed=true;
            System.out.println(user + " borrowed the book " + getTitle());
        }else {
            System.out.println("The Book "+getTitle()+" is already borrowed!");
        }
    }
}
