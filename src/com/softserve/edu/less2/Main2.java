package com.softserve.edu.less2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/*1. Write Java console application with method to calculate the area of a triangle. Example of output:*/
public class Main2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        AreaOfTriangle areaoftriangle = new AreaOfTriangle();
        double side1 = promptParameters();
        areaoftriangle.setSide1(side1);
        double side2 = promptParameters();
        areaoftriangle.setSide2(side2);
        double side3 = promptParameters();
        areaoftriangle.setSide3(side3);
        double perimetr = (double) (areaoftriangle.getSide1() + areaoftriangle.getSide2() + areaoftriangle.getSide3())/2;
        double result = sqrt(perimetr*(perimetr-side1)*(perimetr-side2)*(perimetr-side3));
        System.out.println(result);
        SCANNER.close();

    }

    public static double promptParameters() {
        System.out.println("Please, enter the double side > 0: ");
        double side = SCANNER.nextDouble();
        if (side <= 0) {
            throw new RuntimeException("side < 0");
        }
        return side;
    }

}
