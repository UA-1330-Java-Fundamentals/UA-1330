package com.softserve.edu.HW2;

import java.util.Scanner;

public class CalculationsOfGeometricFigures {

    public static void main(String[] args) {
        //  double s1, s2, s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of all side of triangle ");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        sc.close();

        TriangleFormulas tf = new TriangleFormulas(s1, s2, s3);
        System.out.println(tf);//message to console with result must be more informative

        System.out.println("Perimeter of triangle: " + TriangleFormulas.calculatePerimeter(s1, s2, s3));
        System.out.println("Area of triangle: " + TriangleFormulas.calculateArea(s1, s2, s3));
    }

}
