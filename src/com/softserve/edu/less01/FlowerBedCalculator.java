package com.softserve.edu.less01;

import java.util.Scanner;

import static java.lang.Math.PI;

/*Task 1: Calculate the Perimeter and Area of a Flower Bed*/
public class FlowerBedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println("Please, enter the int radius > 0: ");
        if (radius > 0) {
            double perimeter = 2 * PI * radius; //оголошуємо змінну там де вона використовується, раніше не потрібно
            System.out.println("perimeter =  " + perimeter);
            double area = PI * radius * radius; //  аналогічно
            System.out.println("area =  " + area);
        } else {
            System.out.println("wrong radius, restart program");
        }
        sc.close();
    }
}