package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        //Creating a scanner object to input from the user
        Scanner sc = new Scanner(System.in);

        //Object of ContactService class to call methods
        ContactService cs = new ContactService();

        System.out.println("Welcome to Address Book Program");

        int ch;

        //Implementing do-while loop
        do{
            System.out.println("\n===== Address Book Menu =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.println("Enter your choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    cs.addContact();
                    break;

                case 2:
                    cs.displayContacts();
                    break;

                case 3:
                    cs.editContact();
                    break;
                case 4:
                    cs.deleteContact();
                    break;

                case 5:
                    System.out.println("Thank you.Have a nice day");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while (ch!=5);
    }
}