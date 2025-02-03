package com.softserve.edu.HW2;

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Triangle.promptSides(triangle);

        if (!triangle.isTriangleValid()) {
            System.out.println("Entered sides can not create a triangle");
        } else {
            System.out.println("side 1 is " + triangle.getSide1());
            System.out.println("side 2 is " + triangle.getSide2());
            System.out.println("side 3 is " + triangle.getSide3());
            System.out.printf("The Area of this triangle = %.2f".formatted(triangle.getTriangleArea()));

        }
    }
}
