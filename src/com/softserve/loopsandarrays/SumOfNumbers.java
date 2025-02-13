package com.softserve.loopsandarrays;

import java.util.Scanner;

public class SumOfNumbers {
    public static int[] enterNumbers(Scanner sc) {
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }
    public static String sumOrProductOfElements(int[] numbers) {
        double sum = 0;
        double product = 1;
        int  counter = 0;

        for (int i = 0; i < 5; i++){
          if(numbers[i] > 0){
              sum += numbers[i];
              counter ++;
          }
        }
        for (int j = 5; j < 10; j++){
            product *= numbers[j];
        }
        return (counter == 5)
                ?"We counted sum of first 5 numbers " + sum
                :"We counted product of last 5 numbers " + product;

    }

}