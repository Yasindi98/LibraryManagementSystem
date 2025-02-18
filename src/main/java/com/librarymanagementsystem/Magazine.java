package com.librarymanagementsystem;

public class Magazine extends LibraryItem{
    public Magazine(String title, String serialNumber, String author) {
        super(title, serialNumber, author);
    }

    @Override
    public void borrowedItem(User user) {
        if(!isBorrowed) {
            isBorrowed = true;
            System.out.println(user + "borrowed the magazine" + getTitle());
        }else {
            System.out.println("The magazine "+getTitle()+" is already borrowed.");
        }
    }
}
