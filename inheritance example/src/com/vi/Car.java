package com.vi;

public class Car extends vehicle {
    private boolean ismanuel;
    private int currentGear;

    public Car(int tires, String bodyType, String vehicleType, String color, int gear, boolean ismanuel) {
        super(tires, bodyType, vehicleType, color, gear);
        this.ismanuel = ismanuel;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("changed gear to " + currentGear);
    }

}
