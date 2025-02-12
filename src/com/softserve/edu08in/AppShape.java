package com.softserve.edu08in;

public class AppShape {

    public static void main(String[] args) {
        Shape shape = new Shape(1, "shape");
        Square square = new Square(2, "square", 3);
        //
        System.out.println("shape = " + shape);
        System.out.println("square = " + square);
        //
        //shape = square; // upcasting
        //System.out.println("shape = " + shape);
        //System.out.println("square = " + square);
        //
        shape = new Square(4, "square", 6);
        if (shape instanceof Square) {
            square = (Square) shape; // downcasting
            System.out.println("shape = " + shape);
            System.out.println("square = " + square);
        }
    }
}
