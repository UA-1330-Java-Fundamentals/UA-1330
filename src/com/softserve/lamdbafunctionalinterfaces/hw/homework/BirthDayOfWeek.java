package com.softserve.lamdbafunctionalinterfaces.hw.homework;

import java.time.LocalDate;

public class BirthDayOfWeek {
    public static void defineBirthDayOfWeek(){
        LocalDate myBirthday =  LocalDate.of(1985,10,1);
        System.out.println("My birthday " + myBirthday + " was at " + myBirthday.getDayOfWeek() + " day of week");
        LocalDate bitrthdateInSixMonth = myBirthday.minusMonths(6);
        System.out.println("Day of the week after 6 months of my Birthday is:" + bitrthdateInSixMonth.getDayOfWeek());
        LocalDate bitrthdateInTwelveMonth = myBirthday.plusMonths(6);
        System.out.println("Day of the week after 12 months of my Birthday is: " + bitrthdateInTwelveMonth.getDayOfWeek());
    }
}
