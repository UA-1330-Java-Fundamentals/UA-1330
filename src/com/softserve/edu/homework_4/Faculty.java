package com.softserve.edu.homework_4;

public class Faculty {
    private final int studentsAmount;
    private final Season season;

    public enum Season {
        WINTER("Winter exams"),
        SPRING("Second semester"),
        SUMMER("Vacation period"),
        AUTUMN("First semester");

        private final String description;

        Season(String description) {
            this.description = description;
        }
    }

    public Faculty(int studentsAmount, Season season) {
        this.studentsAmount = studentsAmount;
        this.season = season;
    }

    @Override
    public String toString() {
        return "Faculty: " +
                "number of students = " + studentsAmount +
                ", season = " + season.description;
    }
}
