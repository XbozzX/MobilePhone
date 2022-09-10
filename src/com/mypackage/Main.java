package com.mypackage;

import java.util.Scanner;

public class Main {

    private static MobilePhone mobilePhone = new MobilePhone("000 000 000");
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        menuOption();
        int userOption = keyboard.nextInt();
        keyboard.nextLine();

        while (userOption != 6) {
            switch (userOption) {
                case 1: //store the input from the user
                    addContact();
                    menuOption();
                    userOption = keyboard.nextInt();
                    keyboard.nextLine();
                    break;
                case 2:
                    updateContact();
                    menuOption();
                    userOption = keyboard.nextInt();
                    keyboard.nextLine();
                    break;
                case 3:
                    removeContact();
                    menuOption();
                    userOption = keyboard.nextInt();
                    keyboard.nextLine();
                    break;
                case 4:
                    printListContact();
                    menuOption();
                    userOption = keyboard.nextInt();
                    keyboard.nextLine();
                    break;
                case 5:
                    searchContact();
                    menuOption();
                    userOption = keyboard.nextInt();
                    keyboard.nextLine();
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
    public static void menuOption(){
        System.out.println("[1] Add new contact");
        System.out.println("[2] Update existing contact");
        System.out.println("[3] Remove Contact");
        System.out.println("[4] Print list of contacts");
        System.out.println("[5] Search/find contact");
        System.out.println("[6] Quit");
        System.out.print("Enter your option: ");

    }

    public static void addContact(){
        System.out.print("Enter your contact name: ");
        String newName = keyboard.nextLine();
        System.out.print("Enter your contact number");
        String newNumber = keyboard.nextLine();

        Contact newContact = Contact.createContact(newName, newNumber);

        mobilePhone.addNewContact(newContact);
        System.out.println("");
        mobilePhone.printContacts();

    }

    public static void updateContact(){
        System.out.print("Enter your existing contact name: ");
        String oldName = keyboard.nextLine();

        Contact oldContact = mobilePhone.queryContact(oldName);
       //System.out.println(oldContact);

        System.out.print("Enter your new contact name: ");
        String newName = keyboard.nextLine();

        System.out.print("Enter your new contact number: ");
        String newNumber = keyboard.nextLine();

        Contact newContact = Contact.createContact(newName, newNumber);

        mobilePhone.updateContact(oldContact, newContact);

    }

    public static void removeContact(){
        System.out.print("Enter the contact you want to delete: ");
        String deleteContact = keyboard.nextLine();

        Contact delContact = mobilePhone.queryContact(deleteContact);
        mobilePhone.removeContact(delContact);
    }

    public static void printListContact(){
        mobilePhone.printContacts();
    }

    public static void searchContact(){
        System.out.print("Enter contact name that you want to query: ");
        String queryContact = keyboard.nextLine();

        Contact searchContact = mobilePhone.queryContact(queryContact);
        System.out.println(mobilePhone.queryContact(searchContact));


    }

}