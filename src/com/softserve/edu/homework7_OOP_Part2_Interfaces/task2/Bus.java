package com.softserve.edu.homework7_OOP_Part2_Interfaces.task2;

public class Bus extends GroundVehicle{
    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {
        System.out.println("Bus riding to the " + getRoute());
    }
}
