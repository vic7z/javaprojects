package com.vi;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
        customers = new ArrayList<>();
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }


    public boolean addCustomer(Customer customer) {
        if (findCustomer(customer) < 0) {
            customers.add(customer);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String name, String phoneNumber, double Transaction) {
        if (findCustomer(name) > 0) {
            return false;
        } else {
            this.customers.add(new Customer(name, phoneNumber, Transaction));
            return true;
        }
    }

    public boolean addTransaction(String name, double amount) {
        if (findCustomer(name) > 0) {
            this.customers.get(findCustomer(name)).addTransaction(amount);
            return true;
        } else {
            return false;
        }
    }

    private int findCustomer(Customer customer) {
        return this.customers.indexOf(customer);
    }

    private int findCustomer(String name) {
        Customer cn;
        int val = 0;
        for (int i = 0; i < this.customers.size(); i++) {
            cn = this.customers.get(i);

            if (cn.getName().equals(name)) {
                val = i;
                break;
            } else {
                val = -1;
            }
        }
        return val;
    }
}