package com.mypackage;

import java.util.Scanner;

public class MobilePhone {

    public void menuOption(){
        System.out.println("[1] Add new contact");
        System.out.println("[2] Update existing contact");
        System.out.println("[3] Remove Contact");
        System.out.println("[4] Print list of contacts");
        System.out.println("[5] Search/find contact");
        System.out.println("[6] Quit");
    }

    public void functionMenu(){

        Scanner keyboard = new Scanner(System.in);
        Contact userContact = new Contact();

        System.out.print("Enter your option: ");
        int userOption = keyboard.nextInt();
        keyboard.nextLine();


        while (userOption != 6) {
            switch(userOption){
                case 1: //store the input from the user
                    System.out.print("Enter your contact name: ");
                    String nameOfContact = keyboard.nextLine();
                    System.out.print("Enter your contact number");
                    int numberOfContact = keyboard.nextInt();
                    keyboard.nextLine();

                    userContact.storeContact(nameOfContact, numberOfContact);

                    System.out.print("Enter your option: ");
                    userOption = keyboard.nextInt();
                    keyboard.nextLine();
                    break;
                    //DONE: modify is broken .... cannot modify the exitsting name
                case 2 : // modify the existing contact name
                    System.out.print("Enter your existing contact name: ");
                    String existingContact = keyboard.nextLine();

                    System.out.print("Enter your new name for existing contact: ");
                    String newContact = keyboard.nextLine();

                    userContact.modifyContact(existingContact, newContact);

                    System.out.print("Enter your option: ");
                    userOption = keyboard.nextInt();
                    keyboard.nextLine();
                    break;
                case 3 : // remove the existing contact name
                    System.out.print("Enter your existing contact name that you want to remove: ");
                    String removeContact = keyboard.nextLine();
                    userContact.removeContact(removeContact);

                    System.out.print("Enter your option: ");
                    userOption = keyboard.nextInt();
                    keyboard.nextLine();
                    break;
                case 4:
                    userContact.printContact();

                    System.out.print("Enter your option: ");
                    userOption = keyboard.nextInt();
                    keyboard.nextLine();
                    break;
                case 5: // search the contact based on the user input
                    System.out.print("Enter your contact name that you want to query: ");
                    String queryContact = keyboard.nextLine();
                    System.out.println(userContact.contactQuery(queryContact));

                    System.out.print("Enter your option: ");
                    userOption = keyboard.nextInt();
                    keyboard.nextLine();
                    break;

                default: // prompt the error if the user make mistake in option menu
                    System.out.println("Please enter correct input !!");
                    System.out.print("Enter your option: ");
                    userOption = keyboard.nextInt();
                    keyboard.nextLine();
                    break;
            }
        }

    }
}
