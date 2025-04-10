package com.softserve.edu.hw13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BirthdayModifier {
    public static void dayOfWeek(LocalDate birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE").localizedBy(Locale.UK);
        LocalDate plus6Month = birthday.plusMonths(6);
        LocalDate plus12month = birthday.plusMonths(12);
        System.out.println("Birthday is on " + birthday.format(formatter));
        System.out.println("6 months after birthday on " + plus6Month.format(formatter));
        System.out.println("12 months after birthday on  " + plus12month.format(formatter));
    }


    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1998, 2, 4);

       BirthdayModifier.dayOfWeek(birthday);
    }
}
