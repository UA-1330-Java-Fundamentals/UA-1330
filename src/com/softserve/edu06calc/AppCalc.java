package com.softserve.edu06calc;

import java.util.Scanner;

public class AppCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        //
        //int a = 5;
        //int b = 5;
        //System.out.println("a + b = " + (a + b));
        Calc calc = new Calc();
        System.out.println("a + b = " + calc.add(a, b));
        System.out.println("a / b = " + calc.div(a, b));
        //
        sc.close();
    }
}
