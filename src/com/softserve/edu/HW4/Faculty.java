/*
Create a class named Faculty and input the information about the number of students (using the console)
and the current season (using enum).
Each season must have a name in English (use the constructor).
In the main() method, check the correctness of the code.
Here, a season can signify a time of year (winter, spring, summer, autumn).
In the context of this task, it can correspond to a certain semester.
For example, autumn could be the first semester,
spring - the second, and summer - the vacation period.
Winter may correspond to the period of winter exams.

 */

package com.softserve.edu.HW4;

public class Faculty {
    private int numberOfStudents;
    private Season inputSeason;

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getInputSeason() {
        return inputSeason;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    //To verify and if is in ENUM list - set the season
    public boolean isEnteredSeasonCorrect(String name) {
        name = name.toUpperCase();
        for (Season season: Season.values()) {
            if (season.getName().equals(name)) {
                this.inputSeason = season;
                return true;
            }
        }
        return false;
    }

    public enum Season {
        WINTER("WINTER"),
        SPRING("SPRING"),
        SUMMER("SUMMER"),
        AUTUMN("AUTUMN");

        private final String name;

        Season(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static String getSemesterBySeason(String name) {
                return switch (name.toUpperCase()) {
                    case "WINTER" -> "the period of winter exams";
                    case "SPRING" -> "the second semester";
                    case "SUMMER" -> "the vacation period";
                    case "AUTUMN" -> "the first semester";
                    default -> "You entered incorrect Season name";
                };
        }
    }
}

