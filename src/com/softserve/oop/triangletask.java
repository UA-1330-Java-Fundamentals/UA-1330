package com.softserve.oop;
import java.util.Scanner;



public class triangletask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Side1 :");
        int s1 = sc.nextInt();

        System.out.print("Input Side2 :");
        int s2 = sc.nextInt();

        System.out.print("Input Side3 :");
        int s3 = sc.nextInt();

        double area = triangleArea(s1,s2,s3);

        System.out.println("Triangle area equals : " + area);
    }

    public static double triangleArea(int a, int b,int c){
         return a*b*c;
    }
}
