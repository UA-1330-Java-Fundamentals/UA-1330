package com.softserve.edu.homework_6.tasks_from_quiz;

public class Refrigerator extends Appliance {
    private int capacity;

    public Refrigerator(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {

        System.out.println("Refrigerator - Brand: " + super.brand +
                ", Model: " + super.model + ", Capacity: " + capacity + " liters");
    }
}
