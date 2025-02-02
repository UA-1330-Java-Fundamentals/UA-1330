package com.softserve.edu.hw1.homework;

import java.util.Scanner;
public class FlowerBedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть радіус");
        int radius = sc.nextInt();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is " + perimeter);
        System.out.print("Area is " + area);
    }
}
