package com.softserve.edu.hw3;
import java.util.Scanner;

public class Triangle {

    public static double getArea(double s1, double s2, double s3){
        double semiper = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(semiper * (semiper - s1) * (semiper - s2) * (semiper - s3));
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st side of triangle: ");
        double  s1 = sc.nextFloat();
        System.out.println("Enter the 2nd side of triangle: ");
        double s2 = sc.nextFloat();
        System.out.println("Enter the 3rd side of triangle: ");
        double s3 = sc.nextFloat();
        /* double semiper = (s1 + s2 + s3) / 2;*/ 
        /* double area = Math.sqrt(semiper * (semiper - s1) * (semiper - s2) * (semiper - s3)); */
        System.out.printf("The area of the triange is: %.2f", getArea(s1, s2, s3)); 
    }
}

