package com.softserve.edu.homework_3;

public class TriangleAreaCalculator {
    public static double calculateTheAreaOfTriangle(double side1, double side2, double side3) {
        double semiPerimeter = (side1 + side2 + side3) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }
}