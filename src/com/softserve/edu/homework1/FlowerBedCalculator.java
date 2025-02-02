package com.softserve.edu.homework1;

import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a radius: ");
        int radius = in.nextInt();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("perimeter=" + perimeter);
        System.out.println("area=" + area);
    }
}
