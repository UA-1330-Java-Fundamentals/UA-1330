/*
Write a program that prompts the user to input three float numbers.
The program should check if all three numbers fall within the range of -5 and 5 (inclusive).
If all three numbers are within this range,-
the program should output a message indicating that they belong to the range [-5, 5].
If any of the numbers are outside the specified range, -
the program should output a message indicating that not all numbers belong to the range [-5, 5].
Please note that the range includes the values -5 and 5 as well.
 */
package com.softserve.edu.HW4;
public class CheckNumbers {
    public static void checkNumberInRange(float number1, float number2, float number3) {
        if (((number1 >= -5) && (number1 <= 5)) && ((number2 >= -5) && (number2 <= 5)) && ((number3 >= -5) && (number3 <= 5))) {
            System.out.println("All entered numbers are in a range [-5, 5]");
        } else System.out.println("NOT all numbers are in a range [-5, 5]");
    }
}
