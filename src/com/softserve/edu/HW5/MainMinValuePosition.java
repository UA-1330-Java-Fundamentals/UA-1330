package com.softserve.edu.HW5;

import java.util.Arrays;

public class MainMinValuePosition {


    public static void main(String[] args) {
        int[] numbersArray = FiveNumbers.createArray();
        System.out.println(Arrays.toString(numbersArray));

        MinValueAndPosition minObject = MinValueAndPosition.getminValue(numbersArray);
        System.out.println("Minimum value " + minObject.min + " and its position is " + minObject.imin);

    }

}
