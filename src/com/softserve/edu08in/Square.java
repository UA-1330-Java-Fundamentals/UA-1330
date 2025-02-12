package com.softserve.edu08in;

public class Square extends Shape {
    private double width;

    public Square(double side, String name, double width) {
        super(side, name);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString() +
                ", width=" + width +
                '}';
    }
}
