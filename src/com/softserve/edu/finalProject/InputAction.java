package com.softserve.edu.finalProject;

public enum InputAction {
    BUY,
    FILL,
    TAKE,
    REMAINING,
    CLEAN,
    EXIT;

    public static InputAction from(String input) {
        try {
            return InputAction.valueOf(input.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            return null; //
        }
    }
}
