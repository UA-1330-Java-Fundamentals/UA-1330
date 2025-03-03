package com.softserve.oop2hw2;

public class Car extends GroundVehicle{
    private String model;

    public Car(){
        this.model = " ";
    }

    @Override
    public void drive(){
        System.out.println("Car is driving");
    }

    @Override
    public String toString() {
        return "Car," +
                " model:" + model;
    }
}
