package com.vi;

public class Address {
    private String StreetName;
    private String city;
    private double contactNo;

    public Address(String streetName, String city, double contactNo) {
        StreetName = streetName;
        this.city = city;
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return StreetName + ":" + city;
    }

    public double getContactNo() {
        return contactNo;
    }
}