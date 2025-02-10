package com.softserve.edu.HW3Lesson4ConditionStatements;



public class Faculty {


    public enum Season {
        WINTER("Winter Exams"),
        SPRING("Second Semester"),
        SUMMER("Vacation Period"),
        AUTUMN("First Semester");


        private final String description;

        Season(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    private int numberOfStudents;
    private Season currentSeason;


    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;

    }


    @Override
    public String toString() {
        return "Faculty: " +
                "numberOfStudents=" + numberOfStudents +
                ", currentSeason=" + currentSeason ;
    }
}
