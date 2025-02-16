package com.softserve.edu.homework_6.tasks_from_quiz;

public class WashingMachine extends Appliance {
    private final int loadCapacity;

    public WashingMachine(String brand, String model, int loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Washing Machine - Brand: " + super.brand +
                ", Model: " + super.model + ", Load Capacity: " + loadCapacity + " kg");
    }
}
