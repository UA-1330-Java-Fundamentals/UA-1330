package com.softserve.oop2hw2;

import org.w3c.dom.ls.LSOutput;

public class ApplTansport {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Liner(),
                new Boat(),
                new Plane(),
                new Helicopter(),
                new Bus(),
                new Motorcycle(),
                new Car()
        };

        System.out.println("Transport list:");
        for (Vehicle currentVehicle : vehicles){
            System.out.println(currentVehicle);
        }
    }
}
