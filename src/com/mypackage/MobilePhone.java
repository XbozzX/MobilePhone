package com.mypackage;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;

    private ArrayList<Contact> myContact;

    public MobilePhone(String numberContact){
        this.myContact = new ArrayList<Contact>();
        this.myNumber = numberContact;
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println(findContact(contact));
            System.out.print("fail");
            return false;
        }
        System.out.println(this.myContact.indexOf(contact));
        myContact.add(contact);
        System.out.print("done");
        return true;

    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if (findContact(oldContact.getName()) >= 0){
            int index = findContact(oldContact);
            myContact.set(index, newContact);
            System.out.println("done");
            return true;
        }
        System.out.println("fail");
        return false;
    }

    public boolean removeContact(Contact contact){
        if (findContact(contact) >= 0){
            int index = findContact(contact);
            myContact.remove(index);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        return this.myContact.indexOf(contact);
    }

    private int findContact(String contact) {
        for (int i = 0; i < myContact.size(); i++){
            Contact contact1 = myContact.get(i);
            if (contact1.getName().equals(contact)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contact){ // to get the data from Contact class
        int index = findContact(contact);
        if (index >= 0){
            return this.myContact.get(index);
        }
        return null;
    }

    public String queryContact(Contact contact){
        if (findContact(contact) >=0){ // to validate the data
            return contact.getName();
        }
        return null;
    }

    public void printContacts(){

        for (int i = 0; i < myContact.size(); i++){
            System.out.println(myContact.get(i).getName()+
                    " --> " + myContact.get(i).getPhoneNumber());
        }
    }

}
