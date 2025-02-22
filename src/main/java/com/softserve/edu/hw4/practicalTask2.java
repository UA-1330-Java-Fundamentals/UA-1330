package com.softserve.edu.hw4;

import java.util.Scanner;

public class practicalTask2 {
    public enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day of the week, from 1 to 7: ");
        int inputDay = sc.nextInt();
        WeekDay day;

        switch (inputDay) {
            case 1:
                day = WeekDay.MONDAY;
                break;
            case 2:
                day = WeekDay.TUESDAY;
                break;
            case 3:
                day = WeekDay.WEDNESDAY;
                break;
            case 4:
                day = WeekDay.THURSDAY;
                break;
            case 5:
                day = WeekDay.FRIDAY;
                break;
            case 6:
                day = WeekDay.SATURDAY;
                break;
            case 7:
                day = WeekDay.SUNDAY;
                break;
            default:
                day = null;
                break;
        }


        if (day != null) {
            System.out.println("The day is: " + day);
        } else {
            System.out.println("Invalid day. Please enter a number from 1 to 7.");
        }

        sc.close();
    }
}