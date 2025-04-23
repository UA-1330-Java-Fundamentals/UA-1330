package com.softserve.edu.hw11StringTask4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    private static final Pattern NAMES_PATTERN = Pattern.compile("^[A-Z][a-zA-Z]+(?:[ -][a-zA-Z]+)*$");

    public static boolean validate(InputNames input) {
        String name = input.getName();
        String surname = input.getSurname();

        boolean isNameValid = NAMES_PATTERN.matcher(name).matches();
        boolean isSurnameValid = NAMES_PATTERN.matcher(surname).matches();

        return isNameValid && isSurnameValid;
    }
}
