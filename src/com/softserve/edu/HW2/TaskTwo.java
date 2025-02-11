package com.softserve.edu.HW2;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Input the second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Input the third number: ");
        int n3 = scanner.nextInt();
        scanner.close();

        SmallestNumber finder = new SmallestNumber(n1, n2, n3);

        int smallestNumber = finder.findSmallest();

        System.out.println("The smallest number is " + smallestNumber);

        System.out.println("The smallest number is " + SmallestNumber.findSmallest(n1, n2, n3));




    }


}
