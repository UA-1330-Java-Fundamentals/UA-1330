package com.softserve.edu.HW1;

import java.util.Scanner;

public class FlowerBedCalculator {

    public static void main(String[] args) {

        //  int radius;//Я писала про це коментар в дискорді. Краще оголошувати змінні там де вони використовуються
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius flower bed: ");
        int radius = scanner.nextInt();
        System.out.println("Perimeter: " + calculatePerimeter(radius));
        System.out.println("Area: " + calculateArea(radius));

    }

    public static double calculatePerimeter(int radius) {//цей метод краще не робити void, а повертати значення, щоб можна було його використати в інших методах
        double p = 2 * Math.PI * radius;//назва змінної повинна бути більш зрозумілою (наприклад, perimeter)
        return p; //ці рядки можна було б об'єднати в один return 2 * Math.PI * radius;
    }

    public static double calculateArea(int radius) {
        double a = Math.PI * radius * radius; //назва змінної повинна бути більш зрозумілою (наприклад, area)
        return a;//ці рядки можна було б об'єднати в один return Math.PI * radius * radius;
    }
}
