package com.vi;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String phoneNumber;
    private ArrayList<Double> transaction;

    public Customer(String name, String phoneNumber,double initialAmount) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.transaction=new ArrayList<>();
        addTransaction(initialAmount);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void addTransaction(double transaction){
        this.transaction.add(transaction);
    }

}
