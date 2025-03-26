package homework13;

import java.time.LocalDate;

/*
Create variable LocalDate birthday and set to that variable date your birthday.
Create method that take as a parameter object LocalDate and print the day of the week
and what was the day of the week after 6 months and what was the day of the week after
12 months.
 */
public class BirthdayCalendar {

    static void dayOfWeek(LocalDate date){
        System.out.println("Birthday was on: " + date.getDayOfWeek());
        System.out.println("Day of the week 6 months after birthday: " + date.plusMonths(6).getDayOfWeek());
        System.out.println("Day of the week 12 months after birthday: " + date.plusMonths(12).getDayOfWeek());
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1996, 10, 18);
        dayOfWeek(birthday);

    }
}
