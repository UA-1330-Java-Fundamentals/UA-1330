package com.softserve.edu.less04.task1;

import java.util.Scanner;
//1
public class FloatNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the double number in the range [-5, 5]");
        double number = sc.nextDouble();
        if (number >= -5 && number <= 5) {
            System.out.println("The number is " + number + "\nIt belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
        sc.close();
    }
}
