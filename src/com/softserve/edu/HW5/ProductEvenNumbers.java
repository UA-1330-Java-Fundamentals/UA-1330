package com.softserve.edu.HW5;
/*
calculate the product of all entered even numbers
(exclude 0 from even if entered by user).
 */
public class ProductEvenNumbers {
    public static int getProductOfEven(int[] numbersArray) {
        int i = 0;
        int product = 1;
        int isAssertTrue = 0;
        while (i < numbersArray.length) {
            if ((numbersArray[i] % 2 == 0) && (numbersArray[i] != 0)) {
                product = product * numbersArray[i];
                isAssertTrue = 1;
            }
            i++;
        }
        return product*isAssertTrue;
    }
}
