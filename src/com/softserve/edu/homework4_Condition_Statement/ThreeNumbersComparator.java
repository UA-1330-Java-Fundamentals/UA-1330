package com.softserve.edu.homework4_Condition_Statement;

import java.util.Scanner;

public class ThreeNumbersComparator {
    private int number1, number2, number3;
    private int min, max;

    public void setNumber1(int number1) {
        this.number1 = number1;
        min = number1;
        max = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
        if (number2 < min) {
            min = number2;
        }
        if (number2 > max) {
            max = number2;
        }
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
        if (number3 < min) {
            min = number3;
        }
        if (number3 > max) {
            max = number3;
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public void getMinAndMaxNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, input number 1 : ");
        setNumber1(scan.nextInt());
        System.out.print("Please, input number 2 : ");
        setNumber2(scan.nextInt());
        System.out.print("Please, input number 3 : ");
        setNumber3(scan.nextInt());

        System.out.println("Min value = " + getMin() + " Max value = " + getMax());
    }

    public static void main(String[] args) {
        ThreeNumbersComparator compare = new ThreeNumbersComparator();
        compare.getMinAndMaxNumbers();
    }
}
