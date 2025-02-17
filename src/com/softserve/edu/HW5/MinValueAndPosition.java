package com.softserve.edu.HW5;

public class MinValueAndPosition {
    int min;
    int imin;

    public MinValueAndPosition(int min, int imin) {
        this.min = min;
        this.imin = imin;
    }

    public static MinValueAndPosition getminValue (int[] numbersArray) {
        int min = numbersArray[0];
        int imin = 1;
        int i = 0;
        while (i < numbersArray.length) {
            if (numbersArray[i] < min) {
                min = numbersArray[i];
                imin = i+1;
            }
            i++;
        }
        return new MinValueAndPosition(min, imin);
    }
}
