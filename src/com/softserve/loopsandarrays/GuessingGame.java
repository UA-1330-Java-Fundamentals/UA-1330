package com.softserve.loopsandarrays;
import java.lang.Math;
import java.util.Scanner;

public class GuessingGame {

   public static int generateRandomNumber(){
       return (int)(Math.random() * 10);
   }
    public static String compareTwoNumbers(int a, int b){
        if  (a > b) {
            return "Too high, try again";
        } else if (a < b) {
            return "Too low, try again";
        }
        return "Numbers are equal";
    }
    public static int enterNumber(Scanner sc,String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }
}
