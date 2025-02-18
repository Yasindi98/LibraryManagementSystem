package com.librarymanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private List<LibraryItem> libraryItems;
    private List<User> userList;
    private Map<String,String> borrowedItems;

    public Library(){
        libraryItems = new ArrayList<>();
        borrowedItems = new HashMap<>();
        userList = new ArrayList<>();
    }

    public void  addItem(LibraryItem item){
        libraryItems.add(item);
    }

    public void addUser(User user){
        userList.add(user);
    }

    public List<LibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void borrowItem(String serialNumber, User user){
        for(LibraryItem item:libraryItems){
            if(item.getSerialNumber().equals(serialNumber)){
                if(getBorrowedItems().containsKey(item.getSerialNumber())){
                    System.out.println("Item "+item.getTitle()+" is already borrowed !");
                    return;
                }
                getBorrowedItems().put(item.getSerialNumber(), user.getName());
                item.isBorrowed=true;
                System.out.println("Item "+item.getTitle()+" is successfully borrowed by "+user.getName());
                return;
            }
        }
        System.out.println("Item with serial number"+serialNumber+" is not available.");
    }

    public void returnBorrowedItem(String serialNumber){
        for (LibraryItem item:libraryItems){
            if (item.getSerialNumber().equals(serialNumber)){
                getBorrowedItems().remove(item.getSerialNumber());
                System.out.println("Item successfully returned");
                return;
            }
        }
        System.out.println("Item with serial number"+serialNumber+" is not available.");
    }
    public Map<String, String>getBorrowedItems() {
        return borrowedItems;
    }

    //------------------------------------------------------------------------------------------------------------------

    public void printUserList() {
        System.out.println();
        System.out.println("USER LIST");
        System.out.println("---------");
        if (userList == null || userList.isEmpty()) {
            System.out.println("The user list is empty.");
            return;
        }
        int index = 1; // Start with index 0
        for (User user : userList) {
            System.out.println(index + ": " + user.getName());
            index++; // Increment the index
        }
        System.out.println();
    }
}
