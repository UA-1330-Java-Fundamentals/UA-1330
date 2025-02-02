package com.softserve.edu.hw1.practicaltasks;

import java.util.Scanner;

public class Calculation {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the number b: ");
        int b = scanner.nextInt();
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a/b;
        System.out.print("a + b = "+ addition + "\na - b = " + subtraction + "\na * b = " + multiplication + "\na / b = " + division);
        scanner.close();
    }
        }
