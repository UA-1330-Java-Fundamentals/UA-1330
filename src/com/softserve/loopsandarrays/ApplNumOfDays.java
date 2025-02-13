package com.softserve.loopsandarrays;
import java.util.Scanner;

public class ApplNumOfDays {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String result = NumberOfDays.numberOfDaysInMonth(sc, "Enter the number of month");
        System.out.println("The number of days is :" + result);

        sc.close();
    }
}
