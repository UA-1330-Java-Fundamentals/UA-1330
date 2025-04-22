package com.softserve.edu.less05.task2;

import java.util.Scanner;

/*
Create a do-while loop that prompts the user to enter two numbers and calculates their
sum. After displaying the result, the program should ask the user if they want to perform
the operation again. If the user inputs a positive response, the loop should repeat;
otherwise, it should terminate.
*/
public class CalcTheSum {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        boolean isContinue = false;
        do {
            sum += promptParameters();
            sum += promptParameters();
            System.out.println("result of sum = " + sum);
            String resultUsers = promptParametersLine();
            if(resultUsers.equalsIgnoreCase("y")) {
                isContinue = true;
            } else {
                isContinue = false;
            }
        } while (isContinue);
        SCANNER.close();
    }

    /**
     * Prompt the user to enter 2 integer numbers
     *
     * @return the number
     */
    public static int promptParameters() {
        System.out.println("Please, enter int 2 number : ");
        return SCANNER.nextInt();
    }

    /**
     *
     * @return text of users
     */
    public static String promptParametersLine() {
        System.out.println("Are you sure you want to continue? (y/n)");
        return SCANNER.next();
    }
}
