package com.softserve.conditionals;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask1 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
