package com.softserve.edu.HW5;

import java.util.Arrays;

public class MainProductEvenNumbers {
    public static void main(String[] args) {
        int[] numbersArray = FiveNumbers.createArray();
        System.out.println(Arrays.toString(numbersArray));

        int product = ProductEvenNumbers.getProductOfEven(numbersArray);
        System.out.println("A product of even numbers in array excluded the 0 is: " + product);

    }
}
