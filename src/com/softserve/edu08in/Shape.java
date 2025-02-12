package com.softserve.edu08in;

public class Shape {
    private double side;
    private String name;

    public Shape(double side, String name) {
        this.side = side;
        this.name = name;
    }

    public double getSide() {
        return side;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "side=" + side +
                ", name='" + name + '\'' +
                '}';
    }
}
