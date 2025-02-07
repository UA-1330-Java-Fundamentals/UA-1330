package com.softserve.edu.hw1;
import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the flower bed: ");
        int radius = scanner.nextInt();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        String perimeterResultMessage = String.format("The perimeter of your flower bed is: %.2f", perimeter);
        String areaResultMessage = String.format("The area of your flower bed is: %.2f", area);
        System.out.println(perimeterResultMessage);
        System.out.println(areaResultMessage);
    }
}
