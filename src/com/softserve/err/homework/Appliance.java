package com.softserve.err.homework;

public abstract class Appliance {
    private String brand;
    private String model;

    public Appliance(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Brand:" + brand + ", Model:" + model;
    }

    public abstract void displayInfo();
}
