package com.softserve.conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask2 {
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
    }
}
