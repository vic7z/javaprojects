package com.vi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Accounts extends StudentManager{
    private double tutionFee;
    private double specialFee;
    private Map<Student,Accounts> StudentAccount;

    public Accounts( ) {
        StudentAccount=new HashMap<>();
        this.tutionFee=0;
        this.specialFee=0;

    }

    public double getTutionFee() {
        return tutionFee;
    }

    public double getSpecialFee() {
        return specialFee;
    }

    public void setTutionFee(double tutionFee) {
        this.tutionFee = tutionFee;
    }

    public void setSpecialFee(double specialFee) {
        this.specialFee = specialFee;
    }
}


