package com.softserve.edu.hw5;
import java.util.Scanner;


public class doWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;
        
        do { 
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
        System.out.println("Do you want to continue? yes/no");
        response = sc.next();
        } 
        while (response.equalsIgnoreCase("yes"));
        sc.close();
    }
}
