package com.softserve.edu09poly;

public abstract class ACar implements ICar {
    private double maxSpeed;
    public static final String MESSAGE = "Hello";

    public ACar(double maxSpeed) {
        //super(); // from Object
        this.maxSpeed = maxSpeed;
        System.out.println("public ACar()");
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //public abstract void carRides();
}
