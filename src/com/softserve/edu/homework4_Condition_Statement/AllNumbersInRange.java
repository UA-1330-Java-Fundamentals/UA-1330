package com.softserve.edu.homework4_Condition_Statement;

import java.util.Scanner;

/*
Write a program that prompts the user to input three float numbers. The program should check if all three numbers
fall within the range of -5 and 5 (inclusive). If all three numbers are within this range, the program should
output a message indicating that they belong to the range [-5, 5]. If any of the numbers are outside the
specified range, the program should output a message indicating that not all numbers belong to the range [-5, 5].
Please note that the range includes the values -5 and 5 as well
 */
public class AllNumbersInRange {
    private float number1, number2, number3;

    private void setNumber3(float v) {
        this.number3 = v;
    }

    private void setNumber2(float v) {
        this.number2 = v;
    }

    private void setNumber1(float v) {
        this.number1 = v;
    }

    public void checkThreeNumbersInRange() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, input number 1 : ");
        setNumber1(scan.nextFloat());
        System.out.print("Please, input number 2 : ");
        setNumber2(scan.nextFloat());
        System.out.print("Please, input number 3 : ");
        setNumber3(scan.nextFloat());

        if ((number1 >= -5 && number1 <= 5) && (number2 >= -5 && number2 <= 5) && (number3 >= -5 && number3 <= 5)) {
            System.out.println("All three numbers (" + number1 + " ," + number2 + " and " + number3 + ") are in range [-5;5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }

    public static void main(String[] args) {

        AllNumbersInRange number = new AllNumbersInRange();
        number.checkThreeNumbersInRange();

    }


}
