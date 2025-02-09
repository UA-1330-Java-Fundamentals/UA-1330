package com.softserve.edu.homework_4;

public class RangeChecker {
    public static String checkNumberInRange(float firstNumber, float secondNumber, float thirdNumber) {
        if (((firstNumber >= -5) && (firstNumber <= 5))
                && ((secondNumber >= -5) && (secondNumber <= 5))
                && ((thirdNumber >= -5) && (thirdNumber <= 5))) {
            return "\nAll three numbers belong to the range [-5; 5].";
        } else {
            return "\nNot all three numbers belong to the range [-5; 5].";
        }
    }
}
