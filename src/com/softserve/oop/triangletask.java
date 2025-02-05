package com.softserve.oop;

import java.util.Scanner;


public class triangletask {//According to Java Code Conventions class name should start with capital letter
    //It is mean TriangleTask or  TriangleAreaCalculator

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Side1: ");
        int s1 = sc.nextInt();

        System.out.print("Input Side2: ");
        int s2 = sc.nextInt();

        System.out.print("Input Side3: ");
        int s3 = sc.nextInt();

        double area = triangleArea(s1, s2, s3);
        System.out.println("Triangle area equals : " + area);
    }

    public static double triangleArea(int a, int b, int c) {
        return a * b * c;//It is wrong formula for calculating triangle area
        //Second problem is that you should use double type for area
        //An area will be integer because all sides are integer for your formula
    }
    //Correct formula for calculating triangle area is:

    /**
     * Calculate triangle area using Heron's formula
     * @param  a side s1
     * @param b side s2
     * @param c side s3
     * @return area of triangle
     */
    public static double calcTriangleArea(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            throw new IllegalArgumentException("Invalid sides for a triangle");
        }
        double halfPerimeter = (a + b + c) / 2.0;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    /**
     * Check if sides can form a triangle
     * @param a side s1
     * @param b side s2
     * @param c side s3
     * @return  true if sides can form a triangle
     */
    private static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

}
