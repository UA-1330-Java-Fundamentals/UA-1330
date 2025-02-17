package com.softserve.edu.HW5;

import java.util.Arrays;

public class MainFiveNumbers {
    public static void main(String[] args) {
        int[] numbersArray = FiveNumbers.createArray();
        System.out.println(Arrays.toString(numbersArray));

        int position = FiveNumbers.getPositionSecondPositive(numbersArray);
        if (position == 0) {
            System.out.println("There is no 2-nd positive number");
        } else {
            System.out.println("Position of 2-nd positive number " + position);
        }

    }
}
