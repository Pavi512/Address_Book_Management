package com.bridgelabz.addressbook;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        //Creating a scanner object to input from the user
        Scanner sc = new Scanner(System.in);

        // Dictionary of Address Book Name , Address Book
        HashMap<String, ContactService> addressBook = new HashMap<String, ContactService>();

        System.out.println("Welcome to Address Book Program");

        int ch;

        //Implementing do-while loop
        do{
            System.out.println("\n===== Address Book Menu =====");
            System.out.println("1. Create Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Edit Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Display Address Books");
            System.out.println("7. Exit");

            System.out.println("Enter your choice : ");
            ch = sc.nextInt();

            sc.nextLine();

            String  book;
            switch (ch) {
                case 1:
                    System.out.println("Enter Address Book Name: ");
                    book = sc.nextLine();

                    if (addressBook.containsKey(book)) {
                        System.out.println("Address Book already exists.");
                    }
                    else {
                        addressBook.put(book, new ContactService());
                        System.out.println("Address Book created successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Address Book Name: ");
                    book = sc.nextLine();

                    if (addressBook.containsKey(book)) {
                        ContactService cs = addressBook.get(book);

                        cs.addContact();                    }
                    else {
                        System.out.println("Address Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Address Book Name: ");
                    book = sc.nextLine();

                    if (addressBook.containsKey(book)) {
                        ContactService cs = addressBook.get(book);

                        cs.displayContacts();                    }
                    else {
                        System.out.println("Address Book not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Address Book Name: ");
                    book = sc.nextLine();

                    if (addressBook.containsKey(book)) {
                        ContactService cs = addressBook.get(book);

                        cs.editContact();                    }
                    else {
                        System.out.println("Address Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Address Book Name: ");
                    book = sc.nextLine();

                    if (addressBook.containsKey(book)) {
                        ContactService cs = addressBook.get(book);

                        cs.deleteContact();                    }
                    else {
                        System.out.println("Address Book not found.");
                    }
                    break;

                case 6:
                    if(addressBook.isEmpty()){
                        System.out.println("No address book available.");
                    }
                    else{
                        System.out.println("Available address books: ");
                        for(String name : addressBook.keySet()){
                            System.out.println(name);
                        }
                    }

                case 7:
                    System.out.println("Thank you. Have a nice day.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while (ch!=5);
    }
}