package com.softserve.edu.HW1;

import java.util.Scanner;

public class FlowerBedCalculator {

    public static void main(String[] args) {

        int radius;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius flower bed: ");
        radius =  scanner.nextInt();

        perimeter(radius);
        area(radius);


    }
    public static void perimeter(int radius){

        double p = (int) (2 * Math.PI * radius);
        System.out.println("Perimeter: " + p );
    }
    public static void area(int radius){

        double a =  Math.PI * radius * radius;
        System.out.println("Area: " + a );

    }


}
