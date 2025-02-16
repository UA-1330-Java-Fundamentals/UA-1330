package com.softserve.edu.less05.task3;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engine;

    public Car(String type, int yearOfProduction, double engine) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engine=" + engine +
                '}';
    }
}
