package com.softserve.conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask2 {//Naming is not correct, better FindMaxNumber
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the first number");
        int first = Integer.parseInt(br.readLine());

        System.out.println("Input the second number");
        int second = Integer.parseInt(br.readLine());;

        System.out.println("Input the third number");
        int third = Integer.parseInt(br.readLine());

        int maxNumber = first;

        if ( maxNumber < second) {
            maxNumber = second;
        }
        else if ( maxNumber < third){
            maxNumber = third;
        }


        System.out.println("The maximum number of three entered numbers "
                    + first  + " , " + second + " , and " +
                    " is : " + maxNumber);
        System.out.println("Max is: " + maxNumber(first, second, third));
    }

    /**
     * Find the maximum number from three numbers
     * @param a first number
     * @param b second number
     * @param c third number
     * @return the maximum number
     */
    public static int maxNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
//Everything is correct but try to use methods for solving tasks, it will be more readable and understandable