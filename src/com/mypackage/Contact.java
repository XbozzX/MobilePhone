package com.mypackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {

    private ArrayList<String> contactName = new ArrayList<String>();
    private ArrayList<Integer> contactNumber = new ArrayList<Integer>();

    public void storeContact(String name, int number){
        if (contactQuery(name) == false){
            contactName.add(name);
            System.out.println("done");
        } else {
            System.out.println("This contact have already exist");
        }
    }

    public void modifyContact(String name, String newName){

        if (contactQuery(name) == true){
            int index = contactIndex(name);
            contactName.set(index, newName);
            System.out.println("name = " + newName );
        } else {
            System.out.println("This contact does not exist");
        }
    }

    public void removeContact(String name){
        if (contactQuery(name) == true){
            contactName.remove(name);
        } else {
            System.out.println("This contact does not exits");
        }
    }

    public void printContact(){
        for (int i = 0; i < contactName.size(); i++){
            System.out.print("Name: ");
            System.out.print(contactName.get(i) + "\n");
        }
    }

    public boolean contactQuery(String name){
         boolean query = contactName.contains(name);
         return query;
    }

    public int contactIndex(String name){
        int index = contactName.indexOf(name);
        return index;
    }



}
