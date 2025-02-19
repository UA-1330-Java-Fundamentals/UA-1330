package com.softserve.edu.HW6_7_OOP_Part_2.Task_2;

public class Car extends GroundVehicle {


    private String model;

    public Car() {
        this.model = "";
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "Car model " + model;
    }
}
