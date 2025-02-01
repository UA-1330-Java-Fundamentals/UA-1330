package com.softserve.edu.homework3_Inrpduction_to_OOP;

/*
Write  Java console application with method to find the smallest number among three integer numbers.
 */

import java.util.Scanner;

public class SmallestNumber {
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    private int number1, number2, number3;

    public int findSmallestNumber() {

        int min = number1;
        if (number2 < min) min = number2;
        if (number3 < min) min = number3;

//    Another variant for finding smallest number by using Math class
/*       int temp = Math.min(number1,number2);
         int min = Math.min(temp,number3); */

        return min;

    }

    public static void main(String[] args) {

        SmallestNumber number = new SmallestNumber();
        System.out.print("Please, input number 1 : ");
        Scanner scan = new Scanner(System.in);
        number.setNumber1(scan.nextInt());
        System.out.print("Please, input number 2 : ");
        number.setNumber2(scan.nextInt());
        System.out.print("Please, input number 3 : ");
        number.setNumber3(scan.nextInt());

        System.out.println(number.findSmallestNumber());
    }
}
