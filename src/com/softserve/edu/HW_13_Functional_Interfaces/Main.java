package com.softserve.edu.HW_13_Functional_Interfaces;

import java.time.LocalDate;
import java.util.function.BiFunction;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {


        //1. Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
        //Method encrypt should take a string and return coded string where every letter is moved
        // on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
        // return decoded value

        System.out.println("\n-----Task 1 ---------");

        String encrypted = encrypt("abcXYZ", 3);
        System.out.println("Encrypted: " + encrypted); // "defABC"


        String decrypted = decrypt(encrypted, 3);
        System.out.println("Decrypted: " + decrypted); // "abcXYZ"

        //2. Create method to validate date according to format "mm.dd.yy"
        System.out.println("\n-----Task 2 ---------");
        System.out.println("Date : 02.29.2023 " + validateDate("02.29.2023")); // false
        System.out.println("Date : 12.31.99 " + validateDate("12.31.99")); // true
        System.out.println("Date : 04.31.22 " + validateDate("04.31.22")); // false (квітень має 30 днів)


        //3. Create method which take year as a parameter and return true if year is a leap

        System.out.println("\n-----Task 3 ---------");


        System.out.println("Year 2020: " + isLeapYear(2020)); // true
        System.out.println("Year 2021: " +isLeapYear(2021)); // false
        System.out.println("Year 2000: " +isLeapYear(2000)); // true
        System.out.println("Year 1900: " +isLeapYear(1900)); // false


        //4. Create variable LocalDate birthday and set to that variable date your birthday.
        // Create method that take as a parameter object LocalDate and pring the day of the week
        //  and what was the day of the week after 6 months and what was the day of the week after
        //  12 months.

        System.out.println("\n-----Task 4 ---------");
        LocalDate birthday = LocalDate.of(2004, 8, 20);
        printDayOfWeekAfterMonths(birthday);

    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Функціональний інтерфейс для зсуву символа
    private static final BiFunction<Character, Integer, Character> shiftChar = (c, shift) -> {
        if (Character.isLetter(c)) {
            char base = Character.isUpperCase(c) ? 'A' : 'a';
            return (char) ((c - base + shift + 26) % 26 + base);
        }
        return c;
    };

    // Метод для шифрування
    public static String encrypt(String s, int n) {
        return s.chars()
                .mapToObj(c -> String.valueOf(shiftChar.apply((char) c, n)))
                .collect(Collectors.joining());
    }

    // Метод для дешифрування
    public static String decrypt(String s, int n) {
        return encrypt(s, -n);
    }

    public static boolean validateDate(String date) {
        String regex = "^(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.\\d{2}$";
        if (!Pattern.matches(regex, date)) {
            return false;
        }

        String[] parts = date.split("\\.");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return day <= daysInMonth[month - 1];
    }



    // Метод для виведення дня тижня для дати, через 6 місяців і 12 місяців
    public static void printDayOfWeekAfterMonths(LocalDate birthday) {
        System.out.println("Original day of the week: " + birthday.getDayOfWeek());
        System.out.println("Day of the week after 6 months: " + birthday.plusMonths(6).getDayOfWeek());
        System.out.println("Day of the week after 12 months: " + birthday.plusMonths(12).getDayOfWeek());
    }


}
