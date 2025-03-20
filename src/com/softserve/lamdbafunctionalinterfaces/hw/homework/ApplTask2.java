package com.softserve.lamdbafunctionalinterfaces.hw.homework;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class ApplTask2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input date in format mm.dd.yy:");
        String enteredDate = sc.nextLine();
        ValidateFormat.validateFormat(enteredDate);

        sc.close();
    }


}
