package com.softserve.hw09uml;

public class AppVehicle {

    public static void main(String[] args) {
        Vehicle[] vehicles = { new Boat() };
        //
        for (Vehicle current : vehicles) {
            System.out.println("current = " + current);
        }
    }
}
