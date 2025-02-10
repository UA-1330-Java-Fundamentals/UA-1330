package com.softserve.edu.less04.task4;

public class Faculty {
    private int numberOfStudents;
    private Seasons currentSeason;

    public Faculty() {
    }

    public Faculty(int numberOfStudents, Seasons currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Seasons getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Seasons currentSeason) {
        this.currentSeason = currentSeason;
    }

    public void printInfo() {
        System.out.println("Number of students: " + getNumberOfStudents());
        System.out.println("Season: " + Seasons.valueOf(getCurrentSeason().name()).getSeason());
    }
}
