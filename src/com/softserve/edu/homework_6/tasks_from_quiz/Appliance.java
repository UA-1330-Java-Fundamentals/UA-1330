package com.softserve.edu.homework_6.tasks_from_quiz;

abstract class Appliance {
    protected String brand;
    protected String model;

    public Appliance(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void displayInfo();
}
