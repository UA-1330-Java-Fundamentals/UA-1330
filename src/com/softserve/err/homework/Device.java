package com.softserve.err.homework;

public abstract class Device {

        protected String brand;
        protected String model;
        protected boolean powerStatus;

    public Device(String brand, String model, boolean powerStatus) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = powerStatus;
    }

        public String turnOn() {
            this.powerStatus = true;
            return "The device is now ON.";
        }

        public String turnOff() {
        this.powerStatus = false;
        return "The device is now OFF.";
    }

        public abstract void displayInfo();

}

