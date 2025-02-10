package com.softserve.edu06calc;

import java.util.Scanner;

public class AppAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        //
        System.out.println("a + b = " + (a + b));
        sc.close();
    }
}