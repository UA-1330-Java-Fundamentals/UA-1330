package com.softserve.edu.HW2;

public class TriangleFormulas {

    private double side1, side2, side3, area;

    public TriangleFormulas(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        calculateArea();

    }

    public  void calculateArea() {

        double a = this.side1;
        double b = this.side2;
        double c = this.side3;

        double s = (a + b + c) / 2;
        this.area =  Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        return area;
    }


    @Override
    public String toString() {
        return "The area of thr triangle is "  + area;
    }
}
