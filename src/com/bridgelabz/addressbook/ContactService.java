package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactService {

    //Creating a scanner object to input from the user
    Scanner sc = new Scanner(System.in);

    //Creating a arraylist to store contact details
    ArrayList<Contact> contactList = new ArrayList<Contact>();

    //Non-static method to add contact
    public void addContact(){
        Contact c = new Contact();

        System.out.print("First Name: ");
        c.setFirstName(sc.nextLine());

        System.out.print("Last Name: ");
        c.setLastName(sc.nextLine());

        System.out.print("Address: ");
        c.setAddress(sc.nextLine());

        System.out.print("City: ");
        c.setCity(sc.nextLine());

        System.out.print("State: ");
        c.setState(sc.nextLine());

        System.out.print("Zip: ");
        c.setZip(sc.nextInt());

        sc.nextLine();

        System.out.print("Phone Number: ");
        c.setPhoneNumber(sc.nextLine());

        System.out.print("Email: ");
        c.setEmail(sc.nextLine());

        contactList.add(c);

        System.out.println("Contact added successfully");
    }

    //Non-static method to display contact
    public void displayContacts(){

        if(contactList.isEmpty()){
            System.out.println("Address book is empty");
            return;
        }
        for(Contact c : contactList){
            c.displayContact();
        }
    }

    //Non-static method to edit contact
    public void editContact(){
        System.out.println("Enter first name to edit contact");
        String name = sc.nextLine();

        for(Contact c : contactList){
            if(c.getFirstName().equalsIgnoreCase(name)){
                System.out.print("New Address: ");
                c.setAddress(sc.nextLine());

                System.out.print("New City: ");
                c.setCity(sc.nextLine());

                System.out.print("New State: ");
                c.setState(sc.nextLine());

                System.out.print("New Zip: ");
                c.setZip(sc.nextInt());

                sc.nextLine();

                System.out.print("New Phone Number: ");
                c.setPhoneNumber(sc.nextLine());

                System.out.print("New Email: ");
                c.setEmail(sc.nextLine());

                System.out.println("Contact Updated Successfully.");

                return;

            }
        }
    }

    //Non-static method to delete contact
    public void deleteContact(){

        System.out.println("Enter first name to delete contact");
        String name = sc.nextLine();

        Contact deleteCon = null;

        for(Contact c : contactList){
            if(c.getFirstName().equalsIgnoreCase(name)){
                deleteCon = c;
            }
        }

        if(deleteCon != null){
            contactList.remove(deleteCon);
            System.out.println("Contact deleted successfully");
        }
        else{
            System.out.println("Contact not found");
        }

    }
}
