package com.softserve.hw1;
import java.util.Scanner;
import java.math.*;

public class PresentaitionTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a variable :");
        int a = sc.nextInt();

        System.out.print("Enter value for b variable:");
        int b = sc.nextInt();

        int sum  = a + b;
        int diff = a - b;
        int multiply = a * b;
        float division =  (float) a/b;
        System.out.println("Result of addition a and b: " + sum);
        System.out.println("Result of subtraction a and b: " + diff);
        System.out.println("Result of multiplication a and b: " + multiply);
        System.out.println("Result of division a and b: " + division);

        sc.close();
    }
}
