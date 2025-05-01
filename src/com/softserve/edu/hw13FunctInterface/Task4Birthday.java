package com.softserve.edu.hw13FunctInterface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task4Birthday {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1983, 9, 28);
        defineDayOfWeek(birthday);
    }

    public static void defineDayOfWeek(LocalDate date) {
        System.out.println("Birthday: " + date);
        System.out.println("Day of the week on birthday: " + date.getDayOfWeek());

        //definition the week day after adding 6 month
        LocalDate plusSixMonth = date.plusMonths(6);
        System.out.println("Day of the week after 6 month " + plusSixMonth.getDayOfWeek());

        //definition the week day after adding 12 month
        LocalDate plusTwelveMonth = date.plusMonths(12);
        System.out.println("Day of the week after 12 month " + plusTwelveMonth.getDayOfWeek());
    }
}
