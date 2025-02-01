package com.softserve.edu.homework3_Inrpduction_to_OOP;

/*
Write  Java console application with method to calculate the area of a triangle.
 */

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TriangleArea {
    private double side1, side2, side3;

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {

        TriangleArea triangle = new TriangleArea();

        System.out.print("Please, input side 1 length : ");
        Scanner scan = new Scanner(System.in);
        triangle.setSide1(scan.nextDouble());
        System.out.print("Please, input side 2 length : ");
        triangle.setSide2(scan.nextDouble());
        System.out.print("Please, input side 3 length : ");
        triangle.setSide3(scan.nextDouble());

        System.out.println("The area of triangle is " + triangle.calculateArea());
    }
}

