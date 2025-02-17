package com.softserve.edu.HW5;

import java.util.Arrays;
import java.util.Scanner;

public class MainSumAndProduct {
    public static void main(String[] args) {
        int[] numbersArray = GetSumAndProduct.createArray();
        System.out.println(Arrays.toString(numbersArray));

        if (GetSumAndProduct.checkOnPositive(numbersArray)) {
            System.out.println("Sum of first 5 numbers: " + GetSumAndProduct.getSumOrProduct(numbersArray));
        } else {
            //when first 5 numbers are not all positive
            System.out.println("Product of last 5 numbers: " + GetSumAndProduct.getSumOrProduct(numbersArray));
        }
    }
}