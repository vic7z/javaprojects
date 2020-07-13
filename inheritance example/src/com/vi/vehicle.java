package com.vi;

public class vehicle {
    private int tires;
    private String bodyType;
    private String vehicleType;
    private String color;
    private int gear;
    private int speed;
    public vehicle(int tires, String bodyType, String vehicleType, String color, int gear) {
        this.tires = tires;
        this.bodyType = bodyType;
        this.vehicleType = vehicleType;
        this.color = color;
        this.gear = gear;
        this.speed =0;
    }

    public  void  speed(int x){
        System.out.println("speed is "+x+" km/hr");
    }


}
