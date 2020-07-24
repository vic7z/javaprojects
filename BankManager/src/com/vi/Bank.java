package com.vi;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        branches=new ArrayList<>();
    }

    public boolean addBranch(Branch branch){
        if(findBranch(branch)<0){
            this.branches.add(branch);
            return true;
        }else {
            return false;
        }
    }
    public boolean addBranch(String name){
        if (findBranch(name)<0){
            this.branches.add(new Branch(name));
            return true;
        }else {
            return false;
        }
    }
    private int findBranch(Branch branch){
        return this.branches.indexOf(branch);
    }
    private int findBranch(String name){
        Branch bc;
        int fn=0;
        for (int i=0;i<this.branches.size();i++){
            bc=this.branches.get(i);
            if(bc.getBranchName().equals(name)){
                fn= i;
                break;
            }else {
                fn= -1;
            }
        }
        return fn;
    }

    public String getBankName() {
        return bankName;
    }
    public boolean addCustomer(String BranchName,String customerName,String phoneNumber,double transaction){
        boolean flag=false;
        if(findBranch(BranchName)<0){
            if ( this.branches.get(findBranch(BranchName)).addCustomer(customerName,phoneNumber,transaction) )
                flag = true;
            else flag = false;

        }
        return flag;
    }

}
