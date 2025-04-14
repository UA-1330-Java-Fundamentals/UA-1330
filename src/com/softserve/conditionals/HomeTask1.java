package com.softserve.conditionals;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask1 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number");
        int first = Integer.parseInt(br.readLine());

        System.out.println("Input the second number");
        int second = Integer.parseInt(br.readLine());;

        System.out.println("Input the third number");
        int third = Integer.parseInt(br.readLine());

        if ( (first > -5) && (first < 5)) {
            if ( (second > -5) && (second < 5)){
                if ( (third > -5) && (third < 5)){
                    System.out.println("All three entered numbers "
                            + first  + " ," + second + ", and  " +
                            third + " are in range [-5, 5]");
                }

            }
        }
        else {
            System.out.println("Some of entered numbers"
                    + first  + " ," + second + " , and  " +
                    " is not in range[-5, 5]");
        }
    }
}

//Check range for numbers [-5, 5] better to do with methods
class CheckNumbersInRange {

    static final int LEFT_BOUND = -5;
    static final int RIGHT_BOUND = 5;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)  throws IOException {
        System.out.println("Input the first number: ");
        int first = Integer.parseInt(br.readLine());

        System.out.println("Input the second number: ");
        int second = Integer.parseInt(br.readLine());

        System.out.println("Input the third number: ");
        int third = Integer.parseInt(br.readLine());

        checkNumbers(first, second, third);

    }

    /**
     * Check if number is in range
     * @param number number to check
     * @return true if number is in range
     */
    public static boolean isInRange(int number) {
        return number >= LEFT_BOUND && number <= RIGHT_BOUND;
    }
    /**
     *  Check if all three numbers are in range
     * @param first first number
     * @param second second number
     * @param third third number
     */
    public static void checkNumbers(int first, int second, int third) {
        if (isInRange(first) && isInRange(second) && isInRange(third)) {
            System.out.println("All three entered numbers " + first + ", " + second + ", and " + third + " are in range [-5, 5]");
        } else {
            System.out.println("Some of the entered numbers " + first + ", " + second + ", and " + third + " are not in range [-5, 5]");
        }
    }
}