package com.vi;

import java.util.ArrayList;

public class MobilePhone {
    private static ArrayList<Contact> myContacts;

    public static ArrayList<Contact> getMyContacts() {
        return myContacts;
    }

    public MobilePhone() {
        myContacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        if (findContact(contact) >= 0) {
            System.out.println("contact already exists");
        } else {
            myContacts.add(contact);
            System.out.println(contact.getName() + " add on the contact list");

        }
    }

    private int findContact(Contact contact) {

        return myContacts.indexOf(contact);
    }

    public boolean RemoveContact(Contact contact) {

        if (findContact(contact) >= 0) {

            if (myContacts.remove(contact)) {
                System.out.println("Removed contact " + contact.getName());
                return true;
            } else {
                System.out.println("Something went wrong");
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean RemoveContact(String name) {
        boolean flag = false;
        for (int i = 0; i < myContacts.size(); i++) {
            Contact cn = myContacts.get(i);
            if (cn.getName() == name) {
                flag = RemoveContact(cn);
                break;
            }
        }
        return flag;
    }

    public void SearchContact(Contact cn) {
        if (findContact(cn) >= 0) {
            System.out.println(cn.getName() + " found at position " + findContact(cn));
        }
    }

    public void SearchContact(String name) {
        boolean found = false;
        for (int i = 0; i < myContacts.size(); i++) {
            Contact cn = myContacts.get(i);
            if (cn.getName() == name) {
                System.out.println(name + " is found at position " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("item not found");
        }
    }

    public void Modify(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) >= 0) {
            myContacts.add(findContact(oldContact), newContact);
        } else {
            System.out.println(oldContact.getName() + " doesn't exist");
        }
    }

    //    public String query(Contact cn){
//        if ( findContact(cn)>=0 ){
//            return cn.getName();
//        }else {
//            return null;
//        }
//    }
    public void printContacts() {
        Contact contact;
        for (int i = 0; i < myContacts.size(); i++) {
            contact = myContacts.get(i);
            String name = contact.getName();
            String number = contact.getNumber();
            System.out.println("Name is :" + name + "\tNumber is " + number);
        }
    }

}
