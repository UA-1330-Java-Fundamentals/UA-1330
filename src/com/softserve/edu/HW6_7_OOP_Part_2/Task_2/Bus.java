package com.softserve.edu.HW6_7_OOP_Part_2.Task_2;

public class Bus extends GroundVehicle {
    private String route;
    public Bus() {
        this.route = "";
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving.");
    }
    @Override
    public String toString() {
        return "Bus on route " + route;
    }
}