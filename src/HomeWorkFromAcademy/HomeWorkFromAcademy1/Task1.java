/*
Task 1: Calculate the Perimeter and Area of a Flower Bed (Easy)

The flower bed is circular in shape. Your task is to write a program that reads the radius of the circle from the console, calculates the perimeter (circumference) and area of the flower bed, and then outputs the calculated results to the console.
Steps:

Create a class named FlowerBedCalculator.
In the main() method, declare a variable int radius and prompt the user to input the radius of the flower bed using the console.
Calculate the perimeter of the circle using the formula perimeter = 2 * Math.PI * radius.
Calculate the area of the circle using the formula area = Math.PI * radius * radius.
Output the calculated perimeter and area to the console.
*/

package HomeWorkFromAcademy.HomeWorkFromAcademy1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть радіус вашого квітника: ");
        int radius = sc.nextInt();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Периметр вашого квітника складає: " + perimeter);
        System.out.println("Площа вашого квітника складає: " + area);

        sc.close();
    }

}

