package com.softserve.edu.less07.task2;

public class Bus extends GroundVehicle {
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
    public void drive() {

    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() + ", " +
                "route='" + route + '\'' +
                '}';
    }


}
