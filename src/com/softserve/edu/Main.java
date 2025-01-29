package com.softserve.edu;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float radius;
        float area;
        float perimeter;

        System.out.println("Enter the radius of the circle: ");
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextInt();
        area = radius * radius;
        perimeter = 2 * radius * radius;
        System.out.println("The area of the circle is " + area);
        System.out.println("The perimeter of the circle is " + perimeter);
        //commit

    }
}