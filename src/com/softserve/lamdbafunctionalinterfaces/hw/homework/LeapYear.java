package com.softserve.lamdbafunctionalinterfaces.hw.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class LeapYear {
    Scanner sc = new Scanner(System.in);

    public static void defineLeapYear(Scanner sc){
        System.out.print("Enter a year:");
        int enteredYear = sc.nextInt();
        if(enteredYear>0 && enteredYear < 2026 ){
            LocalDate yearChecked = LocalDate.ofYearDay(enteredYear,1);
            System.out.println ( "Is " + enteredYear +
                    " year a leap year : " + yearChecked.isLeapYear());
        }
        else {
            System.out.println("You've entered incorrect year");
        }
        sc.close();
    }
}
