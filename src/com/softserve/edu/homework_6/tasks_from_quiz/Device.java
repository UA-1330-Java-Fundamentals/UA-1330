package com.softserve.edu.homework_6.tasks_from_quiz;

abstract class Device {
    protected String brand;
    protected String model;
    protected boolean powerStatus;

    public Device(String brand, String model, boolean powerStatus) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = powerStatus;
    }

    public void turnOn() {
        powerStatus = true;
        System.out.println("The device is now ON.");
    }

    public void turnOff() {
        powerStatus = false;
        System.out.println("The device is now OFF.");
    }

    public abstract void displayInfo();
}
