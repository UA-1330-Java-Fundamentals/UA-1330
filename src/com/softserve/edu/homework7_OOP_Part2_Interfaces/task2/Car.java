package com.softserve.edu.homework7_OOP_Part2_Interfaces.task2;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {
        System.out.println("The " + getModel() + " car start riding");
    }
}
