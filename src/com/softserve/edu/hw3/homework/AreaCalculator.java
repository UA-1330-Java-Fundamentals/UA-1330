package com.softserve.edu.hw3.homework;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstSide = getSide("Input side 1: ", scanner);
        int secondSide = getSide("Input side 2: ", scanner);
        int thirdSide = getSide("Input side 3: ", scanner);
        System.out.printf("the area of the triangle is %.2f", getArea(firstSide, secondSide, thirdSide));
        scanner.close();
    }

    private static int getSide(String prompt, Scanner scanner) {// The name of the method should be more descriptive like readSideFromInput
        //Scanner scanner = new Scanner (System.in);//Don't create an instance of Scanner in every method, create it once and use it in all methods
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static double getArea(int firstSide, int secondSide, int thirdSide) {
        if (!isTriangle(firstSide, secondSide, thirdSide)) {
            System.out.println("The sides do not form a triangle");
        }
        double halfPerimeter = (firstSide + secondSide + thirdSide) / 2.0;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
    }
//some improvements
    private static boolean isTriangle(int firstSide, int secondSide, int thirdSide) {
        return firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide;
    }
}
