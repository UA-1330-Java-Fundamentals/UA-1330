package com.softserve.edu.HW2;
import java.util.Scanner;

public class MainMinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MinNumber number = new MinNumber();

        System.out.print("Input the first positive number: ");
        number.setNumber1(scan.nextInt());

        System.out.print("Input the second positive number: ");
        number.setNumber2(scan.nextInt());

        System.out.print("Input the third positive number: ");
        number.setNumber3(scan.nextInt());

        System.out.println("The smallest number is " + number.findSmallest());

    }
}
