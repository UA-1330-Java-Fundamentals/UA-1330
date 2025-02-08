package com.softserve.edu.hw3;
import java.util.Scanner;

public class SmallestNum {
    
    public static int getSmallestNum(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number to compare: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number to compare: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the 3rd number to compare: ");
        int num3 = sc.nextInt();

        System.out.println("The smallest number is: " + getSmallestNum(num1, num2, num3));
    }
}
