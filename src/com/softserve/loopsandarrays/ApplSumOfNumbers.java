package com.softserve.loopsandarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ApplSumOfNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] myNumbersArray = new int[10];
        myNumbersArray  = SumOfNumbers.enterNumbers(sc);
        String elements = Arrays.toString(myNumbersArray);
        System.out.println("I entered next numbers :" + elements );

        String sumOrProductResult = SumOfNumbers.sumOrProductOfElements(myNumbersArray);
        System.out.println(sumOrProductResult);
        sc.close();
    }
}
