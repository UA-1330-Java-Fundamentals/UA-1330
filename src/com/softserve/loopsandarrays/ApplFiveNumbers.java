package com.softserve.loopsandarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ApplFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] fiveNumbersArray = new int[5];

        fiveNumbersArray = FiveNumbers.enterNumbers(sc);

        String elements = Arrays.toString(fiveNumbersArray);
        System.out.println("I entered next numbers :" + elements );

        String secondPositiveElement = FiveNumbers.secondPositive(fiveNumbersArray);
        System.out.println(secondPositiveElement);

        String maxValueOfArray = FiveNumbers.maxValueAndPosition(fiveNumbersArray);
        System.out.println(maxValueOfArray);

        double productValue  = FiveNumbers.productOfElements(fiveNumbersArray);
        System.out.println("The array product value is " + productValue);

        sc.close();
    }

}
