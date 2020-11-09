package com.vi;


public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Contact() {
        this(null, null);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
