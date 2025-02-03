package com.softserve.edu.hw3.homework;

import java.util.Scanner;

public class AreaCalculator {
    public static void main (String[] args){
        int firstSide = getSide ("Input side 1: ");
        int secondSide = getSide ("Input side 2: ");
        int thirdSide = getSide ("Input side 3: ");
        System.out.printf("the area of the triangle is %.2f", getArea(firstSide, secondSide,thirdSide));
    }

    private static int getSide(String prompt){
        Scanner scanner = new Scanner (System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static double getArea (int firstSide, int secondSide, int thirdSide){
        double perimeter = (firstSide+secondSide+thirdSide) /2.0;
        return Math.sqrt(perimeter* (perimeter-firstSide)*(perimeter-secondSide)*(perimeter-thirdSide));

    }

}
